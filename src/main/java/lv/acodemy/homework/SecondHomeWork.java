package lv.acodemy.homework;

import java.util.Arrays;

public class SecondHomeWork {
    public static void main(String[] args) {

        // 1 TASK: create String array with 10 European countries; print all values; 2) if "Latvia" exist in the array print: "Latvia is my motherland"
        System.out.println("\n1 TASK");
        String[] countries = {"Canada", "ASV", "Denmark", "Finland", "Italia", "Poland", "Russia", "Austria", "Costa Rica", "Latvia"};
        System.out.println(Arrays.toString(countries));
        for (int i=0; i < countries.length; i++) {
            if (countries[i].equals("Latvia")) {
                System.out.println("Latvia is me motherland!");
            }
        }

        // 2 TASK: Put each sentence word into a String array and print all values as sentence.
        //sentence: "Sometimes it pays to stay in bed on Monday, rather than spending the rest of the week debugging Monday’s code.";
        System.out.println("\n2 TASK");
        String[] sentence = {"Sometimes", "it", "pays", "to", "stay", "in", "bed", "on", "Monday,", "rather", "than", "spending", "the", "rest", "of", "the", "week", "debugging", "Monday’s", "code"};
        for (int i=0; i < sentence.length; i++) {
            if (i==sentence.length-1) {
                System.out.printf(sentence[i] + ".\n");
            } else {
                System.out.printf(sentence[i] + " ");
            }
        }

        // 3 TASK: The program check the user's salary and: 1) if salary >= 5000, print "Your salary is low."; 2) if salary > 5000 and <=10000, print "Your salary is average."; 3) if salary > 10000, print "Your salary is high.".
        System.out.println("\n3 TASK");
        double userSalary = 10001;
        System.out.println("The user's salary is: " + userSalary + ".");
        if (userSalary <= 5000) {
            System.out.println("Your salary is low.");
        } else {
            if (userSalary > 5000 && userSalary <= 10000) {
                System.out.println("Your salary is average.");
            } else {
                System.out.println("Your salary is high.");
            }
        }

        // 4 TASK: The program checks if the number is positive, negative or zero.
        System.out.println("\n4 TASK");
        int number = 0;
        System.out.println("Your number is: " + number +".");
        if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            if (number > 0) {
                System.out.println("The number is positive.");
            } else {
                System.out.println("If the number is negative");
            }
        }

    }
}
