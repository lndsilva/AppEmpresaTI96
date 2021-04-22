package br.com.local.appempresati96;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ListarContatos_Activity extends AppCompatActivity {
    BottomAppBar bottomAppBar;
    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listar_contatos_layout);

        bottomAppBar = findViewById(R.id.idButtomBar);
        fab = findViewById(R.id.idFABBottom);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no FAB!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });


        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no bottomBar",
                        Toast.LENGTH_SHORT).show();
            }
        });

        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.mBBuscar:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em buscar!!!",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mBCompartilhar:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em compartilhar!!!",
                                Toast.LENGTH_SHORT).show();
                        break;
                }


                return false;
            }
        });
    }
}