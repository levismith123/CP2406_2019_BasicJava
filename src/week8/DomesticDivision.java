package week8;

public class DomesticDivision extends Division {

    DomesticDivision(String name, int accountNum) {
        super(name, accountNum);
    }

    @Override
    String display() {
        return (name + " " + accountNum);
    }
}
