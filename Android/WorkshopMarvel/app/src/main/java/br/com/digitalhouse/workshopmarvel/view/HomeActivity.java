package br.com.digitalhouse.workshopmarvel.view;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;

import java.util.ArrayList;

import br.com.digitalhouse.workshopmarvel.R;
import br.com.digitalhouse.workshopmarvel.adapters.RecyclerViewComicsAdapter;
import br.com.digitalhouse.workshopmarvel.viewmodel.ComicsViewModel;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerComics;
    private ComicsViewModel viewModel;
    private RecyclerViewComicsAdapter adapter;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Inicializa as views que serão utilizadas na activity
        initViews();


        // Busca na API da Marvel os quadrinhos para listarmos
        viewModel.getComics();

        // Atualiza a lista com os quadriho buscados na API
        viewModel.getResults().observe(this, results -> {
            adapter.update(results);
        });

        // Mostra a view de loaging na activity enquanto realizamos a busca na API
        viewModel.isLoasing().observe(this, loading -> {
            if (loading) {
                progressBar.setVisibility(View.VISIBLE);
            } else {
                progressBar.setVisibility(View.GONE);
            }
        });

    }

    private void initViews() {
        viewModel = ViewModelProviders.of(this).get(ComicsViewModel.class);
        recyclerComics = findViewById(R.id.recyclerComics);
        progressBar = findViewById(R.id.progressBar);
        adapter = new RecyclerViewComicsAdapter(new ArrayList<>());
        recyclerComics.setHasFixedSize(true);
        recyclerComics.setItemViewCacheSize(20);
        recyclerComics.setAdapter(adapter);
        recyclerComics.setLayoutManager(new GridLayoutManager(this, 3));
    }
}
