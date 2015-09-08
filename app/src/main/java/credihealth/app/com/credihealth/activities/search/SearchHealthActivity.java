package credihealth.app.com.credihealth.activities.search;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import credihealth.app.com.credihealth.models.doctor.DoctorSearch;
import credihealth.app.com.credihealth.models.doctor.Search;
import credihealth.app.com.credihealth.network.DoctorAPI;
import retrofit.RestAdapter;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import credihealth.app.com.credihealth.adapters.DoctorSearchAdapter;
import retrofit.Callback;

import retrofit.RetrofitError;
import retrofit.client.Response;

import credihealth.app.com.credihealth.R;


public class SearchHealthActivity extends Activity {
DoctorSearch doctor;
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.doctor_search_list);
      //  listview=(ListView)findViewById(R.id.doctor_search_listview);
        handleIntent(getIntent());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            String city="Delhi NCR";
            String type="Doctors";
            String sort ="Experience";
            searchDoctor(query, city, type, sort);


        }

    }

    public void searchDoctor(final String query,String city,String type,String sort)
    {
        final RestAdapter restadapter = new RestAdapter.Builder().
                setEndpoint("http://www.credihealth.com").setLogLevel(RestAdapter.LogLevel.FULL).
            build();

        final DoctorAPI doctor_api = restadapter.create(DoctorAPI.class);
        Map<String, String> params = new HashMap<String, String>();
        params.put("q",query);
        params.put("city",city);
        params.put("type",type);
        params.put("sort",sort);
        doctor_api.getData(params,new Callback<DoctorSearch>() {

            @Override
            public void success(DoctorSearch doctorSearch, Response response) {
                doctor=doctorSearch;
                List<Search> searchlist=doctor.getSearch();
                Log.v("Response",""+response.getUrl());
               // DoctorSearchAdapter adapt = new DoctorSearchAdapter(getApplicationContext(), R.layout.doctor_search_view,searchlist);
               //   listview.setAdapter(adapt);
            }

            @Override
            public void failure(RetrofitError error) {
                Log.v("Error"+query,error.getMessage()+"  "+error.getUrl());
                Toast.makeText(getApplicationContext(), "Failed"+error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


    }

}
