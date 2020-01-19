package com.dscproject.cantinplusplus;

import android.os.Parcel;
import android.os.Parcelable;

public class Food implements Parcelable {
    private String name;
    private String description;
    private int foodPic;

    Food(){

    }

    protected Food(Parcel in) {
        name = in.readString();
        description = in.readString();
        foodPic = in.readInt();
    }

    public static final Creator<Food> CREATOR = new Creator<Food>() {
        @Override
        public Food createFromParcel(Parcel in) {
            return new Food(in);
        }

        @Override
        public Food[] newArray(int size) {
            return new Food[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFoodPic() {
        return foodPic;
    }

    public void setFoodPic(int foodPic) {
        this.foodPic = foodPic;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeInt(this.foodPic);
    }
}
