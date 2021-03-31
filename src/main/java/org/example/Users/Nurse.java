package org.example.Users;

public class Nurse extends Professional {
    public Nurse (String name, int ID, String afdeling, String title){
        this.name = name;

        super.setName(name);
        super.setID(ID);
        super.setAfdeling(afdeling);
        super.setTitle(title);

    }
}
