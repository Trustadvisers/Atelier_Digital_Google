package _8Functional.ch1;


import java.util.stream.IntStream;

public class CheckRangeExample {
    public static void main(String[] args) {
        boolean hasValue10 = IntStream.range(1, 10).anyMatch(x -> x == 10);
        System.out.println(hasValue10);
    }
}
