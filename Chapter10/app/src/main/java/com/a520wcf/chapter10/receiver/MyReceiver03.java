package com.a520wcf.chapter10.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by apple on 16/9/29.
 */

public class MyReceiver03 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("MyReceiver03","MyReceiver03");
    }
}
