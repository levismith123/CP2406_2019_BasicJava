package week8;

abstract class Division {

    String name;
    int accountNum;

    abstract String display();

    Division(String name, int accountNum){

        this.name = name;
        this.accountNum = accountNum;
    }


}
