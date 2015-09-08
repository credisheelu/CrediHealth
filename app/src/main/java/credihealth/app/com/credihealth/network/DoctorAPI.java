package credihealth.app.com.credihealth.network;

import java.util.Map;

import credihealth.app.com.credihealth.models.doctor.DoctorSearch;
import retrofit.http.GET;
import retrofit.Callback;
import retrofit.http.Query;
import retrofit.http.QueryMap;

/**
 * Created by sheelu on 31/8/15.
 */

public interface DoctorAPI {
    @GET("/api/v2/search")
    public void getData(@QueryMap Map<String, String> params,Callback<DoctorSearch> response);


}
