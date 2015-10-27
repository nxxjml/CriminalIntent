package com.dutoe.criminalintent;

import java.util.UUID;

/**
 * Created by caohx on 2015/10/26.
 */
public class Crime {
    private UUID mID;
    private String mTitle;

    public Crime() {
        //Generate unique identifier
        mID = UUID.randomUUID();
    }

    public UUID getmID() {
        return mID;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmTitle() {
        return mTitle;
    }
}
