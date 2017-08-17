package com.sample.foo.usingcoordinatorlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.design.widget.*;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Button mFabAndSnackbarButton;
    private Button mFabAndTwoWidgetsButton;
    private Button mCollapsingToolbarButton;
    private Button mCustomBehaviorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar);


//        BEGIN UNCOMENT

//        final Toolbar tool = (Toolbar)findViewById(R.id.toolbar);
//        CollapsingToolbarLayout c = (CollapsingToolbarLayout)findViewById(R.id.collapsingToolbar);
//        AppBarLayout appbar = (AppBarLayout)findViewById(R.id.appBar);
//        tool.setTitle("");
//        setSupportActionBar(tool);
//        c.setTitleEnabled(false);
//
//        appbar.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
//
//            boolean isVisible = true;
//            int scrollRange = -1;
//            @Override
//            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
//                if (scrollRange == -1) {
//                    scrollRange = appBarLayout.getTotalScrollRange();
//                }
//                if (scrollRange + verticalOffset == 0) {
//                    tool.setTitle("Dmitry Dolgov");
//                    isVisible = true;
//                } else if(isVisible) {
//                    tool.setTitle("");
//                    isVisible = false;
//                }
//            }
//        });

//        END UNCOMENT


    }
}
