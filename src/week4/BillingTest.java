package week4;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillingTest {
    @Test
    public void compute_bill_test(){

        Billing billing = new Billing();
        assertEquals(billing.computeBill(100), 108);
        assertEquals(billing.computeBill(100, 5), 540);
        assertEquals(billing.computeBill(100, 5, 100), 432);
    }
}