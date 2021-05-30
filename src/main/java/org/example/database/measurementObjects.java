package org.example.database;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.util.ArrayList;

public class measurementObjects {

    /*private int CPRid;
    private ArrayList<Double> cpr,temp,spO2,hr;

    public ArrayList<Double> getCpr(){return cpr;}

    public void setCPR(int cpr) {
        this.cpr = cpr;
    }*/

    public measurementObjects(int cpr, Double temperature, Double sp02, Double heartrate) {
        this.Cpr = cpr;
        this.temperature = temperature;
        this.spO2 = sp02;
        this.heartrate = heartrate;
    }

    private int Cpr;
    private Double temperature,spO2,heartrate;

    public int getCpr() {
        return Cpr;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getSpO2() {
        return spO2;
    }

    public void setSpO2(Double spO2) {
        this.spO2 = spO2;
    }

    public Double getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(Double heartrate) {
        this.heartrate = heartrate;
    }

    public void setCpr(int cpr) {
        Cpr = cpr;
    }

/*private IntegerProperty cprProperty;

    private DoubleProperty tempProperty;

    private DoubleProperty spO2Property;

    private IntegerProperty hrProperty;

    public void VisData(){
        this.cprProperty = new SimpleIntegerProperty();
        this.tempProperty = new SimpleDoubleProperty();
        this.spO2Property = new SimpleDoubleProperty();
        this.hrProperty = new SimpleIntegerProperty();
    }
// CPR
    public int getCpr(){
        return cprProperty.get();
    }

    public void setCprProperty(int cpr){
        this.cprProperty.set(cpr);
    }

    public IntegerProperty getDataCpr(){
        return cprProperty;
    }
// Temperatur
    public double getTemp(){
        return tempProperty.get();
    }

    public void setTempProperty(double temperature){
        this.tempProperty.set(temperature);
    }

    public DoubleProperty getDataTemp(){
        return tempProperty;
    }
// spO2
    public double getSpO2(){
        return spO2Property.get();
    }

    public void setSpO2Property(double spO2){
        this.spO2Property.set(spO2);
    }

    public DoubleProperty getDataSpO2(){
        return spO2Property;
    }

    public int getHr(){
        return hrProperty.get();
    }

    public void setHrProperty(int heartrate){
        this.hrProperty.set(heartrate);
    }

    public IntegerProperty getDataHr(){
        return hrProperty;
    }*/
}
