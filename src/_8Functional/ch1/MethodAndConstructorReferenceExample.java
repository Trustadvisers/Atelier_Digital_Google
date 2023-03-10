package _8Functional.ch1;


import java.util.function.Function;
import java.util.function.Supplier;

public class MethodAndConstructorReferenceExample {
    public static void main(String[] args) {
        // Reference to a static method
        Function<Double,Double> sqrt = Math::sqrt;

        // Reference to a constructor of String class
        Supplier<String> generator = String::new;
    }
}