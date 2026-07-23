package oops.demo;

public class Runner {
    // A customer adds product to a shopping cart. Each product has a name and price.
    // The cart can hold several products and for each one it tracks how many the customer wants.
    // The cart can tell you its total price.


    // nouns ->   class -> product [name,price] ,  customer , cart  , cartItem [product + quantity]
    // verbs ->   functions -> total(), addProduct()


    public static void main(String[] args) {
        Product coolers = new Product("Coolers", 400);
        Product shirts = new Product("Shirts", 1000);

        Cart cart = new Cart();
        cart.addProduct(coolers, 2);
        cart.addProduct(shirts, 1);

        System.out.println(cart.total());
    }
}
