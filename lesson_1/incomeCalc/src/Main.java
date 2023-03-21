import java.util.Scanner;

public class Main {
    private static int minIncome = 200000;
    private static int maxIncome = 900000;
    private static int officeRentCharge = 140000;
    private static int telephoneCharge = 12000;
    private static int internetAccessCharge = 7200;
    private static int assistantSalary = 47000;
    private static int finnanceManagerSalary = 87000;
    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.14;
    private static double minInvestmentAmount = 100000;
    public static void main(String[] args) {
        while(true) {
            System.out.println("Введите сумму доходов компании за месяц (от 200 до 900 тысяч рублей)");
            int income = (new Scanner(System.in)).nextInt();
            if(!checkIncomeRange(income)){
                continue;
            }
            double managerSalary = income * managerPercent;
            double pureIncome = income - managerSalary - calculateFixedCharges();
            double taxAmount = mainTaxPercent * pureIncome;
            double pureIncomeAfterTax = pureIncome - taxAmount;

            boolean canMakeInvestments = pureIncomeAfterTax >= minInvestmentAmount;

            System.out.println("Manager Salary" +managerSalary);
            System.out.println("Total tax Amount" + (taxAmount > 0 ? taxAmount : 0));
            System.out.println("Company can to investment" + (canMakeInvestments ? "yes" : "no"));
            if (pureIncome < 0) {
                System.out.println("Budget is to low");
            }
        }
    }

    private static boolean checkIncomeRange(int income) {
        if (income < minIncome) {
            System.out.println("Income is lower by boarder");
            return false;
        }
        if (income > maxIncome) {
            System.out.println("Income are normal");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges(){
        return officeRentCharge + telephoneCharge + internetAccessCharge + assistantSalary + finnanceManagerSalary;
    }
}