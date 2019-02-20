package com.example.weektwodaytwohomework;

import android.os.Parcel;
import android.os.Parcelable;

public class Car implements Parcelable {
    private String Make;
    private String Model;
    private String Year;
    private String TitleStatus;
    private String Engine;
    private String Color;
    private String Transmission;

    public Car(String make, String model, String year, String titleStatus, String engine, String color, String transmission) {
        Make = make;
        Model = model;
        Year = year;
        TitleStatus = titleStatus;
        Engine = engine;
        Color = color;
        Transmission = transmission;
    }

    protected Car(Parcel in) {
        Make = in.readString();
        Model = in.readString();
        Year = in.readString();
        TitleStatus = in.readString();
        Engine = in.readString();
        Color = in.readString();
        Transmission = in.readString();
    }

    public static final Creator<Car> CREATOR = new Creator<Car>() {
        @Override
        public Car createFromParcel(Parcel in) {
            return new Car(in);
        }

        @Override
        public Car[] newArray(int size) {
            return new Car[size];
        }
    };

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getTitleStatus() {
        return TitleStatus;
    }

    public void setTitleStatus(String titleStatus) {
        TitleStatus = titleStatus;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getTransmission() {
        return Transmission;
    }

    public void setTransmission(String transmission) {
        Transmission = transmission;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Make);
        dest.writeString(Model);
        dest.writeString(Year);
        dest.writeString(TitleStatus);
        dest.writeString(Engine);
        dest.writeString(Color);
        dest.writeString(Transmission);
    }
}
