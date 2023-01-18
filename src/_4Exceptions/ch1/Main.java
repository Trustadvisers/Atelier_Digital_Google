package _4Exceptions.ch1;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("./src/Exceptions4/_7Concurrency._7Concurrency._8Functional._9Reactive._10ProjectsPatternDesign.ch1/Phonebook.txt");
        //phoneBook.toString();
        //System.out.println(phoneBook);
        System.out.println("Abbey " + phoneBook.getByName("Abbey"));
        System.out.println("Abdul " + phoneBook.getByName("Abdul"));
    }
}
