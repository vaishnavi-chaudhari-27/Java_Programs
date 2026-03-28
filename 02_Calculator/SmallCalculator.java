import java.util.Scanner;

public class SmallCalculator {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Choose Operation: ");
        System.out.println("1.Add 2.Sub 3.Mul 4.Div 5.Mod");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Division by zero not allowed");
                break;
            case 5:
                System.out.println("Result = " + (a % b));
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
