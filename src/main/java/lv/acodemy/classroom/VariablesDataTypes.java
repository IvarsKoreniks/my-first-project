package lv.acodemy.classroom;

import java.util.Arrays;
import java.util.List;

public class VariablesDataTypes {
    public static void main(String[]args){

        // byte data type
        byte myCurrentAge = 27;
        System.out.println(myCurrentAge);

        // short data type
        short salaryPerMonth = 1000;
        System.out.println(salaryPerMonth);

        //char data type
        char firsLetterName = 110; //'N'
        System.out.println(firsLetterName);

        // int data type
        int dateOfBirth = 101895;
        System.out.println(dateOfBirth);

        // long data type
        long populationOfLatvia = 1880000;
        System.out.println(populationOfLatvia);

        // float data type
        float lapTime = 32.2F;
        System.out.println("Lap time: "+lapTime);

        // double data type
        double weight = 60.77;
        System.out.println(weight);

        // boolean data type
        boolean isWinter = false;
        boolean isSpring = true;
        System.out.println(isWinter);
        System.out.println(isSpring);

        //String data type
        String firstName = "Ivars";
        String lastName = "Koreniks";
        System.out.println(firstName + " " + lastName);

        //Concatenation
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //Concatenation
        String fullNameWithAge = fullName + " " + myCurrentAge;
        System.out.println(fullNameWithAge);

        //printf
        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);
        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);

        //*
        int a = 10;
        int b = 20;
        int c = a*b;
        System.out.println(c);
        System.out.println(a*b);

        // division
        double k = (double) a/b;
        System.out.println(k);

        // %
        int number = 10 % 9;
        System.out.println(number);

        //
        int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 ==0) {
                System.out.println("This ir even number" + numbers [i]);
            }
        }

    }
}
