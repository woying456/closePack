package com.example.zhouying18.closepackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        int type = getIntent().getIntExtra("type", -1);
        ((TextView) findViewById(R.id.tv_type)).setText("当前类型为" + type);
    }
}