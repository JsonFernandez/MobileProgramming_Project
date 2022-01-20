package com.hms.valhalastore_huawei;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import com.hms.valhalastore_huawei.freefire.ListFreeFire;
import com.hms.valhalastore_huawei.genshinimpact.ListGenshinImpact;
import com.hms.valhalastore_huawei.mobilelegend.ListMobileLegend;
import com.hms.valhalastore_huawei.valorant.ListValorant;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    public static ArrayList<Item> Items = new ArrayList<Item>();
    Button btnMyOrder;
    CardView btnValorant, btnGenshinImpact, btnMobileLegend, btnfreefire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnValorant = findViewById(R.id.btnValorant);
        btnGenshinImpact = findViewById(R.id.btnGenshinImpact);
        btnMobileLegend = findViewById(R.id.btnMobileLegend);
        btnfreefire = findViewById(R.id.btnFreeFire);
        btnMyOrder = findViewById(R.id.btnMyOrder);

        btnMyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MyOrder.class);
                startActivity(intent);
            }
        });

        btnValorant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ListValorant.class);
                startActivity(intent);
            }
        });

        btnGenshinImpact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ListGenshinImpact.class);
                startActivity(intent);
            }
        });

        btnMobileLegend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ListMobileLegend.class);
                startActivity(intent);
            }
        });

        btnfreefire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ListFreeFire.class);
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
