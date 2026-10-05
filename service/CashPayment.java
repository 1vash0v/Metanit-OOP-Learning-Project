package service;

public final class CashPayment implements PaymentMethod {
    private final int amount;

    public CashPayment(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override 
    public void processPayment() {
        System.out.println("Производится оплата наличными - " + amount + " долларов");
    }
}
