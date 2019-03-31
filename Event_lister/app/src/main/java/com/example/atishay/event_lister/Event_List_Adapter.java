package com.example.atishay.event_lister;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Event_List_Adapter extends RecyclerView.Adapter<Event_List_Adapter.MyViewHolder> {

    private ArrayList<Events> meventsList=new ArrayList<>();

    // Provide a suitable constructor (depends on the kind of dataset)
    public Event_List_Adapter(ArrayList<Events> eventsList) {
        this.meventsList=eventsList;
    }



    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //creating new view
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.event_list_rec_view_layout,viewGroup,false);
        return new MyViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        myViewHolder.textView.setText(meventsList.get(i).getName());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        Log.d("Event_list_adapter", "getItemCount: size if "+meventsList.size());
        return meventsList.size();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class MyViewHolder extends ViewHolder{
        TextView textView;

        public MyViewHolder(View v){        // each data item is just a string in this case
            super(v);
            textView=v.findViewById(R.id.textview);
        }
    }
}
