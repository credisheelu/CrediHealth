package credihealth.app.com.credihealth.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import credihealth.app.com.credihealth.R;
import credihealth.app.com.credihealth.models.doctor.Search;

/**
 * Created by sheelu on 1/9/15.
 */
public class DoctorSearchAdapter extends RecyclerView.Adapter<DoctorSearchAdapter.ViewHolder> {
    private List<Search> searchList;
    private Context context;


    public DoctorSearchAdapter(Context context,List<Search> objects) {
        this.context=context;
        this.searchList = objects;
    }
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView doctorImgview;
        public TextView nameTextview,hosTextview,desigTextview;

        public ViewHolder(View v) {
            super(v);
            this.nameTextview = (TextView)v.findViewById(R.id.nameTextview);
            this.doctorImgview=(ImageView)v.findViewById(R.id.doctorImgview);
            this.hosTextview=(TextView)v.findViewById(R.id.hosTextview);
            this.desigTextview=(TextView)v.findViewById(R.id.desigTextview);
        }


    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.doctor_search_view, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh =new ViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Search search = searchList.get(position);
        holder.nameTextview.setText(search.getDocName());
        holder.hosTextview.setText(search.getHospName());
        holder.desigTextview.setText(search.getDesignation());
        Picasso.with(context).load(search.getProfilePicUrl()).resize(200, 200).into(holder.doctorImgview);
    }

    @Override
    public int getItemCount() {
        return searchList.size();
    }

    /*@Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.doctor_search_view,parent,false);
        Search search = searchList.get(position);
        TextView tv = (TextView) view.findViewById(R.id.name);
        tv.setText(search.getDocName()+"\n"+search.getDesignation());
        Log.v("Doctor",search.getDocName()+search.getProfilePicUrl());
        ImageView img = (ImageView) view.findViewById(R.id.img);
        Picasso.with(getContext()).load(search.getProfilePicUrl()).resize(100, 100).into(img);
        return view;
    }*/
}