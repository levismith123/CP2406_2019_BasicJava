package week8;

public class UseDivision {
    public static void main(String[] args) {

        InternationalDivision account = new InternationalDivision("Levi", 3342,
                "Australia", "English");
        System.out.println(account.display());

        DomesticDivision accountDom = new DomesticDivision("Levi", 4567);
        System.out.println(accountDom.display());

    }


}
