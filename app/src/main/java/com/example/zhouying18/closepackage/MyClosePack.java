package com.example.zhouying18.closepackage;

import android.content.Context;
import android.content.Intent;

import java.io.Serializable;

/**
 * 封装的第一个页面的代码块，在中间页面执行
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
