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
        ArrayList<Items> chats=new ArrayList<>();//Array List to store details of chats
        chats.add(new Items("Coding Club","23:17","+91 9854354352:","workshop done",R.drawable.p1));
        chats.add(new Items("Evan","22:46","","?",R.drawable.p2));
        chats.add(new Items("Emily","17:46","","How about lunch?",R.drawable.p3));
        chats.add(new Items("George","15:46","","Nice game!",R.drawable.p4));
        chats.add(new Items("Brad","11:32","","Thnx m8",R.drawable.p5));
        chats.add(new Items("Robert","Yesterday","","Okay got it",R.drawable.p6));
        chats.add(new Items("Alissa","24/01/19","","Anyone playing?",R.drawable.p7));
        chats.add(new Items("James","23/01/19","","Come to the ground",R.drawable.p8));
        chats.add(new Items("Annie","23/01/19","","Had a great time",R.drawable.p9));
        chats.add(new Items("Smith","22/01/19","","Project finished",R.drawable.p10));
        //Creating Array List
        final CustomAdapter list=new CustomAdapter(this,chats);//Custom Adapter to convert Array List of
        //objects into view items loaded into listview container
        ListView listView=findViewById(R.id.list);//Find listview in activity_main.xml with ID list
        listView.setAdapter(list);//Setting the adapter
        //Defining an onClickListener to handle the events on clicking an item in the listview
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,Title.class);
                String title=list.getItem(position).getMcontact();
                intent.putExtra("title",title);
                startActivity(intent);//Starting new activity and sending the contact name for new activity title
            }
        });
    }
}
