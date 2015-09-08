package credihealth.app.com.credihealth.activities.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import credihealth.app.com.credihealth.R;
import credihealth.app.com.credihealth.activities.MainActivity;
import credihealth.app.com.credihealth.adapters.AutoSuggestAdapter;
import credihealth.app.com.credihealth.adapters.DoctorSearchAdapter;
import credihealth.app.com.credihealth.models.auto_suggest.auto_suggest_health.AutoSuggestHealth;
import credihealth.app.com.credihealth.models.auto_suggest.auto_suggest_health.Doctor;
import credihealth.app.com.credihealth.models.auto_suggest.auto_suggest_health.Hospital;
import credihealth.app.com.credihealth.models.auto_suggest.auto_suggest_health.Speciality;
import credihealth.app.com.credihealth.models.auto_suggest.auto_suggest_loc.AutoSuggestLoc;
import credihealth.app.com.credihealth.models.auto_suggest.auto_suggest_loc.LocationSearch;
import credihealth.app.com.credihealth.models.doctor.DoctorSearch;
import credihealth.app.com.credihealth.models.doctor.Search;
import credihealth.app.com.credihealth.network.AutoSuggestHealthAPI;
import credihealth.app.com.credihealth.network.AutoSuggestLocAPI;
import credihealth.app.com.credihealth.network.DoctorAPI;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private RecyclerView mrecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    View layout;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.home_fragment_layout, container, false);

        mrecyclerView = (RecyclerView) layout.findViewById(R.id.my_recycler_view);

        mAdapter = new AutoSuggestAdapter(new String[]{""},null);

        mrecyclerView.setAdapter(mAdapter);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

                mrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                mrecyclerView.setItemAnimator(new DefaultItemAnimator());

        return layout;

    }

    public void autoSuggestLoc(final String loc,String limit)
    {
        final RestAdapter restadapter = new RestAdapter.Builder().
                setEndpoint("http://www.credihealth.com").setLogLevel(RestAdapter.LogLevel.FULL).
                build();

        final AutoSuggestLocAPI auto_suggest_loc_api = restadapter.create(AutoSuggestLocAPI.class);
        Map<String, String> params = new HashMap<String, String>();
        params.put("loc", loc);
        params.put("limit", limit);
        auto_suggest_loc_api.getData(params, new Callback<AutoSuggestLoc>() {

            @Override
            public void success(AutoSuggestLoc autoSuggestLoc, Response response) {

                List<LocationSearch> locations = autoSuggestLoc.getLocationSearch();
                Iterator itr = locations.iterator();
                String d[] = new String[locations.size()];
                int i = 0;
                while (itr.hasNext()) {
                    LocationSearch loc = (LocationSearch) itr.next();
                    d[i] = loc.getFullTitle();
                    i++;

                }


                mAdapter = new AutoSuggestAdapter(d, "Location");
                mrecyclerView.setAdapter(mAdapter);
                mrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

    public void getDoctorSearchListing(final String query,String city,String type,String sort)
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

                List<Search> searchlist=doctorSearch.getSearch();
                Log.v("Response",""+response.getUrl());
                mAdapter = new DoctorSearchAdapter(MainActivity.getMainContext(),searchlist);
                mrecyclerView.setAdapter(mAdapter);
                mrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


            }

            @Override
            public void failure(RetrofitError error) {
                Log.v("Error" + query, error.getMessage() + "  " + error.getUrl());
                //Toast.makeText(getApplicationContext(), "Failed" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


    }


    public void autoSuggestHealth(final String query,String city,String limit)
       {

        final RestAdapter restadapter = new RestAdapter.Builder().
                setEndpoint("http://www.credihealth.com").setLogLevel(RestAdapter.LogLevel.FULL).
                build();

        final AutoSuggestHealthAPI auto_suggest_health_api = restadapter.create(AutoSuggestHealthAPI.class);
        Map<String, String> params = new HashMap<String, String>();
        params.put("q",query);
        params.put("city",city);
        params.put("limit", limit);
        auto_suggest_health_api.getData(params, new Callback<AutoSuggestHealth>() {

            @Override
            public void success(AutoSuggestHealth autoSuggestHealth, Response response) {

                List<Hospital> hospitals=autoSuggestHealth.getHospitals();
                List<Speciality> specialities=autoSuggestHealth.getSpecialities();
                Log.v("DOc","dwsdf");
                List<Doctor> doctors=autoSuggestHealth.getDoctors();
                Log.v("DOc","dwsdf");
                Iterator itr=specialities.iterator();

                String d[]=new String[hospitals.size()+specialities.size()+doctors.size()+2];
                Log.v("DOc","dwsdf");
                int i=0;
                d[i]="Doctors";
                i++;
                while(itr.hasNext())
                {
                    Speciality sp=(Speciality)itr.next();

                    d[i]=sp.getTitle();
                    i++;
                }
                if(!doctors.isEmpty()) {
                    Log.v("DOc","dwsdf");
                    itr = doctors.iterator();
                    Log.v("DOc","dwsdf");
                    while (itr.hasNext()) {
                        Doctor doctor = (Doctor)itr.next();
                        d[i] = doctor.getFullName() + "(" + doctor.getSpeciality() + ")";
                        i++;
                    }
                }
                d[i]="Hospitals";
                i++;
                itr=hospitals.iterator();
                while(itr.hasNext())
                {
                    Hospital hos=(Hospital)itr.next();
                    d[i]=hos.getName();
                    i++;

                }
                mAdapter = new AutoSuggestAdapter(d,"Health");
                mrecyclerView.setAdapter(mAdapter);
                mrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

            }

            @Override
            public void failure(RetrofitError error) {
                Log.v("Error" + query, error.getMessage() + "  " + error.getUrl());
                //Toast.makeText(getApplicationContext(), "Failed" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


    }

}
