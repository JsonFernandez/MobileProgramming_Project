package com.hms.valhalastore_huawei;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hms.valhalastore_huawei.Adapter.MyOrderAdapter;

public class MyOrder extends AppCompatActivity {

    RecyclerView recyclerView;
    TextView totalPayment;
    Button btnPayNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        recyclerView = findViewById(R.id.RecyclerView);
        totalPayment = findViewById(R.id.totalPayment);
        btnPayNow = findViewById(R.id.btnPayNow);

        MyOrderAdapter myOrderAdapter = new MyOrderAdapter(this,this::CalculateTotal);
        recyclerView.setAdapter(myOrderAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CalculateTotal();

        btnPayNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyOrder.this, OrderComplete.class);
                startActivity(intent);
            }
        });
    }

    private void CalculateTotal() {
        int total = 0;

        for(int i = 0 ; i < HomeActivity.Items.size() ; i++){
            total += HomeActivity.Items.get(i).quantity * HomeActivity.Items.get(i).price;
        }

        totalPayment.setText(Integer.toString(total));
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
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}