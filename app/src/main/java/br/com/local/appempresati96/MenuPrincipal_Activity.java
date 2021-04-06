package br.com.local.appempresati96;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuPrincipal_Activity extends AppCompatActivity {
    //declaração do objeto que representará o componente do xml
    //Variável global
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.menu_principal_layout);

        //ligar o objeto do java ao componente do xml
        btnVoltar = findViewById(R.id.btnVoltar);

        //criar o método para realizar a ação de abrir janela.
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //criar um Intent para abrir uma janela
                Intent abrirJanela = new Intent(getApplicationContext(),Login_Activity.class);
                startActivity(abrirJanela);
                //fechar a janela atual
                finish();


            }
        });


    }
}