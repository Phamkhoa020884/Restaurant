package com.example.restaurant;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {
    public RestaurantAdapter(List<RestaurantModel> listRestau)

    class RestaurantViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView tvName, tvAddress, tvBusinessType, tvDistance, tvsales, tvTimes;
        public  RestaurantViewHolder (@NonNull view itemview){
            super(itemview);
            img = itemView.findViewById(R.id.imageRestaurant);
            tvName= itemView.findViewById(R.id.textViewName);
            tvAddress= itemView.findViewById(R.id.textViewAddress);
            tvDistance= itemView.findViewById(R.id.textViewDistance);
            tvsales = itemView.findViewById(R.id.textGiamgia);
            tvBusinessType = itemView.findViewById(R.id.textRestaurant);
            tvTimes = itemView.findViewById(R.id.textTimes);

        }

    };
}
