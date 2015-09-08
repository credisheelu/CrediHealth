package credihealth.app.com.credihealth.activities;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.Toast;
import credihealth.app.com.credihealth.R;
import credihealth.app.com.credihealth.activities.fragment.HomeFragment;
import credihealth.app.com.credihealth.activities.fragment.FragmentDrawer;
import credihealth.app.com.credihealth.listeners.AutoSuggestHealthListener;
import credihealth.app.com.credihealth.listeners.AutoSuggestLocListener;


public class MainActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener {
    private LinearLayout containerToolbar;
    private Toolbar mToolbar;
    private FragmentDrawer drawerFragment;
    private static HomeFragment firstFragment;
    private static SearchView searchViewHealth,searchviewLoc;
    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=getApplicationContext();
        searchviewLoc=(SearchView)findViewById(R.id.search_location);
        searchViewHealth = (SearchView) findViewById(R.id.search_all);
        containerToolbar=(LinearLayout)findViewById(R.id.container_toolbar);

        /*search manager
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchViewHealth.setSearchableInfo(searchManager.getSearchableInfo(
                new ComponentName("credihealth.app.com.credihealth",
                        "credihealth.app.com.credihealth.activities.search.SearchHealthActivity")));
          */

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        drawerFragment = (FragmentDrawer) getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        drawerFragment.setDrawerListener(this);
        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
        if (findViewById(R.id.container_body) != null) {

            // However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (savedInstanceState != null) {
                return;
            }
            // Create a new Fragment to be placed in the activity layout
            firstFragment = new HomeFragment();

            // In case this activity was started with special instructions from an
            // Intent, pass the Intent's extras to the fragment as arguments
            firstFragment.setArguments(getIntent().getExtras());

            // Add the fragment to the 'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container_body, firstFragment).commit();

        }

        searchViewHealth.setOnQueryTextListener(new AutoSuggestHealthListener(this));
        searchviewLoc.setOnQueryTextListener(new AutoSuggestLocListener(this));

       searchViewHealth.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               getSupportActionBar().hide();
               searchViewHealth.setIconified(false);
           }
       });



    }

    @Override
    protected void onPause() {
        finish();
        super.onPause();


    }


    public LinearLayout getContainerToolbar()
    {
        return  containerToolbar;
    }

    public static Context getMainContext()
    {
        return  context;
    }
    public static HomeFragment getFirstFragment()
    {
        return firstFragment;
    }

    public static SearchView getSearchviewLoc()
    {
        return  searchviewLoc;
    }
    public Toolbar getToolbar()
    {
        return mToolbar;
    }

    public static SearchView getSearchViewHealth(){return searchViewHealth;}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
       /* if(id==R.id.action_search)
        {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show();
        }*/

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDrawerItemSelected(View view, int position) {

    }


}