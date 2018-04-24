package com.example.zhouying18.closepackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ClosePack closePack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
        closePack = new MyClosePack();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MidActivity.class);
        intent.putExtra("closepack", (Serializable) closePack);
        startActivity(intent);
    }
}
