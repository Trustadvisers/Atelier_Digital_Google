package _2OO.ch3;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs=legs;
    }
    public abstract void eat();
    public void walk(){
        System.out.println("This Animal walks by " + legs + " legs");

    }
}
