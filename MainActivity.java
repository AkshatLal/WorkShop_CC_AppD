package com.example.dell.whatsapp_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Items> chats=new ArrayList<>();
        chats.add(new Items("Coding Club","11:17 pm","+91 9854354352:","Lorem ipsum sit..",R.drawable.p1));
        chats.add(new Items("Emily","10:46 pm","+91 9854354222:","?",R.drawable.p2));
        chats.add(new Items("Jason","5:46 pm","+91 9854354926:","Est placerat mitti",R.drawable.p3));
        chats.add(new Items("George","3:46 pm","+91 985435483:","bibendum pulvinar",R.drawable.p4));
        chats.add(new Items("Brad","11:32 am","+91 9858954367:","Felis elit aliquam..",R.drawable.p5));
        chats.add(new Items("Baby","Yesterday","+91 9854354356:","Love you too",R.drawable.p6));
        chats.add(new Items("Alissa","24/01/19","+91 9854354398:","Wbcc vy i thr",R.drawable.p7));
        chats.add(new Items("James","23/01/19","+91 9854354324:","Sccu blu bhc..",R.drawable.p8));
        chats.add(new Items("Smith","23/01/19","+91 9854354369:","Acedej jvasa ",R.drawable.p9));
        chats.add(new Items("Annie","22/01/19","+91 9854354321:","Lorem ipsum foloni",R.drawable.p10));
        CustomAdapter list=new CustomAdapter(this,chats);
        ListView listView=findViewById(R.id.list);
        listView.setAdapter(list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,Title.class);
                startActivity(intent);
            }
        });
    }
}
