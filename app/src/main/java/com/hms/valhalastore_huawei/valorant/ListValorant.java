package com.hms.valhalastore_huawei.valorant;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.hms.valhalastore_huawei.HomeActivity;
import com.hms.valhalastore_huawei.MyOrder;
import com.hms.valhalastore_huawei.R;

public class ListValorant extends AppCompatActivity {

    Button btnMyOrder;
    CardView btn420vp, btn700vp, btn1120vp, btn1375vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_valorant);

        btn420vp = findViewById(R.id.btn420vp);
        btn700vp = findViewById(R.id.btn700vp);
        btn1120vp = findViewById(R.id.btn1120vp);
        btn1375vp = findViewById(R.id.btn1375vp);
        btnMyOrder = findViewById(R.id.btnMyOrder);

        btnMyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListValorant.this, MyOrder.class);
                startActivity(intent);
            }
        });

        btn420vp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListValorant.this, buy420vp.class);
                startActivity(intent);
            }
        });

        btn700vp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListValorant.this, buy700vp.class);
                startActivity(intent);
            }
        });

        btn1120vp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListValorant.this, buy1120vp.class);
                startActivity(intent);
            }
        });

        btn1375vp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListValorant.this, buy1375vp.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.nav_mainmenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.navHome:
                Intent intent = new Intent(this, HomeActivity.class);
                startActivity(intent);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}