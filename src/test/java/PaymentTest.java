import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    @Test
   public void testCardNumberLength(){
        Payment payment = new Payment(12345678, 123, 10.0);
        assertEquals(12345678, payment.getCardNumber());
    }
    @Test
    public void testInvalidCardNumber(){
        assertThrows(IllegalArgumentException.class, () -> new Payment(1234567,123,10.0));
    }

    @Test
    public void testValidCVV(){
        Payment payment = new Payment(12345678,123,10.0);
        assertEquals(123,payment.getCvv());
    }

    @Test
    public void testAmount(){
        Payment payment = new Payment(12345678, 123, 10.0);
        assertEquals(10.0,payment.getAmount());
    }

    @Test
    public void testSetCVV() {
        Payment payment = new Payment(12345678, 123, 10.0);
        payment.setCvv(456);
        assertEquals(456, payment.getCvv());
    }

    @Test
    public void testSetInvalidCVV() {
        Payment payment = new Payment(12345678, 123, 10.0);
        assertThrows(IllegalArgumentException.class, () -> payment.setCvv(12));
    }

    @Test
    public void testSetAmount() {
        Payment payment = new Payment(12345678, 123, 10.0);
        payment.setAmount(20.0);
        assertEquals(20.0, payment.getAmount());
    }
}

}