package credihealth.app.com.credihealth.adapters;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import credihealth.app.com.credihealth.R;
import credihealth.app.com.credihealth.activities.MainActivity;

/**
 * Created by sheelu on 3/9/15.
 */
public class AutoSuggestAdapter extends RecyclerView.Adapter<AutoSuggestAdapter.ViewHolder>  {
    private String[] mDataset;
    private String TypeOfAutoSuggest;



    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ViewHolder(View v) {
            super(v);
            this.mTextView = (TextView)v.findViewById(R.id.textView);
        }


    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public AutoSuggestAdapter(String[] myDataset,String TypeOfAutoSuggest) {
        this.TypeOfAutoSuggest=TypeOfAutoSuggest;
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AutoSuggestAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.auto_suggest_view, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh =new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        if(mDataset[position].equals("Doctors") | mDataset[position].equals("Hospitals"))
        {
            holder.mTextView.setTypeface(null, Typeface.BOLD);
        }
        else
        {
            holder.mTextView.setTypeface(null, Typeface.NORMAL);
        }
        holder.mTextView.setText(mDataset[position]);
        holder.mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if(TypeOfAutoSuggest.equals("Location"))
                MainActivity.getSearchviewLoc().setQuery(mDataset[position],false);
                if(TypeOfAutoSuggest.equals("Health"))
                    MainActivity.getSearchViewHealth().setQuery(mDataset[position],false);
                   MainActivity.getFirstFragment().getDoctorSearchListing(mDataset[position],"Delhi NCR","Doctors","Experience");

            }
        });



    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}