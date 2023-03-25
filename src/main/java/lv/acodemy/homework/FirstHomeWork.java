package lv.acodemy.homework;

public class FirstHomeWork {
    public static void main(String[] args) {
        int firstPositionSalary = 2000;
        int secondPositionSalary = 1500;
        char firstPositionEmployees = 23;
        char secondPositionEmployees = 32;
        byte firstPositionVacancy = 3;
        byte secondPositionVacancy = 1;
        short firstPositionBonuses = 5;
        short secondPositionBonuses = 7;
        long firstPositionAnnualAward = 550;
        long secondPositionAnnualAward = 770;
        double firstPositionWorkingHours = 7.5;
        double secondPositionWorkingHours = 8.25;
        float firstPositionAverageAge = 34.1F;
        float secondPositionAverageAge = 56.2F;
        boolean firstPositionIsKey = true;
        boolean secondPositionIsKey = false;

        int firstPositionMaxEmployees = firstPositionEmployees + firstPositionVacancy;
        int secondPositionMaxEmployees = secondPositionEmployees + secondPositionVacancy;
        double salaryBudget = firstPositionSalary * firstPositionMaxEmployees + secondPositionSalary * secondPositionMaxEmployees;
        double oneEmployeeSalaryBudget = salaryBudget / (firstPositionMaxEmployees + secondPositionMaxEmployees);
        double averageFactBonuses = (firstPositionBonuses * firstPositionEmployees + secondPositionBonuses * secondPositionEmployees) / (firstPositionEmployees + secondPositionEmployees);
        long differenceOfAnnualAward = Math.abs (secondPositionAnnualAward - firstPositionAnnualAward);
        float plannedWorkingHours = (float) (firstPositionWorkingHours * firstPositionMaxEmployees + secondPositionWorkingHours * secondPositionMaxEmployees);
        float differenceOfAverageAge = Math.abs(firstPositionAverageAge - secondPositionAverageAge);

        System.out.println("Maximum number of employees in the first position: " + firstPositionMaxEmployees);
        System.out.println("Maximum number of employees in the second position: " + secondPositionMaxEmployees);
        System.out.println("Salary budget: " + salaryBudget);
        System.out.println("One employee salary budget: " + oneEmployeeSalaryBudget);
        System.out.println("Average fact bonuses: " + averageFactBonuses);
        System.out.println("Difference of annual award: " + differenceOfAnnualAward);
        System.out.println("Amount of planned working hours: " + plannedWorkingHours);
        System.out.println("Difference of employees average age: "+ differenceOfAverageAge);
        System.out.printf("First position is key: %s.\nSecond position is key: %s.\n", firstPositionIsKey, secondPositionIsKey);
    }
}
