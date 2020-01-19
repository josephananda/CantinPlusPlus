package com.dscproject.cantinplusplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CookingActivity extends AppCompatActivity {
    ImageView cook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking);
        cook = findViewById(R.id.cook);
        cook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent finish = new Intent(CookingActivity.this, FinishFoodActivity.class);
                startActivity(finish);
            }
        });
    }
}
