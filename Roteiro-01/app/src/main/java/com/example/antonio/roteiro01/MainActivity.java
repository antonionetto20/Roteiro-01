package com.example.antonio.roteiro01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTexto = (TextView)findViewById(R.id.texto);
        Bundle b = getIntent().getExtras();
        String texto = b.getString("nome");
        mTexto.setText("Olá " + texto + " Seja bem vindo");
    }
}
