package others.basic_knowledge;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner s = new Scanner(System.in);
        System.out.println("Name: " + s.nextLine());
    }
}
