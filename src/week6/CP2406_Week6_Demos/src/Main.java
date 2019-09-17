import model.Musician;
import model.Person;
import model.Student;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Person person;
        if (random.nextBoolean()) {
            person = new Student("Eden");
        } else {
            person = new Musician("Jase", 18);
        }

        System.out.println(person.talk());

//        person.n

    }
}
