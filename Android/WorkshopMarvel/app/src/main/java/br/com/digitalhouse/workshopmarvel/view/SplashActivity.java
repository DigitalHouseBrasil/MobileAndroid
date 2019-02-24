package br.com.digitalhouse.workshopmarvel.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        imageSplash = findViewById(R.id.imageSplash);

        imageSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump();
            }
        });

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                jump();
            }
        }, 3000);

    }


    private void jump() {
        timer.cancel();
        startActivity(new Intent(SplashActivity.this, HomeActivity.class));
        finish();
    }
}
