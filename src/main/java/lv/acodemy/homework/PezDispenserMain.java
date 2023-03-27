package lv.acodemy.homework;

public class PezDispenserMain {
    public static void main(String[] args) {
        PezDispenser spiderMan = new PezDispenser("Spider man", "Red", "MARVEL");

        System.out.println(spiderMan.getPezName() + ", " + spiderMan.getPezColor() + ", " + spiderMan.getPezSeriesName());
        System.out.printf("The PEZ dispenser has %s candies.\n\n", spiderMan.getPezCountCandy());

        spiderMan.eatCandy();
        spiderMan.eatCandy();
        spiderMan.eatCandy();
        spiderMan.eatCandy();
        spiderMan.fillDispenser();
        spiderMan.fillDispenser();
        spiderMan.fillDispenser();
        spiderMan.fillDispenser();
        spiderMan.eatCandies(2);
        spiderMan.fillDispenserFully();
        spiderMan.eatAllCandies();
        spiderMan.fillDispenser();
        spiderMan.fillDispenserCount(2);
        spiderMan.eatAllCandies();
        spiderMan.eatCandies(1);

        if(spiderMan.getPezCountCandy() > 0) {
            System.out.printf("\nThe PEZ dispenser has %s candies!\n", spiderMan.getPezCountCandy());
        } else {
            System.out.println("\nThe PEZ dispenser does not have candies!");
        }

    }

}
