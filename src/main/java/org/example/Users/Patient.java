package org.example.Users;

public class Patient extends Person {

    private String diagnosis;
    public Patient(String name, String CPR, double height, String diagnosis){
        this.name = name;

        super.setName(name);
        super.CPR=CPR;
        this.diagnosis=diagnosis;
        super.height=height;
    }

    public String getDiagnosis(){
        return diagnosis;

    }
    public void setDiagnosis(String diagnosis){
        this.diagnosis=diagnosis;


    }


}
