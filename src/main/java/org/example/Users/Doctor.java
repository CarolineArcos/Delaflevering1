package org.example.Users;

public class Doctor extends Professional {

    public Doctor(String navn, int ID, String afdeling) {
        this.navn = navn;

        super.setNavn(navn);
        super.setID(ID);
        super.setAfdeling(afdeling);
    }

}
