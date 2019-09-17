package model;

import model.Person;

public class Musician extends Person {
    int hairLength;

    Musician(String name, int hairLength) {
        super(name);
        this.hairLength = hairLength;
    }

    @Override
    String talk() {
        return super.talk() + "- .. - ..";
    }
}
