package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LinearLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ItemModel> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(MainActivity.this);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycelerView);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(rowListItem, MainActivity.this);
        rView.setAdapter(rcAdapter);
    }



    private List<ItemModel> getAllItemList(){

        List<ItemModel> allItems = new ArrayList<>();

        allItems.add(new ItemModel("৪১তম বি সি এস","নতুন করে জানুন নতুন কিছু শিখুন",R.drawable.bcslogo));
        allItems.add(new ItemModel("৪০তম বি সি এস ","নতুন করে জানুন নতুন কিছু শিখুন",R.drawable.bcslogo));
        allItems.add(new ItemModel("৩৯তম বি সি এস ","নতুন করে জানুন নতুন কিছু শিখুন",R.drawable.bcslogo));
        allItems.add(new ItemModel("৩৮তম বি সি এস ","নতুন করে জানুন নতুন কিছু শিখুন",R.drawable.bcslogo));
        allItems.add(new ItemModel("৩৭তম বি সি এস ","নতুন করে জানুন নতুন কিছু শিখুন",R.drawable.bcslogo));
        allItems.add(new ItemModel("৩৬তম বি সি এস ","নতুন করে জানুন নতুন কিছু শিখুন",R.drawable.bcslogo));
        allItems.add(new ItemModel("৩৫তম বি সি এস ","নতুন করে জানুন নতুন কিছু শিখুন",R.drawable.bcslogo));


        return allItems;
    }









}
