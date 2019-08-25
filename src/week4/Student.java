package week4;

public class Student {

    private int ID_Num;
    private int creditHoursEarned;
    private int points;

    public Student() {
        ID_Num = 9999;
        creditHoursEarned = 3;
        points = 12;
    }

    public void setID(int number) {
        this.ID_Num = number;
    }

    public int getID() {
        return this.ID_Num;
    }

    public void setCreditHoursEarned(int number) {
        this.creditHoursEarned = number;
    }

    public int getCreditHoursEarned() {
        return this.creditHoursEarned;
    }

    public double gpa() {
        return (double) this.points / this.creditHoursEarned;
    }

    public void setPoints(int number) {
        this.points = number;
    }

    public int getPoints() {
        return this.points;
    }
}
