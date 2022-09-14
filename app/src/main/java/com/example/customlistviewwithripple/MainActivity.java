package com.example.customlistviewwithripple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView customlist;
    UserPojo userpojo;
    UserAdapter userAdapter;
    List<UserPojo> userpojoList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customlist=findViewById(R.id.simplelist);
        userAdapter=new UserAdapter(this,userpojoList);
        customlist.setAdapter(userAdapter);

        loadUserData();
        customlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("countrieskey",userpojoList.get(i).getCountries());
                intent.putExtra("capitalkey",userpojoList.get(i).getCapital());
                intent.putExtra("imagekey",userpojoList.get(i).getImage());
                startActivity(intent);
            }
        });
    }


    private  void loadUserData(){
        userpojo=new UserPojo(R.drawable.india,"India","Delhi");
        userpojoList.add(userpojo);
        userpojo=new UserPojo(R.drawable.germany1,"Germany","Berlin");
        userpojoList.add(userpojo);

        userpojo=new UserPojo(R.drawable.unitedkingdom,"United Kingdom","London");
        userpojoList.add(userpojo);
        userpojo=new UserPojo(R.drawable.australia,"Australia","Vinna");
        userpojoList.add(userpojo);
        userAdapter.notifyDataSetChanged();
    }
    }
