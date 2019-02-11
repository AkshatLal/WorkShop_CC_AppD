package com.example.dell.whatsapp_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

class CustomAdapter extends ArrayAdapter<Items> {
    public CustomAdapter(Context context, ArrayList<Items> objects) {

        super(context,0, objects);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listitemview=convertView;
        if(listitemview==null)
            listitemview = LayoutInflater.from(getContext()).inflate(R.layout.chat_items, parent, false);
        Items item=getItem(position);
        TextView mcontact=listitemview.findViewById(R.id.headingchat);
        mcontact.setText(item.getMcontact());
        TextView mtime=listitemview.findViewById(R.id.time);
        mtime.setText(item.getMtime());
        TextView mnumber=listitemview.findViewById(R.id.contact);
        mnumber.setText(item.getMnumber());
        TextView mtext=listitemview.findViewById(R.id.text);
        mtext.setText(item.getMtext());//setting text
        CircleImageView profile=listitemview.findViewById(R.id.profile);
        profile.setImageResource(item.getmImageID());//setting profile images
        return listitemview;
    }

}
