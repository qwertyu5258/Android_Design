package com.example.do_11.googlemap;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.example.do_11.R;
import com.example.do_11.googlemap.GoogleMap.GoogleMapActivity;

/**
 * Created by DO-11 on 2018-03-06.
 */

public class Tabs_Menu_Activity_no_use extends ActivityGroup {

  private TabHost tabHost;

  @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab);


        tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup(getLocalActivityManager());


        tabHost.addTab(tabHost.newTabSpec("Tab1")
                .setIndicator("",getResources().getDrawable(R.drawable.ic_assessment_black_24dp))
                .setContent(new Intent(this, MainActivity.class)));


        tabHost.addTab(tabHost.newTabSpec("Tab2")
                .setIndicator("",getResources().getDrawable(R.drawable.ic_launcher_foreground))
                .setContent(new Intent(this, Opening.class)));



        tabHost.addTab(tabHost.newTabSpec("Tab3")
                .setIndicator("list4")
                .setContent(new Intent(this, GoogleMapActivity.class)));


    }

}






