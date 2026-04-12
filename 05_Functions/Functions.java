import java.util.Scanner;

public class Functions {
    // Que1 print a given name in a function. //
    // public static void printMyName(String name) {
    // System.out.println(name);
    // return;
    // }

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // String name = sc.next();

    // printMyName(name);
    // sc.close();
    // }
    // }



    // Que2 make a function to add 2 numbers and return the sum. //

    // public static int calculateSum(int a, int b) {
    // int sum = a + b;
    // return sum;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // int sum = calculateSum(a, b);
    // System.out.println("sum of 2 number is : " + sum);

    // sc.close();
    // }
    // }



    // Que3 make a function to multiply 2 numbers and return the product. //

    // public static int calculateProduct(int a, int b) {
    // return a * b;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // System.out.println("product of 2 numbers is : " + calculateProduct(a, b));

    // sc.close();
    // }
    // }



    // Que4 find the factorial of a number. //
    // public static void printFactorial(int n) {
    // int factorial = 1;
    // for (int i = n; i >= 1; i--) {
    // factorial = factorial * i;
    // }
    // System.out.println(factorial);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();

    // printFactorial(n);

    // sc.close();
    // }
    // }



    // Que5 Enter the 3 number from the user andd make a function to print their
    // average //

    // public static float calculateAverage(int a, int b, int c) {
    // float avg = (a + b + c) / 3.0f;
    // return avg;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();

    // float result = calculateAverage(a, b, c);
    // System.out.println("Average = " + result);
    // }
    // }



    // Que6 Sum of Odd Number(1ton)

    // public static int sumOdd(int n) {
    // int sum = 0;
    // for (int i = 1; i <= n; i++) {
    // if (i % 2 != 0) {
    // sum = sum + i;
    // }
    // }
    // return sum;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int result = sumOdd(n);

    // System.out.println(result);
    // }
    // }



    // Que7 greater of 2 numbers
    // public static int findGreater(int a, int b) {
    // if (a > b) {
    // return a;
    // } else {
    // return b;
    // }
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // int result = findGreater(a, b);

    // System.out.println(result);

    // sc.close();
    // }
    // }




    // Que8 circumferemce of circle
    // public static float circumferemce(int r) {
    // float calculation = 2 * 3.14f * r;
    // return calculation;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int r = sc.nextInt();
    // float result = circumferemce(r);

    // System.out.println(result);
    // sc.close();
    // }
    // }



    // Que9 Voting Eligibility
    public static boolean checkVote(int age) {

        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean result = checkVote(age);

        if (result == true) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
        sc.close();
    }

}


    // Que10 write the infinite loop using do while condition.
    
    // public static void main(String[] args) {
    //     do{
    //         System.out.println("Hello");
    //     } while(true);
    //     }
    // }