package com.example.dell.whatsapp_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Title extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
        Intent intent=getIntent();
        setTitle(intent.getExtras().getString("title"));//Setting the title obtained from the listitem clicked
    }
}
