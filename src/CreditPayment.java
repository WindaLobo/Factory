public class CreditPayment extends Shop {

    /**
     * CreditPayment extends de shop
     * @return CreditCard()
     */
    @Override
    public Payment makePayment() {
        return new CreditCard();
    }
}