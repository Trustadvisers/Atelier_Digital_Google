package _3DesignPatterns.decorator;

public class Chocolate extends Topping{
    public Chocolate(Beverage beverage){
        super(beverage, "Chocolate ", 4);
    }
}
