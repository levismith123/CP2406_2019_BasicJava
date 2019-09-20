package week8;

public class InternationalDivision extends Division{

    private String Country;
    private String Language;

    InternationalDivision(String name, int accountNum, String country, String language) {
        super(name, accountNum);
        Country = country;
        Language = language;
    }

    @Override
    String display() {
        return(this.Country + " " + this.Language + " " + this.name + " " + this.accountNum);
    }
}
