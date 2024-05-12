import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Simple calculator.");
        System.out.println("Enter first operand, next operation (+,-,*,/) and next second operand");
        System.out.println("Check result");

        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        int operand2 = scanner.nextInt();
        int result;

        switch(operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 = operand2;
                break;
            default:
                System.out.println("Incorrect operation: " + String.valueOf(operation));
                scanner.close();
                return;
        }

        scanner.close();
        System.out.println(operand1 + " " + operation + " " + operand2 + " = " + result);
    }
}