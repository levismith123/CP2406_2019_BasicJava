package model;

public class Person {
    String name;

//    model.Person() {}

    Person(String name) {
        this.name = name;
    }

    // talk is overloaded...
    String talk(String message) {
        return name + " says " + message;
    }

    String talk() {
        return "zzzzz";
    }
}
