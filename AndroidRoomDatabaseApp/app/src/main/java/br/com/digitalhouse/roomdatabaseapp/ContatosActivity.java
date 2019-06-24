package br.com.digitalhouse.roomdatabaseapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.roomdatabaseapp.adapters.RecyclerViewContatosAdapter;
import br.com.digitalhouse.roomdatabaseapp.interfaces.RecyclerViewOnItemClickListener;

public class ContatosActivity extends AppCompatActivity implements RecyclerViewOnItemClickListener {
    private FloatingActionButton fab;
    private RecyclerView recyclerViewContatos;
    private RecyclerViewContatosAdapter adapter;
    private List<Contato> contatoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab = findViewById(R.id.fab);
        recyclerViewContatos = findViewById(R.id.recyclerViewContatos);

        // Criamos o layoutmanager para o RecycleView
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        //Setamos o layoutManager no recyclerView
        recyclerViewContatos.setLayoutManager(layoutManager);

        // Inicializamos o adapter passando a lista vazia e o listener de click do item
        adapter = new RecyclerViewContatosAdapter(contatoList, this);

        //setamos o adapter no recyclerView
        recyclerViewContatos.setAdapter(adapter);

        fab.setOnClickListener(view -> {
            // Salvar item no banco ao clicar
        });

        // buscar todos os item salvos na base de dados e carregar no recyclerview
    }

    @Override
    public void onItemClick(Contato contato) {
        // ao clicar no item, deletar e remover da lista
    }
}
