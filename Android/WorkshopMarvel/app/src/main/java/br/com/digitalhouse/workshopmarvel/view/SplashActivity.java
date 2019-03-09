package br.com.digitalhouse.workshopmarvel.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

import br.com.digitalhouse.workshopmarvel.R;

public class SplashActivity extends AppCompatActivity {

    private Timer timer = new Timer();
    private ImageView imageSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Inicializa as views que serão utilizadas na activity
        imageSplash = findViewById(R.id.imageSplash);

        // Adicionamos o evento de click na imagem
        imageSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHome();
            }
        });

        // Adicionamos um timer a nossa activity, ao fim de 3 segundos
        // direcionamos para a tela de HOME
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                goToHome();
            }
        }, 3000);

    }


    // Método que chama a telal de HOME
    private void goToHome() {
        timer.cancel();
        startActivity(new Intent(SplashActivity.this, HomeActivity.class));
        finish();
    }
}
