package org.example.Users;

public class Doctor extends Professional {

    public Doctor(String name, int ID, String afdeling) {
        this.name = name;

        super.setName(name);
        super.setID(ID);
        super.setAfdeling(afdeling);
        super.setTitle(title);
    }

}
