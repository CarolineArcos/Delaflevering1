package org.example.database;

import org.example.Sensors.HRSensor;
import org.example.Sensors.SpO2sensor;
import org.example.Sensors.TemperatureSensor;

import java.sql.Connection;
import java.util.ArrayList;

public class Main {

    TemperatureSensor ts = new TemperatureSensor();
    SpO2sensor spO2sensor = new SpO2sensor();
    HRSensor hrSensor = new HRSensor();

    public static void main(String[] args) {
        ConnectionSingleton singleton = new ConnectionSingleton();

        Connection conn = singleton.connectToSQLite("identifier.sqlite");
        ConnectionUser cu = new ConnectionUser(conn);
        MeasurementDTO cm = new MeasurementDTO(conn);
        //cu.InsertInUsers(140499,"Emilie","password", "patient");

       /* for (int i = 0; i < 20; i++) {
            cm.InsertInMeasurements(140499, ((double) (40.1 - (Math.random() * 5.0))), (double) (100.1 - (Math.random() * 6)), (int) (Math.round(110 - (Math.random() * 60))));

        }*/


        ArrayList<MeasurementObjects> result = cm.FindAllMeasurementResultsByCPR(140499);
        for (MeasurementObjects r:result) {
            System.out.println(r.getHeartrate());
        }


    /*UseDB dbuser = new UseDB(mysql);


      for (int i=0;i<30;i++){

           dbuser.insertMeasurementsIntoTable(3402,((int) (Math.random()*1000)) ) ;
       }//Connection c1 = singleTon.connectToSQLITE("sqlitefilnavn");

        dbuser.findAllMeasurementsFromPatient(0,21);

    }*/

    }
}
