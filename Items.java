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
    }

    public String getMcontact() {
        return mcontact;
    }

    public String getMtime() {
        return mtime;
    }

    public String getMnumber() {
        return mnumber;
    }

    public String getMtext() {
        return mtext;
    }
    public int getmImageID(){
        return mImageID;
    }
}
