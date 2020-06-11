package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Jarvis", "2020");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        // Welcome message
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        // Asks for name of user
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        // Asks for the age in remainders of few numbers and computes the age
        // Prints out age
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        // Takes an Integer as an input and print numbers in range of 0 to n
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        // A programming based question with four options
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What are the advantages of java compared to other programming languages?");
        System.out.println("1. Java is faster than c++.");
        System.out.println("2. java is platform independent.");
        System.out.println("3. Garbage collector.");
        System.out.println("4. Option 2 and 3.");
        int choice;
        do {
            choice = scanner.nextInt();
        } while (choice != 4) ;
    }

    static void end() {
        // Ending message
        System.out.println("Congratulations, have a nice day!");
    }
}
