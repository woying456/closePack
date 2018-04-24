package com.example.zhouying18.closepackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        //获取第一个页面传递的值
        String data = getIntent().getStringExtra("data");
        //获取type类型
        int type = getIntent().getIntExtra("type", -1);
        ((TextView) findViewById(R.id.tv_data)).setText(data);
        ((TextView) findViewById(R.id.tv_type)).setText("当前类型为" + type);
    }
}
