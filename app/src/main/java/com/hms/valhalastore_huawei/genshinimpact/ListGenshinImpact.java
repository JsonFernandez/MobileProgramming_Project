package com.hms.valhalastore_huawei.genshinimpact;

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

public class ListGenshinImpact extends AppCompatActivity {

    Button btnMyOrder;
    CardView btnBlessingWelkin, btn980gs, btn1980gs, btn3280gs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_genshin_impact);

        btnBlessingWelkin = findViewById(R.id.btnBlessingWelkin);
        btn980gs = findViewById(R.id.btn980GenesisCrystal);
        btn1980gs = findViewById(R.id.btn1980GenesisCrystal);
        btn3280gs = findViewById(R.id.btn3280GenesisCrystal);
        btnMyOrder = findViewById(R.id.btnMyOrder);

        btnMyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListGenshinImpact.this, MyOrder.class);
                startActivity(intent);
            }
        });

        btnBlessingWelkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListGenshinImpact.this, buyBlessingWelkin.class);
                startActivity(intent);
            }
        });

        btn980gs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListGenshinImpact.this, buy980gs.class);
                startActivity(intent);
            }
        });

        btn1980gs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListGenshinImpact.this, buy1980gs.class);
                startActivity(intent);
            }
        });

        btn3280gs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListGenshinImpact.this, buy3280gs.class);
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