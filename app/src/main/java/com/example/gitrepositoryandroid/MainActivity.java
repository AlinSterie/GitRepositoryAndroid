package com.example.gitrepositoryandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Animal dog=new Animal("Azor","4","Doberman","15");
    Animal cat=new Animal("Kittie","6","Bengal","4");
    Animal horse=new Animal("Marcel","10","Arabian","500");
    private ArrayList<Animal> arrayList=new ArrayList<>();
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=findViewById(R.id.listView);
        arrayList.add(dog);
        arrayList.add(cat);
        arrayList.add(horse);
        adapter=new MyAdapter(this,arrayList);
        listView.setAdapter(adapter);


    }

}
