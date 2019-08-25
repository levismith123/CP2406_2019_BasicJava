package week4;

public class Lease {

    private String name;
    private int apartment_Num;
    private int monthly_rent;
    private int months_term;

    public Lease(){
        name = "Morty";
        apartment_Num = 5;
        monthly_rent = 300;
        months_term = 6;
    }

    public void addPetFee(){
        monthly_rent = monthly_rent + 10;
        explainPetPolicy();
    }

    private static void explainPetPolicy(){
        System.out.println("The fee for pets is $10");
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getApartment_Num(){
        return this.apartment_Num;
    }

    public void setApartment_Num(int number){
        this.apartment_Num = number;
    }

    public int getMonthly_rent(){
        return this.monthly_rent;
    }

    public void setMonthly_rent(int rent){
        this.monthly_rent = rent;
    }

    public int getMonths_term(){
        return this.months_term;
    }

    public void setMonths_term(int term){
        this.months_term = term;
    }

}
