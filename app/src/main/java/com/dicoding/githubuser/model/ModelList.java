package com.dicoding.githubuser.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelList implements Parcelable {
    private int ID;
    private String USERNAME;
    private int AVATAR;
    private String NAME;
    private int FOLLOWER;
    private int FOLLOWING;
    private String COMPANY;
    private String BIO;

    public ModelList(String username, int avatar, String name, int follower, int following, String company, String bio) {
    }

    public ModelList(Parcel in) {
        ID = in.readInt();
        USERNAME = in.readString();
        AVATAR = in.readInt();
        NAME = in.readString();
        FOLLOWER = in.readInt();
        FOLLOWING = in.readInt();
        COMPANY = in.readString();
        BIO = in.readString();
    }

    public static final Creator<ModelList> CREATOR = new Creator<ModelList>() {
        @Override
        public ModelList createFromParcel(Parcel in) {
            return new ModelList(in);
        }

        @Override
        public ModelList[] newArray(int size) {
            return new ModelList[size];
        }
    };

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public int getAVATAR() {
        return AVATAR;
    }

    public void setAVATAR(int AVATAR) {
        this.AVATAR = AVATAR;
    }

    public int getFOLLOWER() {
        return FOLLOWER;
    }

    public void setFOLLOWER(int FOLLOWER) {
        this.FOLLOWER = FOLLOWER;
    }

    public int getFOLLOWING() {
        return FOLLOWING;
    }

    public void setFOLLOWING(int FOLLOWING) {
        this.FOLLOWING = FOLLOWING;
    }

    public String getCOMPANY() {
        return COMPANY;
    }

    public void setCOMPANY(String COMPANY) {
        this.COMPANY = COMPANY;
    }

    public String getBIO() {
        return BIO;
    }

    public void setBIO(String BIO) {
        this.BIO = BIO;
    }

    public static Creator<ModelList> getCREATOR() {
        return CREATOR;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(ID);
        dest.writeString(USERNAME);
        dest.writeInt(AVATAR);
        dest.writeString(NAME);
        dest.writeInt(FOLLOWER);
        dest.writeInt(FOLLOWING);
        dest.writeString(COMPANY);
        dest.writeString(BIO);
    }
}
