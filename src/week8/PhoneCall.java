package week8;

public abstract class PhoneCall {

    String phoneNum;
    double price;

    PhoneCall(String phoneNumber){
        phoneNum = phoneNumber;
        price = 0.0;
    }

    void setPrice(double price) {
        this.price = price;
    }

    abstract String getPhoneNum();
    abstract double getPrice();
    abstract String displayCall();

    public static class IncomingPhoneCall extends PhoneCall{

        IncomingPhoneCall(String phoneNumber) {
            super(phoneNumber);
            setPrice(0.02);
        }

        @Override
        String getPhoneNum() {
            return this.phoneNum;
        }

        @Override
        double getPrice() {
            return this.price;
        }

        @Override
        String displayCall() {
            return(getPhoneNum() + " " + getPrice());
        }
    }

    public static class OutgoingPhoneCall extends PhoneCall{

        private int minutesTime;

        OutgoingPhoneCall(String phoneNumber, int time) {
            super(phoneNumber);
            setPrice(0.04);
            minutesTime = time;
        }

        @Override
        String getPhoneNum() {
            return this.phoneNum;
        }

        @Override
        double getPrice() {
            return this.price;
        }

        @Override
        String displayCall() {
           double totalCost = minutesTime * getPrice();
           return(getPhoneNum() + " " + getPrice() + " " + minutesTime + " " + totalCost);
        }
    }
}
