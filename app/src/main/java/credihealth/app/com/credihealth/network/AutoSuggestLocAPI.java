package credihealth.app.com.credihealth.network;

import java.util.Map;
import credihealth.app.com.credihealth.models.auto_suggest.auto_suggest_loc.AutoSuggestLoc;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.QueryMap;

/**
 * Created by sheelu on 4/9/15.
 */
public interface AutoSuggestLocAPI {
    @GET("/api/v2/location_auto_suggest")
    public void getData(@QueryMap Map<String, String> params, Callback<AutoSuggestLoc> response);


}
