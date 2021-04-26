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

    private int Cpr;
    private ArrayList<Double> cpr,temperature,spO2,heartrate;

    public ArrayList<Double> getCpr() {
        return cpr;
    }

    public void setCpr(ArrayList<Double> values1) {
        this.cpr = cpr;
    }

    public ArrayList<Double> getTemperature() {
        return temperature;
    }

    public void setTemperature(ArrayList<Double> values2) {
        this.temperature = temperature;
    }

    public ArrayList<Double> getSpO2() {
        return spO2;
    }

    public void setSpO2(ArrayList<Double> spO2) {
        this.spO2 = spO2;
    }

    public ArrayList<Double> getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(ArrayList<Double> heartrate) {
        this.heartrate = heartrate;
    }

    public int getCPR() {
        return Cpr;
    }

    public void setCPR(int cpr) {
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
