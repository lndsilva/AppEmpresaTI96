package br.com.local.appempresati96;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MenuPrincipal_Activity extends AppCompatActivity {
    //declaração do objeto que representará o componente do xml
    //Variável global
    Button btnVoltar;
    MaterialToolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.menu_principal_layout);

        //ligar o objeto do java ao componente do xml
        btnVoltar = findViewById(R.id.btnVoltar);
        toolbar = findViewById(R.id.mToolbar);

        //criar o método para realizar a ação de abrir janela.
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //criar um Intent para abrir uma janela
                Intent abrirJanela = new Intent(getApplicationContext(), Login_Activity.class);
                startActivity(abrirJanela);
                //fechar a janela atual
                finish();
            }
        });

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.mCadastrar:

                        Toast.makeText(getApplicationContext(),
                                "Cadastrar",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mAlterar:
                        Toast.makeText(getApplicationContext(),
                                "Alterar",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mExcluir:
                        Toast.makeText(getApplicationContext(),
                                "Excluir",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mPesquisar:
                        Toast.makeText(getApplicationContext(),
                                "Pesquisar",
                                Toast.LENGTH_SHORT).show();
                        break;

                }


                return false;
            }
        });

    }

    //Método utilizado para colocar o menu na barra do aplicativo
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //inserindo o menu no layout
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);

        return super.onCreateOptionsMenu(menu);
    }

    //Método utilizado para criar ação ao menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mCadastrar:
                Toast.makeText(getApplicationContext(),
                        "Cadastrar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mAlterar:
                Toast.makeText(getApplicationContext(),
                        "Alterar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mExcluir:
                Toast.makeText(getApplicationContext(),
                        "Excluir",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mPesquisar:
                Toast.makeText(getApplicationContext(),
                        "Pesquisar",
                        Toast.LENGTH_SHORT).show();
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}