package oops.demo;

public class Cart {
    private CartItem[] items = new CartItem[10];
    private int count = 0;

    public double total() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + items[i].subTotal();
        }
        return sum;
    }

    public void addProduct(Product product, int quantity) {

        // update existing item
        for (int i = 0; i < count; i++) {
            if (items[i].getProduct().getName().equals(product.getName())){
                items[i].addMore(quantity);
                return;
            }
        }

        // add new item
        items[count] = new CartItem(product, quantity);
        count++;
    }

}
