package org.example.Sensors;

public abstract class Sensor {
    //attempting inheritance

    protected double value;
    private String portname;

    public double getValue() {
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

    public double getMax() { return max; }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() { return min; }

    public void setMin(double min) {
        this.min = min;
    }

    protected double max, min;

    public Sensor(){


    }

}
