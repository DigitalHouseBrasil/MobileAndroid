package br.com.digitalhouse.json.news;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.json.R;
import br.com.digitalhouse.json.news.adapters.RecyclerViewNewsAdapter;
import br.com.digitalhouse.json.news.model.News;
import br.com.digitalhouse.json.news.viewmodel.NewsViewModel;

public class NewsActivity extends AppCompatActivity {

    private List<News> newsList = new ArrayList<>();
    private RecyclerViewNewsAdapter adapter;
    private RecyclerView recyclerView;
    private Button btnGetNews;

    private NewsViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = ViewModelProviders.of(this).get(NewsViewModel.class);
        initViews();
        configRecyclerView();

        btnGetNews.setOnClickListener(view -> {
            viewModel.getNews();
        });

        viewModel.getNewsLiveData().observe(this, new Observer<List<News>>() {
            @Override
            public void onChanged(@Nullable List<News> news) {
                adapter.update(news);
            }
        });
    }

    private void configRecyclerView() {
        adapter = new RecyclerViewNewsAdapter(newsList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerview);
        btnGetNews = findViewById(R.id.btn_get_news);
    }
}
