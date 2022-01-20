package com.hms.valhalastore_huawei.freefire;

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

public class ListFreeFire extends AppCompatActivity{
    
    Button btnMyOrder;
    CardView btn720diamondff, btn1450diamondff, btn2180diamondff, btn3640diamondff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_free_fire);

        btn720diamondff = findViewById(R.id.btn720diamondff);
        btn1450diamondff = findViewById(R.id.btn1450diamondff);
        btn2180diamondff = findViewById(R.id.btn2180diamondff);
        btn3640diamondff = findViewById(R.id.btn3640diamondff);
        btnMyOrder = findViewById(R.id.btnMyOrder);

        btnMyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListFreeFire.this, MyOrder.class);
                startActivity(intent);
            }
        });

        btn720diamondff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListFreeFire.this, buy720diamondff.class);
                startActivity(intent);
            }
        });

        btn1450diamondff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListFreeFire.this, buy1450diamondff.class);
                startActivity(intent);
            }
        });

        btn2180diamondff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListFreeFire.this, buy2180diamondff.class);
                startActivity(intent);
            }
        });

        btn3640diamondff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListFreeFire.this, buy3640diamondff.class);
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
