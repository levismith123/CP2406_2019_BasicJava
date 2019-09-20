package week8;

public class PhoneCallArray{

    public static void main(String[] args) {

        int a = 10;
        PhoneCall[] phoneCalls = new PhoneCall[a];
        for (a = 0; a < 10; a++) {
            if (a % 2 == 1) {
                PhoneCall.IncomingPhoneCall incomingPhoneCall = new PhoneCall.IncomingPhoneCall("1." + a);
                phoneCalls[a] = incomingPhoneCall;
            } else {
                PhoneCall.OutgoingPhoneCall outgoingPhoneCall = new PhoneCall.OutgoingPhoneCall("2." + a, 10);
                phoneCalls[a] = outgoingPhoneCall;
            }

            System.out.println(phoneCalls[a].displayCall());
        }
    }
}