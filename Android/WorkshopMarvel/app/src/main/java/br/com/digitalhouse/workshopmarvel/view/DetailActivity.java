package br.com.digitalhouse.workshopmarvel.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.transition.Explode;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import br.com.digitalhouse.workshopmarvel.R;
import br.com.digitalhouse.workshopmarvel.model.Result;

import static br.com.digitalhouse.workshopmarvel.utils.AppUtils.setAnimation;

public class DetailActivity extends AppCompatActivity {

    private ImageView imageHero;
    private ImageView imageBackground;
    private ImageView imageBack;
    private Toolbar toolbar;
    private AppBarLayout appBarLayout;
    private Result result;
    private TextView textTitle;
    private TextView textViewDescription;
    private TextView textViewPublished;
    private TextView textViewPrice;
    private TextView textViewPages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setAnimation(this);
        setContentView(R.layout.activity_detail);

        initViews();
        setSupportActionBar(toolbar);

        result = getIntent().getParcelableExtra("comic");
        String transitionName = getIntent().getStringExtra("transitionName");

        imageHero.setTransitionName(transitionName);
        textTitle.setText(result.getTitle());
        textViewDescription.setText(Html.fromHtml(result.getDescription()));

        try {
            SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.getDefault());
            SimpleDateFormat format = new SimpleDateFormat("EEE, d MMM yyyy", Locale.getDefault());
            Date date = formatDate.parse(result.getDates().get(0).getDate());
            String dateString = format.format(date);
            textViewPublished.setText(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        textViewPrice.setText("$" + result.getPrices().get(0).getPrice());
        textViewPages.setText(result.getPageCount().toString());

        Picasso.get().load(result.getThumbnail().getPath() + "/portrait_incredible." + result.getThumbnail().getExtension())
                .placeholder(R.drawable.marvel_logo)
                .error(R.drawable.marvel_logo)
                .into(imageHero);

        if (!result.getImages().isEmpty()) {
            Picasso.get().load(result.getImages().get(0).getPath() + "/landscape_incredible." + result.getImages().get(0).getExtension())
                    .placeholder(R.drawable.marvel_logo)
                    .error(R.drawable.marvel_logo)
                    .into(imageBackground);
        }


        imageHero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, ImagePopupActivity.class);
                intent.putExtra("image", result.getThumbnail().getPath() + "/detail." + result.getThumbnail().getExtension());
                startActivity(intent);
            }
        });

        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                supportFinishAfterTransition();
            }
        });


        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (verticalOffset == 0) {
                    imageHero.setVisibility(View.VISIBLE);
                } else if (Math.abs(verticalOffset) >= appBarLayout.getTotalScrollRange()) {
                    imageHero.setVisibility(View.GONE);
                    toolbar.setTitle(result.getTitle());
                } else {
                    imageHero.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private void initViews() {
        toolbar = findViewById(R.id.toolbar);
        imageBack = findViewById(R.id.imageBack);
        imageHero = findViewById(R.id.imageComic);
        appBarLayout = findViewById(R.id.app_bar);
        textTitle = findViewById(R.id.textTitle);
        textViewDescription = findViewById(R.id.textViewDesciption);
        textViewPublished = findViewById(R.id.textViewPublished);
        textViewPrice = findViewById(R.id.textViewPrice);
        textViewPages = findViewById(R.id.textViewPages);
        imageBackground = findViewById(R.id.imageBackground);
    }
}
