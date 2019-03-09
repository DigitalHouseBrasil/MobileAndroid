package br.com.digitalhouse.workshopmarvel.adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import br.com.digitalhouse.workshopmarvel.R;
import br.com.digitalhouse.workshopmarvel.model.Result;
import br.com.digitalhouse.workshopmarvel.view.DetailActivity;

public class RecyclerViewComicsAdapter extends RecyclerView.Adapter<RecyclerViewComicsAdapter.ViewHolder> {
    private List<Result> results;

    public RecyclerViewComicsAdapter(List<Result> results) {
        this.results = results;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Result result = results.get(position);
        viewHolder.bind(result);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String transitionName = "image_" + position;
                Intent intent = new Intent(viewHolder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("comic", result);
                intent.putExtra("transitionName", transitionName);

                viewHolder.imageComic.setTransitionName(transitionName);

                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation((Activity) viewHolder.itemView.getContext(),
                                viewHolder.imageComic, transitionName);

                viewHolder.itemView.getContext().startActivity(intent, options.toBundle());
            }
        });
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageComic;
        private TextView textComicNumber;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageComic = itemView.findViewById(R.id.imageComic);
            textComicNumber = itemView.findViewById(R.id.textComicNumber);
        }

        private void bind(Result result) {
            Picasso.get().load(result.getThumbnail().getPath() + "/portrait_incredible." + result.getThumbnail().getExtension())
                    .placeholder(R.drawable.marvel_logo)
                    .error(R.drawable.marvel_logo)
                    .into(imageComic);

            textComicNumber.setText("# " + result.getIssueNumber());
        }
    }

    public void update(List<Result> resultList) {
        this.results = resultList;
        notifyDataSetChanged();
    }
}
