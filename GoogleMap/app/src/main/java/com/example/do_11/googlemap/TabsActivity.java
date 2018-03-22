package com.example.do_11.googlemap;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.example.do_11.R;
import com.example.do_11.googlemap.GoogleMap.GoogleMapActivity;
import com.example.do_11.googlemap.Nav_Drawer.NavDrawer;
import com.example.do_11.googlemap.Naver_Map.Naver_Map;
import com.example.do_11.googlemap.SpinnerPage.SpinnerActivity;


/**
 * Created by DO-11 on 2018-03-06.
 */

public class TabsActivity extends ActivityGroup {

  private TabHost tabHost;

  @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab);


        tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup(getLocalActivityManager());


        tabHost.addTab(tabHost.newTabSpec("Tab1")
                .setIndicator("",getResources().getDrawable(R.drawable.ic_book))
                .setContent(new Intent(this, NavDrawer.class)));


        tabHost.addTab(tabHost.newTabSpec("Tab2")
                .setIndicator("",getResources().getDrawable(R.drawable.ic_launcher_foreground))
                .setContent(new Intent(this, SpinnerActivity.class)));



        tabHost.addTab(tabHost.newTabSpec("Tab3")
                .setIndicator("list4")
                .setContent(new Intent(this, Naver_Map.class)));


    }

}






