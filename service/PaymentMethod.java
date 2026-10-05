package service;


public sealed interface PaymentMethod permits CardPayment, CashPayment, OnlineWallet{
    public void processPayment();
}
