package _1Basics.ch2;

public class FooBarQix {

    public static void main(String[] args) {
        System.out.println(new FooBarQix().asTextUpTo(100));
    }

    public String asTextUpTo(int topNumber) {
        String str = "";
        for (int i = 1; i <= topNumber; i++) { 	str += toText(i) + "\n"; }
        return str; }

    public static final String[] TEXT = new String[] { "", "", "", "Foo", "", "Bar", "", "Qix", "", "" };

    public String toText(int number) { 	StringBuffer result = new StringBuffer();
        addTextForDivisible(number, 3, result);
        addTextForDivisible(number, 5, result);
        addTextForDivisible(number, 7, result);
        addTextForDigits(number, result);
        return result.length() > 0 ? result.toString() : Integer
            .toString(number);
    }

    private void addTextForDivisible(int number, int digit, StringBuffer str) {
        if (number % digit == 0) {
            str.append(TEXT[digit]);
        }
    }

    private void addTextForDigits(int numberToConvert, StringBuffer str) {
        String asString = Integer.toString(numberToConvert);
        for (int i = 0; i < asString.length(); i++) {
            int digit = Integer.parseInt(asString.substring(i, i + 1));
            str.append(TEXT[digit]);
        }
    }
}