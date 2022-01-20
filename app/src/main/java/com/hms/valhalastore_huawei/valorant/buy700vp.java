package com.hms.valhalastore_huawei.valorant;

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

public class buy700vp extends AppCompatActivity {

    Button btnOrderMore, add700vp, btnMyOrder;
    EditText q_700_vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_700_vp);

        btnOrderMore = findViewById(R.id.btnOrderMore);
        btnMyOrder = findViewById(R.id.btnMyOrder);
        add700vp = findViewById(R.id.add700vp);
        q_700_vp = findViewById(R.id.qty_700_vp);

        btnOrderMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy700vp.this, ListValorant.class);
                startActivity(intent);
            }
        });

        btnMyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy700vp.this, MyOrder.class);
                startActivity(intent);
            }
        });

        add700vp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Item item = new Item();
                item.name = "700 Valorant Point";
                item.price = 79000;
                item.quantity = Integer.parseInt(q_700_vp.getText().toString());
                Toast.makeText(buy700vp.this,"You Ordered "+item.name+" With Quantity "
                        + q_700_vp.getText().toString(),Toast.LENGTH_SHORT).show();
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