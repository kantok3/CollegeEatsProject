public class Payment {
    private String cardHolderName;
    private int cardNumber;
    private int cvv;
    private double amount;

    public Payment(String cardHolderName, int cardNumber, int cvv, double amount){
        this.cardHolderName =cardHolderName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.amount = amount;
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
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
