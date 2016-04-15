package com.example.antonio.app_fruit_cheers.view;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.antonio.app_fruit_cheers.R;
public class SplashActivity extends AppCompatActivity implements Runnable{

    private static final int DELAY = 3000; // milisegundos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ocultarBarraDeNavegação();
        Handler handler = new Handler();
        handler.postDelayed(this, DELAY);
    }

    @Override
    public void run() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void ocultarBarraDeNavegação(){
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }
}