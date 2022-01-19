package com.example.lessons4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        loadData();
        adapter = new Adapter(names);
        recyclerView.setAdapter(adapter);


    }

    private void loadData() {
        names = new ArrayList<>();
        names.add("Sagynaly");
        names.add("Bakiy");
        names.add("Jomart");
        names.add("Sagynaly");
        names.add("Sagynaly");
        names.add("Sagynaly");
        names.add("Sagynaly");
        names.add("Sagynaly");
        names.add("Sagynaly");
        names.add("Sagynaly");
        names.add("Sagynaly");
        names.add("Sagynaly");
        names.add("Sagynaly");
        names.add("Sagynaly");
        names.add("Sagynaly");


    }
}