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
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for four TextViews and a CircularImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context,0, objects);
    }
    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listitemview=convertView;
        if(listitemview==null)//Check if the existing view is being used if not inflate a new view
            listitemview = LayoutInflater.from(getContext()).inflate(R.layout.chat_items, parent, false);
        Items item=getItem(position);//Get the object located at the current position
        TextView mcontact=listitemview.findViewById(R.id.headingchat);
        //Find TextView in chat_items.xml layout with ID headingchat
        mcontact.setText(item.getMcontact());//Get the text from item object and set the text on the mcontact textview
        TextView mtime=listitemview.findViewById(R.id.time);
        //Find TextView in chat_items.xml layout with ID time
        mtime.setText(item.getMtime());//Get the text from item object and set the text on the mtime textview
        TextView mnumber=listitemview.findViewById(R.id.contact);
        //Find TextView in chat_items.xml layout with ID contact
        mnumber.setText(item.getMnumber());//Get the text from item object and set the text on mnumber textview
        TextView mtext=listitemview.findViewById(R.id.text);
        //Find TextView in chat_items.xml layout with ID text
        mtext.setText(item.getMtext());//Get the text from item object and set the text on mtext textview
        CircleImageView profile=listitemview.findViewById(R.id.profile);
        //Find ImageView in chat_items.xml layout with ID profile
        profile.setImageResource(item.getmImageID());//Get the drawable image id from item object
        // and set the image on the profile imageview
        return listitemview;
    }

}
