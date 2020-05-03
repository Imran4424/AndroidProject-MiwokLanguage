package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    RecyclerView numberRecycler;
    ArrayList<String> numbers = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        numberRecycler = (RecyclerView) findViewById(R.id.numberRecycler);

        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");
        numbers.add("six");
        numbers.add("seven");
        numbers.add("eight");
        numbers.add("nine");
        numbers.add("ten");

        final RecyclerView numberRecyclerList = (RecyclerView) findViewById(R.id.numberRecycler);
        final LinearLayoutManager numberLayoutManager = new LinearLayoutManager(this);
    }
}
