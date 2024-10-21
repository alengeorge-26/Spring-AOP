package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String name) {
        System.out.println(name+" Checkout from shopping cart");
    }

    public int quantity(){
        return 2;
    }
}