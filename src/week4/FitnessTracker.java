package week4;

public class FitnessTracker {

    private String activity;
    private int timeSpent;
    private String date;

    public FitnessTracker(){

        activity = "running";
        timeSpent = 0;
        date = "January 1st 2019";

    }

    public FitnessTracker(int minutes, String sport, String fulldate){

        activity = sport;
        timeSpent = minutes;
        date = fulldate;

    }

    public String getActivity(){
        return this.activity;
    }

    public int getTimeSpent(){
        return this.timeSpent;
    }

    public String getDate(){
        return this.date;
    }
}
