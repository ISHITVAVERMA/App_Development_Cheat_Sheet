package com.example.recycler_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List <ListItem> listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.Recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItem = new ArrayList<>();

        for(int i=0;i<50;i++)
        {
            ListItem item=new ListItem(
                    "Item"+(i+1),

                    "Description"+(i+1),
                    "rating"+(i+1)
            );

            listItem.add(item);
        }
        adapter=new MyAdapter(this,listItem);
        recyclerView.setAdapter(adapter);
    }
}