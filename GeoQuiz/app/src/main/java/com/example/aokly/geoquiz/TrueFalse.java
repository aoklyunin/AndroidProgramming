package com.example.aokly.geoquiz;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by aokly on 25.08.2016.
 */
public class TrueFalse implements Parcelable{
    private int mQuestion;
    private boolean mTrueQuestion;
    private boolean mIsCheated;

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public void setIsCheated(boolean isCheated) {
        mIsCheated = isCheated;
    }

    public boolean isCheated() {

        return mIsCheated;
    }

    public int getQuestion() {

        return mQuestion;

    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public TrueFalse(int mQuestion, boolean mTrueQuestion) {
        this.mQuestion = mQuestion;
        this.mTrueQuestion = mTrueQuestion;
        this.mIsCheated = false;

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mQuestion);
        dest.writeByte((byte) (mTrueQuestion ? 1 : 0));
        dest.writeByte((byte)(mIsCheated?1:0));
    }

    public static final Parcelable.Creator<TrueFalse> CREATOR = new Parcelable.Creator<TrueFalse>() {
        // распаковываем объект из Parcel
        public TrueFalse createFromParcel(Parcel in) {
            return new TrueFalse(in);
        }

        public TrueFalse[] newArray(int size) {
            return new TrueFalse[size];
        }
    };

    private TrueFalse(Parcel parcel){
        mQuestion = parcel.readInt();
        mTrueQuestion = parcel.readByte()==1;
        mIsCheated = parcel.readByte()==1;
    }
}
