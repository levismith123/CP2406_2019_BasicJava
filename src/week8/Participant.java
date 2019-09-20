package week8;

public class Participant {

    private String name;
    private int age;
    private String streetAddress;

    Participant(String Name, int Age, String StreetAddress){

        this.name = Name;
        this.age = Age;
        this.streetAddress = StreetAddress;

    }

    public String toString(){
        return this.name + " " + this.age + " " + this.streetAddress;
    }

    public boolean equals(String Name, int Age, String StreetAddress){
        return Name.equals(this.name) && Age == this.age && StreetAddress.equals(this.streetAddress);
    }
}
