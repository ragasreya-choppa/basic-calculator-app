import java.sql.SQLException;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First number:- ");
        int a = sc.nextInt();
        System.out.println("Enter your second number:- ");
        int b = sc.nextInt();
        System.out.println("Enter your Option:- Add/Sub/Mul/Div ");
        String user_input = sc.next().toLowerCase();
        Main m = new Main();
        switch (user_input) {
            case "add":
                System.out.println("You Chose Addition!");
                int addition_result = m.addition(a, b);
                System.out.println("The  Addition Result is: " + addition_result);
                break;
            case "sub":
                System.out.println("You Chose Subtraction!");
                int subtraction_result = m.subtraction(a, b);
                System.out.println("The Subtraction Result is: " + subtraction_result);
                break;
            case "mul":
                System.out.println("You Chose Multiplication!");
                int multiplication_result = m.multiplication(a, b);
                System.out.println("The Multiplication Result is: " + multiplication_result);
                break;
            case "div":
                System.out.println("You Chose Division!");
                try {
                    int division_result = m.division(a, b);
                    System.out.println("The Division Result is: " + division_result);
                } catch (ArithmeticException ae) {
                    System.out.println("Division by zero is not possible");
                }

                break;

            default:
                System.out.println("Other Operations are not available!");
                break;
        }
    }

    int addition(int a, int b) {
        return a + b;
    }

    int subtraction(int a, int b) {
        return a - b;
    }

    int multiplication(int a, int b) {
        return a * b;
    }

    int division(int a, int b) throws ArithmeticException {
        return a / b;
    }


}



