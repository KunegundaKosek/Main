package Sda.Zaawansowane.Task02KlasaAbstrakcyjnaInterfejs.Zadania.product;

public class ShoppingCart {

    private Product[] products;

    public ShoppingCart(Product ... products) {
        this.products = products;
    }

    public double getTotalPrice() {
        double result = 0;
        for (Product product : products) {
            result += product.getPrice();
        }
        return result;
    }
}
