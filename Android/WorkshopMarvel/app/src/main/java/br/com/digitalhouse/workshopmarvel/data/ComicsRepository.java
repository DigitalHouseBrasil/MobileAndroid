package br.com.digitalhouse.workshopmarvel.data;

import br.com.digitalhouse.workshopmarvel.model.ComicsResponse;
import io.reactivex.Single;

import static br.com.digitalhouse.workshopmarvel.data.network.ApiService.PRIVATE_KEY;
import static br.com.digitalhouse.workshopmarvel.data.network.ApiService.PUBLIC_KEY;
import static br.com.digitalhouse.workshopmarvel.data.network.ApiService.getApiService;
import static br.com.digitalhouse.workshopmarvel.utils.AppUtils.md5;

public class ComicsRepository {

    public Single<ComicsResponse> getComics() {
        String ts = Long.toString(System.currentTimeMillis() / 1000);
        String hash = md5(ts + PRIVATE_KEY + PUBLIC_KEY);
        return getApiService().getComics("magazine", "comic", true, "focDate", "50", ts, hash, PUBLIC_KEY);
    }
}
