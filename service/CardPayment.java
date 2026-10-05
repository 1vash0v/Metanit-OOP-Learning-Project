package service;


public final class CardPayment implements PaymentMethod{
    private final String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getNumber() {
        return cardNumber;
    }

    @Override 
    public void processPayment() {
        System.out.println("Производится оплата картой - " + cardNumber);
    }
}
