import java.util.Scanner; // this is not infinte calculator
public class Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        System.out.print("Enter your operation: ");
        char operator = input.next().charAt(0);
        int answer;
        if (operator == '+'){
            answer = num1 + num2;
            System.out.println(answer);
        }

        else if (operator == '-'){
            answer = num1 - num2;
            System.out.println(answer);
        }

        else if (operator == '*'){
            answer = num1 * num2;
            System.out.println(answer);
        }

        else if (operator == '/'){
            answer = num1/num2;
            System.out.println(answer);
        }

        else{
            System.out.println("Invalid Operation");
        }
    }
}
