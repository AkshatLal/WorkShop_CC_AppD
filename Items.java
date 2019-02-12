package com.example.dell.whatsapp_listview;

class Items {
    private String mcontact,mtime,mnumber,mtext;
    int mImageID;
    public Items(String mcontact, String mtime, String mnumber, String mtext, int mImageID) {
        this.mcontact = mcontact;
        this.mtime = mtime;
        this.mnumber = mnumber;
        this.mtext = mtext;
        this.mImageID=mImageID;
    }//Constructor to initialize the class Items parameters

    public String getMcontact() {
        return mcontact;
    }//Getter method to return contact name

    public String getMtime() {
        return mtime;
    }//Getter method to return time

    public String getMnumber() {
        return mnumber;
    }//Getter method to return sender number

    public String getMtext() {
        return mtext;
    }//Getter method to return text

    public int getmImageID(){ return mImageID; }//Getter method to return id of the image resource
}
