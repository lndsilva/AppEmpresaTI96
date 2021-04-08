package br.com.local.appempresati96;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    //criando variáveis globais que representarão componentes no xml
    EditText edtUsuario, edtSenha;
    TextView txtCadUsuario;

    //Método principal
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //executando o método ContentView
        setContentView(R.layout.login_layout);

        //apresentando os componentes do xml para o java
        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);
        txtCadUsuario = findViewById(R.id.txtCadUsuario);

        //Criando uma ação de listener para o txtCadUsuario
        txtCadUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abre a janela cadastro de usuário
                startActivity(new Intent(getApplicationContext(),CadUsuario_Activity.class));
            }
        });

    }

    public void abrirJanela(View view) {

        //declarando variaveis locais do tipo String
        String usuario, senha;

        //inicializando as variaveis com os valores
        usuario = edtUsuario.getText().toString();
        senha = edtSenha.getText().toString();

        if (usuario.equals("senac") && senha.equals("senac")) {

            startActivity(new Intent(getApplicationContext(), MenuPrincipal_Activity.class));
            //fechar a janela atual
            finish();
        } else {
            Toast.makeText(getApplicationContext(),
                    "Usuário ou senha inválidos!!!",
                    Toast.LENGTH_LONG).show();
            //chamando o método para limpar o campos
            limparCampos();

        }
    }

    //Criando o método para limpar campos
    public void limparCampos() {
        edtUsuario.setText("");
        edtSenha.setText("");
        edtUsuario.requestFocus();
    }

    public void fecharJanela(View view) {
        finish();
    }
}