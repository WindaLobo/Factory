public class Main {
    private static Shop miTienda;

    public static void main(String[] args) throws Exception {


        Integer operacion = LibreriaEntradSalida.recibeInt("Como deseas pagar \n1 Pagar en efectivo \n2 Pagar con tarjeta \n3 Pagar con Bizum");
        switch (operacion) {
            case 1:
                // Cash pagarEfectivo = new Cash();
                miTienda = new CashPayment();
                miTienda.buySomething();

                //pagarEfectivo.paymentMethod();

                break;
            case 2:
                // CreditCard pagarConTarjeta = new CreditCard();

                // instancio la clase que extiende de shop
                miTienda = new CreditPayment();
                // redudante
                // miTienda.makePayment();
                miTienda.buySomething();

                //pagarConTarjeta.paymentMethod();
                break;
            case 3:
                miTienda = new BizumPayment();
                miTienda.buySomething();

                break;
            default:
                System.out.println("Salir");
        }


    }


}
