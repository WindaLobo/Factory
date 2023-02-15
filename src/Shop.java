
public abstract class Shop {
/**
 * metodo abstracto para realizar pagos
 * @return  la interface de tipo payment
 */


public  abstract Payment makePayment();

    /**
     * Para comprar algo, llamo al metodo makePayment
     * Con el obejcto Payment utiliza su metodo paymentMethod()
     */

    public void buySomething() {

        Payment payment = makePayment();
        makePayment().paymentMethod();
    }



}