package week8;

public abstract class PhoneCall {

    private String phoneNum;
    private double price;

    PhoneCall(String phoneNumber){
        phoneNum = phoneNumber;
        price = 0.0;
    }

    void setPrice(double price) {
        this.price = price;
    }

    abstract void getPhoneNum();
    abstract void getPrice();
    abstract void displayCall();

    public static class IncomingPhoneCall extends PhoneCall{

        IncomingPhoneCall(String phoneNumber) {
            super(phoneNumber);
            setPrice(0.02);
        }

        @Override
        void getPhoneNum() {

        }

        @Override
        void getPrice() {

        }

        @Override
        void displayCall() {

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
        void getPhoneNum() {

        }

        @Override
        void getPrice() {

        }

        @Override
        void displayCall() {

        }
    }
}
