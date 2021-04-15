package br.com.local.appempresati96;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PerfilUsuario_Activity extends AppCompatActivity {

    //declarando as variáveis globais conforme componentes do XML
    MaterialToolbar idToolbar;
    FloatingActionButton idFAB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_usuario_layout);

        //declarando as variaveis globais para receberem os componentes xml do layout
        idToolbar = findViewById(R.id.idToolBar);
        idFAB = findViewById(R.id.idFAB);

        //implementando a seta de voltar na barra do aplicativo - appBar
        idToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),
                        MenuPrincipal_Activity.class));
                finish();
            }
        });

        //implementando a ação de cadastrar no FAB do aplicativo
        idFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Cadastrar",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //implementando as ações nos botões na barra de aplicativo - appBar
        idToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.mPAlterar:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em alterar",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mPExcluir:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em excluir",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mPPesquisar:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em pesquisar",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mPVoltar:
                        startActivity(new Intent(getApplicationContext(),
                                MenuPrincipal_Activity.class));
                        finish();
                        break;
                }

                return false;
            }
        });

    }
}