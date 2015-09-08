package credihealth.app.com.credihealth.network;


import java.util.Map;

import credihealth.app.com.credihealth.models.auto_suggest.auto_suggest_health.AutoSuggestHealth;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.QueryMap;

public interface AutoSuggestHealthAPI {
    @GET("/api/v2/auto_suggest")
    public void getData(@QueryMap Map<String, String> params, Callback<AutoSuggestHealth> response);

}
