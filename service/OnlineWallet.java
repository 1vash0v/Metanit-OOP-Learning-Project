package service;

public final class OnlineWallet implements PaymentMethod {
    private String walletId;

    public OnlineWallet(String walletId) {
        this.walletId = walletId;
    }
    public String getId() {
        return walletId;
    }

    @Override
    public void processPayment() {
        System.out.println("Производится оплата онлайн кошельком - " + walletId);
    }
}
