import java.util.Scanner;

public class Payment {

    public static void main(String[] args) {
        // print out welcome message
        System.out.println("Welcome to the payment calculator!");

        // declare variables
        double hourlyPayRate;
        double hoursWorked;

        // declare scanner
        Scanner scanner = new Scanner(System.in);

        // ask user for hourly pay rate
        System.out.println("Enter your hourly pay rate: ");
        hourlyPayRate = scanner.nextDouble();

        // ask user for hours worked
        System.out.println("Enter the number of hours worked per day: ");
        hoursWorked = scanner.nextDouble();

        // equation to calculate the total pay weekly, monthly, and yearly
        double weeklyPay = hourlyPayRate * hoursWorked * 5;
        double monthlyPay = hourlyPayRate * hoursWorked * 20;
        double yearlyPay = hourlyPayRate * hoursWorked * 260;

        // print out the result of weekly, monthly, and yearly pay
        String weeklyMessage = "\nYour weekly pay is estimated to be  $" + weeklyPay + ".";
        String monthlyMessage = "Your monthly pay is estimated to be $" + monthlyPay + ".";
        String yearlyMessage = "Your yearly pay is estimated to be $" + yearlyPay + ".";
        System.out.println(weeklyMessage);
        System.out.println(monthlyMessage);
        System.out.println(yearlyMessage);
    }
}
