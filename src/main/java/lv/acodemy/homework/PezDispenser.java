package lv.acodemy.homework;

import lombok.Getter;

@Getter
public class PezDispenser {

    private String pezName;
    private String pezColor;
    private String pezSeriesName;
    private int pezMaxCandy = 12;
    private int pezCountCandy;

    public PezDispenser(String pezName, String pezColor, String pezSeriesName) {
        this.pezName = pezName;
        this.pezColor = pezColor;
        this.pezSeriesName = pezSeriesName;
        this.pezCountCandy = pezMaxCandy;
    }

    public void eatCandy () {
        if (pezCountCandy == 0) {
            System.out.println("The PEZ dispenser does not have candy anymore!");
        } else {
            pezCountCandy--;
            System.out.println("The PEZ dispenser give you one candy!");
        }
    }

    public void eatCandies (int eatCountCandy) {
        if (eatCountCandy <= 0) {
            System.out.println("The number of candies must be greater than 0!");
        } else {
            if (pezCountCandy > 0 & pezCountCandy - eatCountCandy >= 0) {
                pezCountCandy = pezCountCandy -eatCountCandy;
                System.out.printf("The PEZ dispenser give you %s candies!\n", eatCountCandy);
            } else {
                System.out.printf("The PEZ dispenser can not give you %s candies, because the dispenser have only %s candies!\n ", eatCountCandy, pezCountCandy);
            }
        }
    }

    public void eatAllCandies () {
        if (pezCountCandy > 0) {
            System.out.printf("The PEZ dispenser give you %s candies and now does not have any candies!\n", pezCountCandy);
            pezCountCandy = 0;
        } else {
            System.out.println("The PEZ dispenser does not have candies!");
        }
    }

    public void fillDispenser () {
        if (pezCountCandy < pezMaxCandy) {
            pezCountCandy++;
            System.out.println("The PEZ dispenser have been added one candy!");
        } else {
            System.out.println("The PEZ dispenser is full!");
        }
    }

    public void fillDispenserCount (int fillCountCandy) {
        if (fillCountCandy <= 0) {
            System.out.println("The number of candies must be greater than 0!");
        } else {
            if (pezCountCandy < pezMaxCandy & pezCountCandy + fillCountCandy <= pezMaxCandy) {
                pezCountCandy = pezCountCandy + fillCountCandy;
                System.out.printf("The PEZ dispenser have been added %s candies and now has %s candies!\n", fillCountCandy, pezCountCandy);
            } else {
                System.out.printf("You can not add to the PEZ dispenser %s candies, because the dispenser limit is %s candies, but now the dispenser has %s candies!\n ", fillCountCandy, pezMaxCandy, pezCountCandy);
            }
        }
    }

    public void fillDispenserFully () {
        if (pezCountCandy == pezMaxCandy) {
            System.out.println("The PEZ dispenser is full!");
        } else {
            int difference = pezMaxCandy - pezCountCandy;
            pezCountCandy = pezMaxCandy;
            System.out.printf("The PEZ dispenser have been added %s candies and now has %s candies!\n", difference, pezCountCandy);
        }
    }

}
