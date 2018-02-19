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

        //Define an Arraylist of UserPost for the adapter, and initialize the value
        ArrayList<UserPost> userPosts = new ArrayList<UserPost>();
        userPosts.add(new UserPost("john", "smith", "this is my first post, woohoo!", "", "", 1000));
        userPosts.add(new UserPost("mark", "simpson", "this is my second post, woohoo!", "", "", 10434));
        userPosts.add(new UserPost("Lucas", "williams", "this is my third post, woohoo!", "", "", 134));
        userPosts.add(new UserPost("mary", "brown", "this is my fourth post, woohoo!", "", "", 1343));
        userPosts.add(new UserPost("jane", "miller", "this is my fifth post, woohoo!", "", "", 1650));
        userPosts.add(new UserPost("liz", "taylor", "this is my sixth post, woohoo!", "", "", 58));
        userPosts.add(new UserPost("Kate", "davis", "this is my seventh post, woohoo!", "", "", 165));


//        if(getIntent()!=null) {
//            Log.d(this.getClass().getSimpleName(),getIntent().getAction());
//        }

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter
        mAdapter = new MyRecycleViewAdapter(userPosts);
        mRecyclerView.setAdapter(mAdapter);
    }
}
