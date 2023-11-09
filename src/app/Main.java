package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String[] vegetables = {
            "tomatoes", "cucumbers", "potatoes", "cucumbers", "tomatoes", "potatoes", "potatoes", "tomatoes", "tomatoes"};
    static int counter;

    public static void main(String[] args) {

        System.out.println(Arrays.toString(vegetables) + "\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter what product you want to find (text form):
                1. tomatoes;
                2. cucumbers;
                3. potatoes.""");

        String product = scanner.next();
        scanner.close();

        switch (product) {
            case "tomatoes" -> {
                for (String productName : vegetables) {
                    if (productName.equals("tomatoes")) {
                        ++counter;
                    }
                }
                System.out.println("During the time was bought " + counter + " boxes of tomatoes.");
            }
            case "cucumbers" -> {
                for (String productName : vegetables) {
                    if (productName.equals("cucumbers")) {
                        ++counter;
                    }
                }
                System.out.println("During the time was bought " + counter + " boxes of cucumbers.");
            }
            case "potatoes" -> {
                for (String productName : vegetables) {
                    if (productName.equals("potatoes")) {
                        ++counter;
                    }
                }
                System.out.println("During the time was bought " + counter + " boxes of potatoes.");
            }
        }
    }
}