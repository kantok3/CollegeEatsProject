public class Payment {
    private String cardHolderName;
    private int cardNumber;
    private int cvv;
    private double amount;

    public Payment(int cardNumber, int cvv, double amount){
        setCardNumber(cardNumber);
        setCvv(cvv);
        setAmount(amount);
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        if(cardNumber.length() != 8){
            throw new IllegalArgumentException("Card number must be 8 digits long");
        }
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        if(cvv.length() != 3){
            throw new IllegalArgumentException("CVV must be 3 digits long");
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
