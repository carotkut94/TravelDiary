package com.death.designtocode1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<City> cities;
    RecyclerView recyclerView;
    CityAdapter cityAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.cities);
        cities = new ArrayList<>();
        cities.add(new City("Jaipur", R.drawable.jaipur));
        cities.add(new City("London", R.drawable.london));
        cities.add(new City("Paris", R.drawable.paris));
        cities.add(new City("Italy", R.drawable.italy));
        cities.add(new City("New York", R.drawable.nyc));
        cityAdapter = new CityAdapter(this, cities);
        recyclerView.setAdapter(cityAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.addItemDecoration(new CustomItemDecoration(36));
    }
}
