package com.example.task4_mobile_khuntapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvKomik;
    private ArrayList<Komik> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        rvKomik = findViewById(R.id.rv_daftar_komik);
        rvKomik.setHasFixedSize(true);
        list.addAll(KomikData.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        rvKomik.setLayoutManager(new LinearLayoutManager(this));
        KomikRecycleAdapter komikAdapter = new KomikRecycleAdapter(list);
        rvKomik.setAdapter(komikAdapter);

        komikAdapter.setOnItemClickCallback(new KomikRecycleAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Komik data) {

            }
        });
    }
}