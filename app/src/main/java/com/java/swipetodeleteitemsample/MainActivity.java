package com.java.swipetodeleteitemsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> itemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        addData();
        addRecyclerView();
    }

    private void addData() {
        itemList.add("Abcd");
        itemList.add("Abcd");
        itemList.add("Abcd");
        itemList.add("Abcd");
        itemList.add("Abcd");
    }

    private void addRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapter adapter = new MyAdapter(this,itemList);
        recyclerView.setAdapter(adapter);
    }



}