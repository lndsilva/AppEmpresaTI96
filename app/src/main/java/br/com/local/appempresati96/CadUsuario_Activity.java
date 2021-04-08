package br.com.local.appempresati96;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class CadUsuario_Activity extends AppCompatActivity {
    MaterialButton btnCadRealizarLogin, btnCadUsuario, btnPolPrivacidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cad_usuario_layout);

        btnCadRealizarLogin = findViewById(R.id.btnCadRealizarLogin);
        btnCadUsuario = findViewById(R.id.btnCadUsuario);
        btnPolPrivacidade = findViewById(R.id.btnPolPrivacidade);

        btnCadRealizarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Login_Activity.class));
            }
        });

        btnCadUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Usuário Cadastrado com sucesso!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btnPolPrivacidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PoliticaPrivacidade_Activity.class));
            }
        });
    }
}