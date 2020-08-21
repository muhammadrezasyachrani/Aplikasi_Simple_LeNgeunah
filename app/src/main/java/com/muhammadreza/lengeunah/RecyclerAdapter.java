package com.muhammadreza.lengeunah;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private ArrayList<Menu> mArrayList;
    private List<Menu> listMenu;


    public RecyclerAdapter(ArrayList<Menu> listMenu) {
        mArrayList = listMenu;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_menu, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Menu m = mArrayList.get(i);

        viewHolder.ivFoto.setImageResource(m.getmFoto());
        viewHolder.tvNama.setText(m.getmNama());
        viewHolder.tvHarga.setText(m.getmHarga());
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivFoto;
        private TextView tvNama, tvHarga;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFoto = itemView.findViewById(R.id.ivMenu);
            tvNama = itemView.findViewById(R.id.tvNamaMenu);
            tvHarga = itemView.findViewById(R.id.tvHargaMenu);
        }
    }
}