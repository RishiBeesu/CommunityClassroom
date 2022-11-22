import java.util.Scanner;
public class InrToUsd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        int rupee = input.nextInt();
        double dollar = rupee*0.012;
        System.out.println("Equivalent Dollars: " + dollar);
    }
}
