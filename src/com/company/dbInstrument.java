package com.company;

public class dbInstrument {

    public int ID;
    public String name;

    public enum callPut {
        CALL,
        PUT
    }

    public dbInstrument(
            int ID,
            String name
            ) {
        this.ID = ID;
        this.name = name;
    }
}