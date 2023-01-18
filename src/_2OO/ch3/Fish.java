package _2OO.ch3;

public class Fish extends Animal{
    public Fish(){
        super(0);
    }

    private String fishName;
    public void eat(){
        System.out.println("Fish eat plants.");
    }
    public String getName(){
        return fishName;
    }
    public void setName(String name){
        fishName=name;
    }
    public void play(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void walk(){
        System.out.println("Fish has no legs.");
    }
}
