package org.example.Sensors;

public abstract class Sensor {
    //attempting inheritance

    protected double value;
    private String portname;

    public double getValue() {
        value = value;
        System.out.println("value is:"+value);
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getPortname() {
        return portname;
    }

    public void setPortname(String portname) {
        this.portname = portname;
    }

    public double getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(double upperLimit) {
        this.upperLimit = upperLimit;
    }

    public double getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(double lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    protected double upperLimit,lowerLimit;

    public Sensor(){


    }

}
