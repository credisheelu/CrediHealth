package credihealth.app.com.credihealth.listeners;

import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.SearchView;

import credihealth.app.com.credihealth.activities.MainActivity;

/**
 * Created by sheelu on 5/9/15.
 */
public class AutoSuggestLocListener implements SearchView.OnQueryTextListener {
   MainActivity activity;
    public AutoSuggestLocListener(MainActivity activity)
    {
        this.activity=activity;
    }
    @Override
    public boolean onQueryTextSubmit(String s) {
        activity.getSearchviewLoc().clearFocus();
        return true;
    }

    @Override
    public boolean onQueryTextChange(String s) {

        if(s.length()==0)
            activity.getSupportActionBar().show();
       if(s.length()>=1) {
           activity.getSupportActionBar().hide();
           if (s.length() >= 2) {

               MainActivity.getFirstFragment().autoSuggestLoc(s, "5");
           }

       }
        return false;
    }
}
