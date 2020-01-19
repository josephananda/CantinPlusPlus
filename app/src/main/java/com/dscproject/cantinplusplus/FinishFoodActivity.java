package com.dscproject.cantinplusplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinishFoodActivity extends AppCompatActivity {
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_food);
        finish = findViewById(R.id.finish);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToMain = new Intent(FinishFoodActivity.this, MainActivity.class);
                startActivity(goToMain);
            }
        });
    }
}
