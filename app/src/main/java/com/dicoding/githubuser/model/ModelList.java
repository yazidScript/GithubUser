package com.dicoding.githubuser.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelList implements Parcelable {
    private String NAMA;
    private String FOTO;
    private String ASAL_KOTA;


    public ModelList(Parcel in) {
        NAMA = in.readString();
        FOTO = in.readString();
        ASAL_KOTA = in.readString();
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

    public String getNAMA() {
        return NAMA;
    }

    public void setNAMA(String NAMA) {
        this.NAMA = NAMA;
    }

    public String getFOTO() {
        return FOTO;
    }

    public void setFOTO(String FOTO) {
        this.FOTO = FOTO;
    }

    public String getASAL_KOTA() {
        return ASAL_KOTA;
    }

    public void setASAL_KOTA(String ASAL_KOTA) {
        this.ASAL_KOTA = ASAL_KOTA;
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
        dest.writeString(NAMA);
        dest.writeString(FOTO);
        dest.writeString(ASAL_KOTA);
    }
}
