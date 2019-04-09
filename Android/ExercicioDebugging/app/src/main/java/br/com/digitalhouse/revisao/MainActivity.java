package br.com.digitalhouse.revisao;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String NAME = "name";
    private TextInputLayout textInputLayoutName;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, HomeActivity.class);

                String value = textInputLayoutName.getEditText().getText().toString();
                intent.putExtra(NAME, value);

                startActivity(intent);
            }
        });

        textInputLayoutName = findViewById(R.id.inputtextlayout_name);
        btnSend = findViewById(R.id.btn_send);
    }
}
