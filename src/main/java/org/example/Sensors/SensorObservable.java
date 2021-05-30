package org.example.Sensors;

public interface SensorObservable extends Runnable{
    void register(SensorObserver sensorObserver);
}
