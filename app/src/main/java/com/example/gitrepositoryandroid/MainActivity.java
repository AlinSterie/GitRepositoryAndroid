package com.example.gitrepositoryandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Animal dog=new Animal("Azor","4","Doberman","15");
    Animal cat=new Animal("Kittie","6","Bengal","4");
    Animal horse=new Animal("Marcel","10","Arabian","500");
    private ArrayList<Animal> arrayList=new ArrayList<>();
    MyAdapter adapter;
    private TextView mTextViewResult;
    private RequestQueue mQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextViewResult=findViewById(R.id.text_view_result);
        Button buttonParse=findViewById(R.id.button_parse);
        mQueue= Volley.newRequestQueue(this);
        buttonParse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jasonParse();
            }
        });

    }
    private void jasonParse(){
        String url="https://run.mocky.io/v3/9bb8aac5-2cce-4b35-ae8a-6f99939d8584";
        JsonObjectRequest request=new JsonObjectRequest(Request.Method.GET, url, null
                , new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArray=response.getJSONArray("animals");
                    mTextViewResult.append("\n\n\n");
                    for(int i=0;i<jsonArray.length();i++){
                        JSONObject animals=jsonArray.getJSONObject(i);
                        String name=animals.getString("name");
                        String age=animals.getString("age");
                        String race= animals.getString("race");
                        String weight=animals.getString("weight");
                        mTextViewResult.append(name+", "+age+", "+race+", "+weight+"\n\n");
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        mQueue.add(request);
    }


}
