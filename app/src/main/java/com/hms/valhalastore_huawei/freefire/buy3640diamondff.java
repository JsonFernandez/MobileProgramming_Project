package com.hms.valhalastore_huawei.freefire;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.hms.valhalastore_huawei.Item;
import com.hms.valhalastore_huawei.HomeActivity;
import com.hms.valhalastore_huawei.MyOrder;
import com.hms.valhalastore_huawei.R;

public class buy3640diamondff extends AppCompatActivity {

    Button btnOrderMore, add3640diamondff, btnMyOrder;
    EditText q_3640_diamond_ff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_3640_diamond_ff);

        btnOrderMore = findViewById(R.id.btnOrderMore);
        btnMyOrder = findViewById(R.id.btnMyOrder);
        add3640diamondff = findViewById(R.id.add3640diamondff);
        q_3640_diamond_ff = findViewById(R.id.qty_3640_diamond_ff);

        btnOrderMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy3640diamondff.this, ListFreeFire.class);
                startActivity(intent);
            }
        });

        btnMyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy3640diamondff.this, MyOrder.class);
                startActivity(intent);
            }
        });

        add3640diamondff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Item item = new Item();
                item.name = "3640 Diamond_ff";
                item.price = 500000;
                item.quantity = Integer.parseInt(q_3640_diamond_ff.getText().toString());
                Toast.makeText(buy3640diamondff.this,"You Ordered " +item.name+" With Quantity "
                        + q_3640_diamond_ff.getText().toString(),Toast.LENGTH_SHORT).show();
                HomeActivity.Items.add(item);
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
