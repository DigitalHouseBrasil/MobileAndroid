package br.com.digitalhouse.workshopmarvel.view;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import br.com.digitalhouse.workshopmarvel.R;

public class DetailActivity extends AppCompatActivity {

    private ImageView imageHero;
    private Toolbar toolbar;
    AppBarLayout appBarLayout;
    CollapsingToolbarLayout toolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initViews();
        setSupportActionBar(toolbar);

        imageHero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (verticalOffset == 0) {
                    imageHero.setVisibility(View.VISIBLE);
                } else if (Math.abs(verticalOffset) >= appBarLayout.getTotalScrollRange()) {
                    imageHero.setVisibility(View.GONE);
                    toolbar.setTitle("SPIDERMAN");
                } else {
                    imageHero.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private void initViews() {
        toolbar = findViewById(R.id.toolbar);
        imageHero = findViewById(R.id.imageHero);
        appBarLayout = findViewById(R.id.app_bar);
        toolbarLayout = findViewById(R.id.toolbar_layout);
    }
}
