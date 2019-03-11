package br.com.digitalhouse.revisao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import static br.com.digitalhouse.revisao.MainActivity.NAME;

public class HomeActivity extends AppCompatActivity {

    private TextView textViewHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textViewHome = findViewById(R.id.textview_title);

        String value = getIntent().getStringExtra(NAME);
        textViewHome.setText(value);
    }
}
