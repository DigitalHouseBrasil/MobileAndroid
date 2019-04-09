package br.com.digitalhouse.json.news.data.local;

import android.content.Context;
import android.content.res.AssetManager;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import br.com.digitalhouse.json.news.model.News;
import br.com.digitalhouse.json.news.model.NewsResponse;
import io.reactivex.Observable;

public class NewsLocalRepository {

    public Observable<List<News>> getLocalNews(Context context) {
        try {

            AssetManager assetManager = context.getAssets();
            InputStream newJson = assetManager.open("news.json");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(newJson));

            Gson gson = new Gson();

            NewsResponse newsResponse = gson.fromJson(bufferedReader, NewsResponse.class);

            return Observable.just(newsResponse.getNewsList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
