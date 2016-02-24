package com.example.antonio.roteiro01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {

    private EditText mNome;
    private EditText mSobrenome;
    private EditText mUsuario;
    private EditText mSenha;
    private EditText mSenhaC;
    private Button mOK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        mNome = (EditText) findViewById(R.id.nome);
        mSobrenome = (EditText) findViewById(R.id.sobrenome);
        mUsuario = (EditText) findViewById(R.id.usuario);
        mSenha = (EditText) findViewById(R.id.senha);
        mSenhaC = (EditText) findViewById(R.id.senhaC);
        mOK = (Button) findViewById(R.id.ok);

        mOK.setOnClickListener(new View.OnClickListener() {// se clicar no botao faça
            @Override
            public void onClick(View v) {
                cadastrar();
            }


        });
    }

    private void cadastrar() {
        String nome = mNome.getText().toString();
        String sobrenome = mSobrenome.getText().toString();
        String usuario = mUsuario.getText().toString();
        String senha = mSenha.getText().toString();
        String senhaC = mSenhaC.getText().toString();

        boolean vazio = false;
        View focus = null;
        if (TextUtils.isEmpty(nome)) {
            mNome.setError("Campo Vazio!"); //mostra q tem erro
            focus = mNome;
            focus.requestFocus(); // joga na tela
            vazio = true;
        }
        if (TextUtils.isEmpty(sobrenome)) {
            mSobrenome.setError("Campo Vazio!"); //mostra q tem erro
            focus = mSobrenome;
            focus.requestFocus(); // joga na tela
            vazio = true;
        }
        if (TextUtils.isEmpty(usuario)) {
            mUsuario.setError("Campo Vazio!"); //mostra q tem erro
            focus = mUsuario;
            focus.requestFocus(); // joga na tela
            vazio = true;
        }
        if (TextUtils.isEmpty(senha)) {
            mSenha.setError("Campo Vazio!"); //mostra q tem erro
            focus = mSenha;
            focus.requestFocus(); // joga na tela
            vazio = true;
        }
        if (TextUtils.isEmpty(senhaC)) {
            mSenhaC.setError("Campo Vazio!"); //mostra q tem erro
            focus = mSenhaC;
            focus.requestFocus(); // joga na tela
            vazio = true;
        }

        if (senha.equals(senhaC) && !vazio) {
            Intent i = new Intent(this, MainActivity.class);
            Bundle b = new Bundle();
            b.putString("nome", nome);
            i.putExtras(b);//manda o paametro nome para a nova tela
            startActivity(i);
        } else {
            if (!senha.equals(senhaC)){
                mSenha.setError("Senha não está igual a confirmação!");
                focus = mSenha;
                focus.requestFocus(); // joga na tela
            }
        }
    }
}

