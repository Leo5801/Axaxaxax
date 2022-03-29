package com.example.axaxaxax;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("John Wick","johnwick@email.com",R.drawable.a));
        items.add(new Item("John Wick","johnwick@email.com",R.drawable.b));
        items.add(new Item("John Wick","johnwick@email.com",R.drawable.c));
        items.add(new Item("John Wick","johnwick@email.com",R.drawable.d));
        items.add(new Item("John Wick","johnwick@email.com",R.drawable.e));
        items.add(new Item("John Wick","johnwick@email.com",R.drawable.f));
        items.add(new Item("John Wick","johnwick@email.com",R.drawable.g));
        items.add(new Item("John Wick","johnwick@email.com",R.drawable.a));
        items.add(new Item("John Wick","johnwick@email.com",R.drawable.b));
        items.add(new Item("John Wick","johnwick@email.com",R.drawable.c));
        items.add(new Item("John Wick","johnwick@email.com",R.drawable.d));
        items.add(new Item("John Wick","johnwick@email.com",R.drawable.e));
        items.add(new Item("John Wick","johnwick@email.com",R.drawable.f));
        items.add(new Item("John Wick","johnwick@email.com",R.drawable.g));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


    }
}