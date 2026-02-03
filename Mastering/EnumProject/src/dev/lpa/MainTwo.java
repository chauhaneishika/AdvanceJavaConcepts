package dev.lpa;

public class MainTwo {
    static void main() {

        for(Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : "
            + topping.getPrice());
        }
    }
}
