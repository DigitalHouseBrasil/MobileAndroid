package br.com.digitalhouse.roomdatabaseapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.digitalhouse.roomdatabaseapp.Contato;
import br.com.digitalhouse.roomdatabaseapp.R;
import br.com.digitalhouse.roomdatabaseapp.interfaces.RecyclerViewOnItemClickListener;

public class RecyclerViewContatosAdapter extends RecyclerView.Adapter<RecyclerViewContatosAdapter.ViewHolder> {

    private List<Contato> contatos;
    private RecyclerViewOnItemClickListener listener;

    public RecyclerViewContatosAdapter(List<Contato> contatos, RecyclerViewOnItemClickListener listener) {
        this.contatos = contatos;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_contato_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        final Contato contato = contatos.get(position);

        viewHolder.bind(contato);

        //Vincula o evendo de click do item e repassa para o listener
        viewHolder.itemView.setOnClickListener(v -> {
            // Viculamos o click no item
            listener.onItemClick(contato);
        });
    }

    @Override
    public int getItemCount() {
        return contatos.size();
    }

    public void update(List<Contato> contatoList){
        this.contatos = contatoList;
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewNome;
        private TextView textViewTelefone;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewNome = itemView.findViewById(R.id.textViewNome);
            textViewTelefone = itemView.findViewById(R.id.textViewTelefone);
        }

        public void bind(Contato contato) {
            textViewNome.setText(contato.getNome());
            textViewTelefone.setText(textViewTelefone.getContext().getString(R.string.tefefone_format, contato.getTelefone()));
        }
    }
}
