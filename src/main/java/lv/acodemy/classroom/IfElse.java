package lv.acodemy.classroom;

public class IfElse {
    public static void main(String[] args) {

        // IF
        // if(condition) -> if TRUE than {code to be executed}
        boolean x = 5 > 2;
        System.out.println(x);
        if(x) {
            System.out.println("Yes, 5 is more that 2");
        }

        int evenNumber = 20;
        if(evenNumber % 2 == 0) {
            System.out.println("Number: " + evenNumber + " is even");
        }

        // IF ELSE
        // if(condition) -> if TRUE than {code to be executed} -> if FALSE than
        int number = 21;
        if(number % 2 == 0) {
            System.out.println("Number: " + number + " is even");
        } else {
            System.out.println("Number: " + number + " is NOT even number");
        }

        int age = 18;
        if (age <= 17) {
            System.out.println("You are not allower to buy here!");
        } else {
            System.out.println("Welcome to our shop!");
        }

        boolean isSummer = true;
        if (isSummer) {
            System.out.println("Summer months: June, July, August");
        }

        // IF ELSE IF
        //if(condition) {code to be executed} else if (condition) {code to be executed} else {code to be executed}
        int age1 = 0;
        if (age1 <= 0) {
            System.out.println("Why are you?");
        } else if (age1 <= 17) {
            System.out.println("You are not allower to buy here!");
        } else {
            System.out.println("Welcome to our shop!");
        }

        // IF John = Hello John!
        // IF Zina = You are not welcome!
        // ALL others = Text
        String name = "Max";
        if (name.equals("John")) {
            System.out.println("Hello John!");
        } else if (name.equals("Zina")) {
            System.out.println("You are not welcome!");
        } else {
            System.out.println("Very interesting name!");
        }

        // switch case;
        int currentMonth = 13;
        switch (currentMonth) {
            case 12:
            case 1:
            case 2:
                System.out.println("This is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This is spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This is autumn");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + currentMonth);
        }

        // IF student1 = "John" and student2 = "Max"
        // Print: they will work together
        // && - and
        // || - or

        String student1 = "John";
        String student2 = "Max";
        if (student1.equals("John") && student2 .equals("Max")) {
            System.out.println("They will wprk together.");
        }

        // var - variable data type
        var myName = "Ivar";
        var myAge = 10;
        boolean isInt;
        System.out.println(myName instanceof String);

    }
}
