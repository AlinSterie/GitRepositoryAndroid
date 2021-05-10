package com.example.gitrepositoryandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {
    public class Animal{
        String name;
        String age;
        String race;
        String weight;
        public Animal(String n,String a,String r,String w){
            name=n;
            age=a;
            race=a;
            weight=w;
        }
        public String[] return_details(Animal animal){
            String[] details=new String[]{animal.name, animal.age, animal.race,animal.weight};
            return details;
        }
    }
    String[] s=new String[]{"cal", "magar", "iepure"};
    Animal dog=new Animal("Azor","4","Doberman","15");
    Animal cat=new Animal("Kittie","6","Bengal","4");
    Animal horse=new Animal("Marcel","10","Arabian","500");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter1= new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, dog.return_details(dog));
        ListView listView1=(ListView)findViewById(R.id.listView1);
        listView1.setAdapter(adapter1);
        ArrayAdapter adapter2= new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, cat.return_details(cat));
        ListView listView2=(ListView)findViewById(R.id.listView2);
        listView2.setAdapter(adapter2);
        ArrayAdapter adapter3= new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item,horse.return_details(horse));
        ListView listView3=(ListView)findViewById(R.id.listView3);
        listView3.setAdapter(adapter3);

    }

}
