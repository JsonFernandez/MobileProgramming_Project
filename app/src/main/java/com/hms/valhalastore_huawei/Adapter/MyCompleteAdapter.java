package com.hms.valhalastore_huawei.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hms.valhalastore_huawei.Item;
import com.hms.valhalastore_huawei.HomeActivity;
import com.hms.valhalastore_huawei.R;


public class MyCompleteAdapter extends RecyclerView.Adapter<MyCompleteAdapter.MyViewHolder>{

    Context context;

    public MyCompleteAdapter(Context ct){
        context = ct;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_list_complete_order,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        String quantityTemp = String.valueOf(HomeActivity.Items.get(position).quantity);
        String priceTemp = String.valueOf(HomeActivity.Items.get(position).price);

        holder.item.setText(HomeActivity.Items.get(position).name);
        holder.quantity.setText(quantityTemp);
        holder.price.setText(priceTemp);

        Item item = HomeActivity.Items.get(position);
    }

    @Override
    public int getItemCount() {
        return HomeActivity.Items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView item, quantity, price;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item = itemView.findViewById(R.id.item);
            quantity = itemView.findViewById(R.id.itemQuantity);
            price = itemView.findViewById(R.id.itemPrice);
        }

    }


}
