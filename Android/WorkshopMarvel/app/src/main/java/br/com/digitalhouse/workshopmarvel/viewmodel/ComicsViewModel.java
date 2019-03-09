package br.com.digitalhouse.workshopmarvel.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;
import android.util.Log;

import java.util.List;

import br.com.digitalhouse.workshopmarvel.data.ComicsRepository;
import br.com.digitalhouse.workshopmarvel.model.Result;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class ComicsViewModel extends AndroidViewModel {

    // Variáveis que serão usadas para buscar os quadrinhos na API
    private MutableLiveData<List<Result>> _resultLiveData = new MutableLiveData<>();
    private MutableLiveData<Boolean> _loading = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();
    private ComicsRepository repository = new ComicsRepository();

    // Construtor padrão do viewmodel
    public ComicsViewModel(@NonNull Application application) {
        super(application);
    }


    public LiveData<List<Result>> getResults() {
        return _resultLiveData;
    }

    public LiveData<Boolean> isLoasing(){
        return _loading;
    }

    public void getComics() {

        // Adicionamos a chamada a um disposible para podermos eliminar o disposable da destruição do viewmodel
        disposable.add(repository.getComics()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(disposable1 -> _loading.setValue(true))
                .doAfterTerminate(() -> _loading.setValue(false))
                .subscribe(response -> {
                    // Chegou aqui então alteramos o live data, assim a View que está observando ele pode atualizar a tela
                    _resultLiveData.setValue(response.getData().getResults());
                }, throwable -> {
                    Log.i("LOG", "Error: " + throwable.getMessage());
                }));
    }
}
