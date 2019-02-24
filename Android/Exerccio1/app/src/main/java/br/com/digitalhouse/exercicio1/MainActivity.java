package br.com.digitalhouse.exercicio1;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.digitalhouse.exercicio1.R;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editNome;
    private TextInputEditText editEmail;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = (TextInputEditText) findViewById(R.id.editNome);
        editEmail = (TextInputEditText) findViewById(R.id.editEmail);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);


        //  Adicionamos o evento de click no botão
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Verificamos se no nome está vazio, se estiver vazio mostramos a mensagem e coocamos o foco no elemento
                if (editNome.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Preencha o campo nome", Toast.LENGTH_SHORT).show();
                    editNome.requestFocus();
                    return;
                }

                // Verificamos se no email está vazio, se estiver vazio mostramos a mensagem e coocamos o foco no elemento
                if (editEmail.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Preencha o campo e-mail", Toast.LENGTH_SHORT).show();
                    editEmail.requestFocus();
                    return;
                }

                Toast.makeText(MainActivity.this, "Dados OK", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
