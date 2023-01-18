package _4Exceptions.ch2;

public class Main {
    public static void main(String[] args) {
        IOOperations ioo = new IOOperations();
        String text  = ioo.readFromFile("C:\\Users\\Ninja\\IdeaProjects\\Atelier_Digital_Google\\src\\Exceptions4\\_7Concurrency._7Concurrency._7Concurrency._8Functional._9Reactive._10ProjectsPatternDesign.ch1._7Concurrency._8Functional._9Reactive._10ProjectsPatternDesign.ch2\\read.txt");
        System.out.println(text);
        ioo.writeToFile(text, "C:\\Users\\Ninja\\IdeaProjects\\Atelier_Digital_Google\\src\\Exceptions4\\_7Concurrency._7Concurrency._7Concurrency._8Functional._9Reactive._10ProjectsPatternDesign.ch1._7Concurrency._8Functional._9Reactive._10ProjectsPatternDesign.ch2\\read.txt");
    }
}
