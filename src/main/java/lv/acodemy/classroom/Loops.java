package lv.acodemy.classroom;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //FOR -> for(int i = 0; i < 10; i++)
        // {{define counter -> condition -> increment}

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world!");
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = 1; i < numbers.length; i++) {
            System.out.print(numbers[i-1]+ " ");
        }

        //izvadit no masiva tikai para skaitlus
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        // vienkarsots for (for each)
        for(int number : numbers) {
            System.out.println(number);
        }

        //creat String array with 10 names
        // print all names using for and for each

        System.out.println("---------------------");

        String[] names = {"Niks", "Mike", "Liza", "Oskar", "Oleg", "Marta", "Andrej", "Mikus", "Laura", "Alex"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("---------------------");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("---------------------");

        // print all names with comment
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Niks") || names[i].equals("Alex")) {
                System.out.println(names[i] + " No!");
            } else {
                System.out.println(names[i] + " Yes!");
            }
        }

        System.out.println("---------------------");

        // do, do while
        // do {code to be executed} (while)

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i<=10);

        System.out.println("---------------------");

        int x = 0;
        while (x <=10) {
            System.out.println(x);
            x++;
        }

        System.out.println("---------------------");

        // move numbers from arrayOfNum to emptyArray using loop
        int [] arrayOfNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] emptyArray = new int[arrayOfNum.length];
        int j = 0;
        do {
            emptyArray[j] = arrayOfNum[j];
            j++;
        } while (j< arrayOfNum.length);
        System.out.println(Arrays.toString(emptyArray));

        System.out.println("---------------------");



        }

    }
