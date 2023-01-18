package _2OO.ch3;
import java.lang.String;

public class Cat extends Animal implements Pet{
    private String catName;
    public Cat (String Name){
        super( 4);
        String name = null;
        catName = name;
    }
    public Cat(){
        this(" ");
    }
    public void eat(){
        System.out.println("Cat eat fishes");
    }
    public String getName(){
        return catName;
    }
    public void setName(String name){
        catName = name;
    }
    public void play(){
        //throw UnsupportedOperationException("Not support yet");
    }
}
