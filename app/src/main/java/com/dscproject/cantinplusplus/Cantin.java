package com.dscproject.cantinplusplus;

import android.os.Parcel;
import android.os.Parcelable;

public class Cantin implements Parcelable {
    String name;
    String favoriteFood;
    int imgPhoto;

    Cantin(){

    }

    protected Cantin(Parcel in) {
        name = in.readString();
        favoriteFood = in.readString();
        imgPhoto = in.readInt();
    }

    public static final Creator<Cantin> CREATOR = new Creator<Cantin>() {
        @Override
        public Cantin createFromParcel(Parcel in) {
            return new Cantin(in);
        }

        @Override
        public Cantin[] newArray(int size) {
            return new Cantin[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public int getImgPhoto() {
        return imgPhoto;
    }

    public void setImgPhoto(int imgPhoto) {
        this.imgPhoto = imgPhoto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.favoriteFood);
        parcel.writeInt(this.imgPhoto);
    }
}
