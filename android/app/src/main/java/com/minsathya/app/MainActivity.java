package com.minsathya.app;

import android.graphics.Color;
import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     getBridge().getWebView().setBackgroundColor(
    Color.parseColor("#0b0b0b")
);

    }
}