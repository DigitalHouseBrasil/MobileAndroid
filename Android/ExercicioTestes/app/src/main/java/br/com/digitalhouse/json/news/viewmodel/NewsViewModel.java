package br.com.digitalhouse.json.news.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.util.Log;

import java.util.List;

import br.com.digitalhouse.json.news.data.local.NewsLocalRepository;
import br.com.digitalhouse.json.news.data.network.NewsRemoteRepository;
import br.com.digitalhouse.json.news.model.News;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class NewsViewModel extends AndroidViewModel {

    private MutableLiveData<List<News>> newsLiveData = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();

    public NewsViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<List<News>> getNewsLiveData() {
        return newsLiveData;
    }

    public void getNews() {
        if (isNetworkConnected(getApplication())) {
            getFromNetwork();
        } else {
            getFromLocal();
        }
    }

    private void getFromLocal() {
        NewsLocalRepository newsLocalRepository = new NewsLocalRepository();

        disposable.add(newsLocalRepository.getLocalNews(getApplication().getApplicationContext())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe((List<News> news) -> {
                    newsLiveData.setValue(news);
                }, throwable -> {
                    Log.i("LOG", "Error: " + throwable.getMessage());
                }));
    }

    private void getFromNetwork() {
        NewsRemoteRepository newsRemoteRepository = new NewsRemoteRepository();

        disposable.add(newsRemoteRepository.getRemoteNews()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(newsResponse -> {
                    newsLiveData.setValue(newsResponse.getNewsList());
                }, throwable -> {
                    Log.i("LOG", "Error: " + throwable.getMessage());
                }));
    }

    private boolean isNetworkConnected(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo;

        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
            return networkInfo != null && networkInfo.isConnected() &&
                    (networkInfo.getType() == ConnectivityManager.TYPE_WIFI
                            || networkInfo.getType() == ConnectivityManager.TYPE_MOBILE);
        }
        return false;
    }
}
