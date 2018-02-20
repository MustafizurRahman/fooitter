package com.blankmemo.fooitter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hongyuchen on 2018-01-31.
 */

public class MyRecycleViewAdapter extends RecyclerView.Adapter<MyRecycleViewAdapter.ViewHolder> {
    //Arraylist
    private ArrayList<UserPost> mMyList;
    private Context mContext;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public View mView;
        public ViewHolder(View v) {
            super(v);
            mView = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyRecycleViewAdapter(ArrayList<UserPost> myList, Context context) {
        mMyList = myList;
        mContext=context;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyRecycleViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.featured_post_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        //Log.d("FIRSTNAME",myList.get(position).getFirstName());
        ((TextView)holder.itemView.findViewById(R.id.fname_text_view)).setText(mMyList.get(position).getmFirstName());
        ((TextView)holder.itemView.findViewById(R.id.lname_text_view)).setText(mMyList.get(position).getmLastName());
        ((TextView)holder.itemView.findViewById(R.id.post_title_text_view)).setText(mMyList.get(position).getmShortDescription());
        ((TextView)holder.itemView.findViewById(R.id.number_of_viewers)).setText(mMyList.get(position).getmNumberOfViews() + " Views");
    
    
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mMyList.size();
    }
    
     private Drawable getDrawableImage(String fileName){
        Drawable drawable = null;
        try {
            // get input stream
            InputStream ims = mContext.getAssets().open(fileName);
            // load image as Drawable
            drawable = Drawable.createFromStream(ims, null);
            // set image to ImageView
        }
        catch(IOException ex) {
            return null;
        }
        return drawable;
    }

    }
