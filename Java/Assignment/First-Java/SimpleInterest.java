import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Principle amount: ");
        int principle = input.nextInt();
        System.out.print("Enter Rate of Interest: ");
        float interest = input.nextFloat();
        System.out.print("Enter the time period in years: ");
        int years = input.nextInt();
        float simpleInterest = (principle * interest * years)/100;
        System.out.println("Your simple interest is: " + simpleInterest);
    }
}
