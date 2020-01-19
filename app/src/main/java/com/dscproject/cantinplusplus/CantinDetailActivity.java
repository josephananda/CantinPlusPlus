package com.dscproject.cantinplusplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;

import java.util.ArrayList;

public class CantinDetailActivity extends AppCompatActivity {
    private RecyclerView rvFood;
    private ArrayList<Food> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cantin_detail);
        rvFood = findViewById(R.id.rv_food);
        list.addAll(getListFood());
        showRecyclerList();
    }

    public ArrayList<Food> getListFood(){
        String[] dataName = getResources().getStringArray(R.array.data_food_name);
        String[] dataDescription = getResources().getStringArray(R.array.data_food_description);
        TypedArray dataPhoto = getResources().obtainTypedArray(R.array.data_food_photo);
        ArrayList<Food> listFood = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++){
            Food food = new Food();
            food.setName(dataName[i]);
            food.setDescription(dataDescription[i]);
            food.setFoodPic(dataPhoto.getResourceId(i, -1));
            listFood.add(food);
        }
        return listFood;
    }

    private void showRecyclerList(){
        rvFood.setLayoutManager(new LinearLayoutManager(this));
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(list);
        rvFood.setAdapter(listFoodAdapter);
    }
}