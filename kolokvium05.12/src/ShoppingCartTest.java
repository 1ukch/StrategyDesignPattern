public class ShoppingCartTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new PaypalStrategy("ilua.kuzmin.a.66@egmail.com", "mypwd"));
        cart.pay(new CreditCardStrategy("Ilya Kuzmin", "1234567890123456", "786", "12/15"));
    }

}