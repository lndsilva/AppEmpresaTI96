package br.com.local.appempresati96;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    //criando variáveis globais que representarão componentes no xml
    EditText edtUsuario, edtSenha;

    //Método principal
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //executando o método ContentView
        setContentView(R.layout.login_layout);

        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);

    }

    public void abrirJanela(View view) {

      //Toast.makeText(getApplicationContext(),"Cliquei no botão entrar menu!!!",Toast.LENGTH_LONG).show();
        startActivity(new Intent(getApplicationContext(),MenuPrincipal_Activity.class));
        //fechar a janela atual
        finish();


    }
    public void fecharJanela(View view) {
        finish();
    }
}