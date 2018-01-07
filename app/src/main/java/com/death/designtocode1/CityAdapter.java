package com.death.designtocode1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by deathcode on 07/01/18.
 */

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.CustomViewHolder> {


    List<City> cities;
    Context context;

    CityAdapter(Context context, List<City> cities){
        this.context = context;
        this.cities = cities;
    }

    @Override
    public CityAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(context).inflate(R.layout.city_view_item, parent, false ));
    }

    @Override
    public void onBindViewHolder(CityAdapter.CustomViewHolder holder, int position) {
        City city = cities.get(position);
        holder.cityImage.setImageResource(city.getImage_res_id());
        holder.cityName.setText(city.getName());
    }

    @Override
    public int getItemCount() {
        return cities.size();
    }


    class CustomViewHolder extends RecyclerView.ViewHolder{

        ImageView cityImage;
        TextView cityName;
        public CustomViewHolder(View itemView) {
            super(itemView);
            cityName = itemView.findViewById(R.id.city_name);
            cityImage = itemView.findViewById(R.id.city_image);
        }
    }
}
