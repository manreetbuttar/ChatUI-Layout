package com.dev.module;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_back=findViewById(R.id.iv_back);

        com.dev.chatlibrary.MainActivity.removeBackImage(iv_back);
    }
}
