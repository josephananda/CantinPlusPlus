package com.dscproject.cantinplusplus;

import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ListFoodAdapter extends RecyclerView.Adapter<ListFoodAdapter.ListViewHolder> {
    ArrayList<Food> listFood;

    public ListFoodAdapter(ArrayList<Food> list) {
        this.listFood = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_food, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Food food = listFood.get(position);
        holder.imgPhoto.setImageResource(food.getFoodPic());
        holder.name.setText(food.getName());
        holder.description.setText(food.getDescription());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent orderFood = new Intent(holder.itemView.getContext(), OrderFoodActivity.class);
                holder.itemView.getContext().startActivity(orderFood);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView name, description;
        ImageView imgPhoto;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_item_name);
            description = itemView.findViewById(R.id.tv_item_description);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
