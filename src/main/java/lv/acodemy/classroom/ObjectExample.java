package lv.acodemy.classroom;

public class ObjectExample {
    public static void main(String[] args) {

        Cat niki = new Cat("Niki", "white", "Himalaya", "male", true);
        niki.setAge(4);
        niki.setWeight(5.5);

        System.out.println(niki);

        niki.speak();
        niki.feed();
        niki.walk();
        niki.walk();
        niki.walk();
        niki.walk();
        niki.walk();
        niki.walk();
        System.out.println(niki.getEnergy());

        niki.feed();
        niki.feed();
        niki.feed();
        niki.feed();
        niki.feed();
        niki.feed();
        niki.feed();
        System.out.println(niki.getEnergy());

    }
}
