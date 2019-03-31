package com.example.atishay.event_lister;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Event_lister_Activity extends AppCompatActivity {

    public ArrayList<Events> eventsList=new ArrayList<>();
    public Event_List_Adapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_lister);


        //initilaizing events data
        initListdata();
    }


    private void initListdata(){
       Events events= new Events("Hello Android Ed Burnette");
        eventsList.add(events);

        events= new Events("Hello Android Ed Burnette1");
        eventsList.add(events);

        events= new Events("Hello Android Ed Burnette2");
        eventsList.add(events);

        events= new Events("Hello Android Ed Burnette3");
        eventsList.add(events);

        events= new Events("Hello Android Ed Burnette4");
        eventsList.add(events);

        events= new Events("Hello Android Ed Burnette5");
        eventsList.add(events);
        Toast.makeText(this,eventsList.toString(),Toast.LENGTH_LONG).show();
        //eventsList.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");

        /*mAdapter.notifyDataSetChanged();*/
        //setting adapter
        initRecyclerView();

        Toast.makeText(this,"size of list is "+eventsList.size(),Toast.LENGTH_SHORT).show();

    }

    public void initRecyclerView(){
        RecyclerView recyclerview = findViewById(R.id.events_list);
        mAdapter = new Event_List_Adapter(eventsList);
        RecyclerView.LayoutManager mlayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerview.setLayoutManager(mlayoutManager);
        recyclerview.setHasFixedSize(true);
        recyclerview.setItemAnimator(new DefaultItemAnimator());
        recyclerview.setAdapter(mAdapter);
    }

}
