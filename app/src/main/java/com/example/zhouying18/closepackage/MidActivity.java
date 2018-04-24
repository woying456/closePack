package com.example.zhouying18.closepackage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 中间页面不需要存储前一个页面的值，只关心自己的逻辑
 */
public class MidActivity extends AppCompatActivity implements View.OnClickListener {

    private ClosePack closepack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mid);
        closepack = (ClosePack) getIntent().getSerializableExtra("closepack");
        findViewById(R.id.tv_01).setOnClickListener(this);
        findViewById(R.id.tv_02).setOnClickListener(this);
        findViewById(R.id.tv_03).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_01:
                closepack.excute(this, 1);
                break;
            case R.id.tv_02:
                closepack.excute(this, 2);
                break;
            case R.id.tv_03:
                closepack.excute(this, 3);
                break;
        }
    }
}
