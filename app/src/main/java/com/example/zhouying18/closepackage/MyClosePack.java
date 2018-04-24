package com.example.zhouying18.closepackage;

import android.content.Context;
import android.content.Intent;

import java.io.Serializable;

/**
 * Created by zhouying18 on 2017/4/1.
 */

public class MyClosePack implements ClosePack, Serializable {
    @Override
    public void excute(Context context, int i) {
        Intent intent = new Intent(context, ThirdActivity.class);
        intent.putExtra("type", i);
        context.startActivity(intent);
    }
}
