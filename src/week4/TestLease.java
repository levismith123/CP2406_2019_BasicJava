package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestLease {
    @Test
    public void test() {

        Lease lease = new Lease();
        assertEquals(lease.getName(), "Morty");
        assertEquals(lease.getApartment_Num(), 5);
        assertEquals(lease.getMonthly_rent(), 300);
        assertEquals(lease.getMonths_term(), 6);

        lease.setName("Bob");
        assertEquals(lease.getName(), "Bob");

        lease.setMonthly_rent(100);
        assertEquals(lease.getMonthly_rent(), 100);

        lease.setApartment_Num(3);
        assertEquals(lease.getApartment_Num(), 3);

        lease.setMonths_term(3);
        assertEquals(lease.getMonths_term(), 3);

        lease.addPetFee();
        assertEquals(lease.getMonthly_rent(), 110);
    }
}