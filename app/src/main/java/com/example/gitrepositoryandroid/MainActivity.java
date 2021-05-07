package com.example.gitrepositoryandroid;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.view.Menu;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    String s[]={"cal", "magar", "iepure"};
    String [] listItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter=new ArrayAdapter<String>(this, R.layout.activity_main,s);
        ListView listView=(ListView)findViewById(R.id.list1);
        listView.setAdapter(adapter);

        TextView helloTextView= (TextView) findViewById(R.id.textView);
        helloTextView.setText(Arrays.toString(s));
    }

}
