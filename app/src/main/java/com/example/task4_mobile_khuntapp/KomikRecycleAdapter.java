package com.example.task4_mobile_khuntapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class KomikRecycleAdapter extends RecyclerView.Adapter<KomikRecycleAdapter.ListViewHolder> {
    private ArrayList<Komik> listKomik;

    public  KomikRecycleAdapter(ArrayList<Komik> list){
        this.listKomik = list;
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_comic_item, parent, false);
        return  new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Komik komik = listKomik.get(position);
        holder.imgPoster.setImageResource(komik.getPoster());
        holder.tvTitle.setText(komik.getTitle());
        holder.tvGenre.setText(komik.getGenre());
        holder.tvTipe.setText(komik.getTipe());
        holder.imgPoster.setImageResource(komik.getPoster());
        holder.tvSinopsis.setText(komik.getSinopsis());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("poster", komik.getPoster());
                intent.putExtra("title", komik.getTitle());
                intent.putExtra("genre", komik.getGenre());
                intent.putExtra("tipe", komik.getTipe());
                intent.putExtra("sinopsis", komik.getSinopsis());
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listKomik.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPoster;
        TextView tvTitle, tvTipe, tvSinopsis, tvGenre;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPoster = itemView.findViewById(R.id.komik_image);
            tvTitle = itemView.findViewById(R.id.tv_komik_name);
            tvGenre = itemView.findViewById(R.id.tv_komik_genre);
            tvTipe = itemView.findViewById(R.id.tv_komik_tipe);
            tvSinopsis = itemView.findViewById(R.id.tv_sinopsis);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Komik data);
    }
}
