package com.dscproject.cantinplusplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;

import java.util.ArrayList;

public class CantinActivity extends AppCompatActivity {
    private RecyclerView rvCantin;
    private ArrayList<Cantin> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cantin);
        rvCantin = findViewById(R.id.rv_cantin);
        list.addAll(getListCantin());
        showRecyclerCardView();
    }

    public ArrayList<Cantin> getListCantin(){
        String[] dataName = getResources().getStringArray(R.array.data_cantin_name);
        String[] dataFavFood = getResources().getStringArray(R.array.data_cantin_favfood);
        TypedArray dataPhoto = getResources().obtainTypedArray(R.array.data_cantin_photo);
        ArrayList<Cantin> listCantin = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++){
            Cantin cantin = new Cantin();
            cantin.setName(dataName[i]);
            cantin.setFavoriteFood(dataFavFood[i]);
            cantin.setImgPhoto(dataPhoto.getResourceId(i, -1));
            listCantin.add(cantin);
        }
        return listCantin;
    }

    private void showRecyclerCardView(){
        rvCantin.setLayoutManager(new LinearLayoutManager(this));
        CardViewCantinAdapter cardViewCantinAdapter = new CardViewCantinAdapter(list);
        rvCantin.setAdapter(cardViewCantinAdapter);
    }
}
