package com.example.aokly.criminalintent;

import android.util.Log;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by aokly on 27.08.2016.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    private static final String KEY_CRIME = "CRIME CLASS";

    public void setDate(Date date) {
        mDate = date;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String getDateString() {

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMМ, yyyy");
        String myString = sdf.format(mDate);
        return myString;
    }

    public Date getDate() {

        return mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();

    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getId() {

        return mId;
    }

    public String getTitle() {
        return mTitle;
    }
}
