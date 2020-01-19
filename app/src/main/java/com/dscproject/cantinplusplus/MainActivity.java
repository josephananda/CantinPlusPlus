package com.dscproject.cantinplusplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btn_cantin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_cantin = findViewById(R.id.btn_choose_cantin);
        btn_cantin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToCantinList = new Intent(MainActivity.this, CantinActivity.class);
                startActivity(goToCantinList);
            }
        });
    }
}
