package com.dscproject.cantinplusplus;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardViewCantinAdapter extends RecyclerView.Adapter<CardViewCantinAdapter.CardViewViewHolder> {
    private ArrayList<Cantin> listCantin;

    public CardViewCantinAdapter(ArrayList<Cantin> list){
        this.listCantin = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_cantin, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        final Cantin cantin = listCantin.get(position);
        holder.imgPhoto.setImageResource(cantin.getImgPhoto());
        holder.name.setText(cantin.getName());
        holder.favFood.setText(cantin.getFavoriteFood());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailCantin = new Intent(holder.itemView.getContext(), CantinDetailActivity.class);
                holder.itemView.getContext().startActivity(detailCantin);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listCantin.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        TextView name, favFood;
        ImageView imgPhoto;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            name = itemView.findViewById(R.id.tv_item_name);
            favFood = itemView.findViewById(R.id.tv_item_food);
        }
    }
}
