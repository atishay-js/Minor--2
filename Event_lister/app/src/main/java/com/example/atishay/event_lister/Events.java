package com.example.atishay.event_lister;


public class Events {

    private String name;
    public Events(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    private RecyclerView.Adapter madapter;
//    private RecyclerView.LayoutManager layoutManager;
//
//    public event_lister(RecyclerView recyclerView, Context context){
//
//        recyclerView.setHasFixedSize(true);
//
//        //setting layout manager
//        layoutManager=new LinearLayoutManager(context);
//        recyclerView.setLayoutManager(layoutManager);
//
//        //specifying an adpater
//        madapter=new Event_List_Adapter();
//        recyclerView.setAdapter(madapter);


}
