package com.example.gitrepositoryandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    String[] s=new String[]{"cal", "magar", "iepure"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter= new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, s);
        ListView listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }

}
