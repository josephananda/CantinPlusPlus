package com.dscproject.cantinplusplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderFoodActivity extends AppCompatActivity {
    Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_food);
        order = findViewById(R.id.order);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loadingFood = new Intent(OrderFoodActivity.this, CookingActivity.class);
                startActivity(loadingFood);
            }
        });
    }
}
