package com.airsaid.diffuseview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.airsaid.diffuseview.widget.DiffuseView;

public class MainActivity extends AppCompatActivity {

    private DiffuseView mDiffuseView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDiffuseView = (DiffuseView) findViewById(R.id.diffuseView);
    }

    public void start(View v){
        mDiffuseView.start();
    }

    public void stop(View v){
        mDiffuseView.stop();
    }
}
