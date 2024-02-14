package com.example.pw1;

import static com.example.pw1.MainActivity.KEY;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            String str = bundle.getString(KEY);
        }
    }
}