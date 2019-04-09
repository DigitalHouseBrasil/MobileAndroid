package br.com.digitalhouse.json.news.data.network;

import java.util.List;

import br.com.digitalhouse.json.news.model.News;
import br.com.digitalhouse.json.news.model.NewsResponse;
import io.reactivex.Observable;

public class NewsRemoteRepository {

    public Observable<NewsResponse> getRemoteNews() {
        return RetrofitService.getApiService().getRemoteNews();
    }
}
