package com.example.activityone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView2.findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);

        Log.i("LifeCycle","onCreate() Invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LifeCycle","onStart() Invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LifeCycle","onRestart() Invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCycle","onPause() Invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LifeCycle","onResume() Invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeCycle","onStop() Invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle","onDestroy() Invoked");
    }

}
