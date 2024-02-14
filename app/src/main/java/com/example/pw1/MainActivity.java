package com.example.pw1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1, btn2;
    public static final String KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("RRR","onCreate()");
        btn1 = findViewById(R.id.yt_btn);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.msg_btn);
        btn2.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("RRR","onStart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("RRR","onDestroy()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RRR","onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("RRR","onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("RRR","onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RRR","onStop()");
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.msg_btn) {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
            Toast.makeText(this,"IKBO-26-22",Toast.LENGTH_LONG).show();
        }
        else {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String str = "https://www.youtube.com/watch?v=TKrwdW0qEpY";
            intent.setData(Uri.parse(str));
            startActivity(intent);
        }
    }
}