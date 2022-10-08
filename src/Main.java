import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        //TipCalculator calculator = new TipCalculator(calculator.numPeople, calculator.tipPercentage);

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int members = scan.nextInt();
        scan.nextLine();

        System.out.print("What is the tip percentage? (0 - 100) ");
        int tipPercentage = scan.nextInt();
        final double INTPERCENTTODECIMAL = tipPercentage / 100.0;
        TipCalculator calculator = new TipCalculator(members, tipPercentage);
        scan.nextLine();


        System.out.print("Enter a cost in dollars and cents! (-1 to end) ");
        double item = scan.nextDouble();
        double bill = item;
        while (item != -1) {

            System.out.print("Enter a cost in dollars and cents! (-1 to end) ");
            item = scan.nextDouble();
            bill = bill + item;
            if (item == -1) {
                bill = 2 + bill;
                calculator.totalBillBeforeTip = bill + item;
            }
        }
        scan.nextLine();
        System.out.println("------------------------");
        System.out.println("Total bill before tip: " + calculator.totalBillBeforeTip);
        System.out.println("Tip percentage: " + calculator.gettipPercentage());
        double totalTip = calculator.tipAmount();
        String formattedtotalTip = formatter.format(totalTip);
        System.out.println("Total tip: " + formatter.format(totalTip));
        double tipWithBill = (calculator.totalBill());
        String formattedtipwithBill = formatter.format(tipWithBill);
        System.out.println("Total bill with tip: " + formatter.format(tipWithBill));
        double perPersonCost = calculator.perPersonCostBeforeTip();
        String formattedperPersonCost = formatter.format(perPersonCost);
        System.out.println("Per person cost before tip: " + formatter.format(perPersonCost));
        double tipPerPerson = calculator.perPersonTipAmount();
        String formattedtipPerPerson = formatter.format(tipPerPerson);
        System.out.println("Tip per person: " + formatter.format(tipPerPerson));
        double totalPeople = calculator.perPersonTotalCost();
        String formattedtotalPeople = formatter.format(totalPeople);
        System.out.println("Total cost per person: " + formatter.format(totalPeople));


    }
}