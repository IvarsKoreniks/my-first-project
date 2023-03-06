package lv.acodemy.classroom;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        // masivs
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(numbers[4]);

        // dabut masiva noteiktu elementu
        int apples = numbers[6];
        System.out.println("I have " + apples + " apples");

        //simbolu skaits masiva
        System.out.println("Number array contains of: " + numbers.length + " numbers");

        //mainit masiva noteikta elementa vertibu
        numbers[0]=90;
        numbers[9]=50;
        System.out.println(Arrays.toString(numbers));

        //tuksa masiva izveidosana un aizpildisana
        int[] euribor = new int[10];
        euribor[0]=3;
        euribor[1]=5;
        System.out.println(Arrays.toString(euribor));

        //vardu masivs
        String[] names = {"John", "Andres", "Mike", "Anna", "Marija"};
        System.out.println(names.length);
        System.out.println("My name is " + names[2]);
        names[3] = "Artur";
        System.out.println(Arrays.toString(names));
    }
}
