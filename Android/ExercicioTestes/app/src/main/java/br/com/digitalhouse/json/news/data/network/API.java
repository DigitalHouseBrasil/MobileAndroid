package br.com.digitalhouse.json.news.data.network;

import br.com.digitalhouse.json.news.model.NewsResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface API {

    @GET("bins/y7jl6")
    Observable<NewsResponse> getRemoteNews();
}

