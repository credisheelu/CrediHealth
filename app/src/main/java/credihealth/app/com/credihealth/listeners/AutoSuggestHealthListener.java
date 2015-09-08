package credihealth.app.com.credihealth.listeners;

import android.app.SearchManager;
import android.widget.SearchView;

import credihealth.app.com.credihealth.activities.MainActivity;

/**
 * Created by sheelu on 5/9/15.
 */
public class AutoSuggestHealthListener implements SearchView.OnQueryTextListener {
    MainActivity activity;

    public AutoSuggestHealthListener(MainActivity activity) {
        this.activity=activity;

    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        String query = s;
        String city="Delhi NCR";
        String type="Doctors";
        String sort ="Experience";
        MainActivity.getSearchViewHealth().clearFocus();
        MainActivity.getFirstFragment().getDoctorSearchListing(s,city,type,sort);
        return true;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        if(s.length()==0)
            activity.getSupportActionBar().show();
        if(s.length()>=1) {
            activity.getSupportActionBar().hide();
            if (s.length() >= 2) {
                MainActivity.getFirstFragment().autoSuggestHealth(s, "New Delhi", "5");
            }
        }
        return false;
    }
}
