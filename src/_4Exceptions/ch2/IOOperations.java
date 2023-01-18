package _4Exceptions.ch2;

import java.io.*;
import java.util.Scanner;

public class IOOperations {
    public String readFromFile(String filePath) {
        String text = "";
        FileReader fr = null;
        try {
            fr = new FileReader(filePath);
            int c;
            while ((c = fr.read()) != -1) {
                char chr = (char) c;
                if (chr >= 'A' && chr <= 'Z' && chr != 'X')
                    text += chr;
                else if (chr == 'X')
                    text += " ";
            }
        } catch (FileNotFoundException exception) {
            System.out.println("FILE NOT FOUND");
        } catch (IOException exception) {
            System.out.println("IO EXCEPTION");
        } finally {
            closeFile(fr);
        }
        return text;
    }

    private void closeFile(FileReader fr) {
        try {
            if (fr != null) fr.close();
        } catch (IOException e) {
            System.out.println("Unable to access close stream");
        }
    }

    public void readFromKeyboard() {
        String text;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a double: ");
        Double a = scanner.nextDouble();
        System.out.println("The inserted number is " + a);

    }

    public void writeToFile(String message, String filePath) {
        try (
                FileWriter fw = new FileWriter(filePath);
                BufferedWriter bw = new BufferedWriter(fw)
        ) {
            bw.write(message);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}