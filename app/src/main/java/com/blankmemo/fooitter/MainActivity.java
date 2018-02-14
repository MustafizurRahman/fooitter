package com.blankmemo.fooitter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.main_activity_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        //Define an Array for the adapter
        ArrayList<UserProfile> mList=new ArrayList<>();


        //In real life, this array list will be populated from an API call
        for(int i=0;i<=10;i++){
            UserProfile userProfile=new UserProfile("fname"+i,"lname"+i,"Not Available",i+20);
            mList.add(i,userProfile);
        }

        if(getIntent()!=null) //Log.d(this.getClass().getSimpleName(),getIntent().getAction());

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter
        mAdapter = new MyRecycleViewAdapter(mList);
        mRecyclerView.setAdapter(mAdapter);
    }
}
