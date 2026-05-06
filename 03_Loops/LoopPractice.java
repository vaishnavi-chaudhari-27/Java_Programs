import java.util.Scanner;

public class LoopPractice {
    // Que 1 priint 1 to 10 //

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // for (int i = 1; i <= 10; i++) {
    // System.out.println(i + " ");
    // }
    // }

    // Que 2 print 10 to 1(reverse) //

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // for(int i=10; i>1; i--) {
    // System.out.println(i + " ");
    // }
    // }

    // Que 3 print the even number //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // for (int i = 0; i <= 20; i++) {
    // if (i % 2 == 0) {
    // System.out.println(i);
    // }
    // }
    // System.out.println();
    // }

    // // Que 4 sum ood 1 too n //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the sum of value : ");
    // int n = sc.nextInt();
    // int sum = 0;
    // for (int i = 1; i <= n; i++) {
    // sum = sum + i;
    // }
    // System.out.println(sum);
    // }

    // Que 5 table (multiplication)
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number : ");
    // int n = sc.nextInt();
    // for (int i = 0; i <= 10; i++) {
    // System.out.println(n * i);
    // }
    // }

    // Que 6 factorial //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter thr number factor : ");
    // int n = sc.nextInt();
    // long fact = 1;
    // for (int i = 1; i <= n; i++) {
    // fact = fact * i;
    // }
    // System.out.println(fact);
    // }

    // Que 7 count digit //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter Number : ");
    // int num = sc.nextInt();
    // int count = 0;

    // if (num == 0) {
    // count = 1;
    // } else {
    // while (num > 0) {
    // num = num / 10;
    // count++;
    // }
    // }
    // System.out.println("Total digits : " + count);
    // }

    // Que 8 Reverse Number //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the Reverse number");
    // int num = sc.nextInt();
    // int reverse = 0;

    // while (num > 0) {
    // int digit = num % 10;
    // reverse = reverse * 10 + digit;
    // num = num / 10;
    // }
    // System.out.println("Reverse : " + reverse);
    // }

    // Que 9 palindrom //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number : ");
    // int n = sc.nextInt();

    // int temp = n;

    // int reverse = 0;

    // while (n > 0) {
    // int digit = n % 10;
    // reverse = reverse * 10 + digit;
    // n = n / 10;
    // }
    // if (temp == reverse) {
    // System.out.println("Palindrom number");
    // } else {
    // System.out.println("Not Palindrom");
    // }
    // }

    // Que 10 prime or not //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number : ");
    // int num = sc.nextInt();
    // int count = 0;
    // for (int i = 1; i <= num; i++) {
    // if (num % i == 0) {
    // count++;
    // }
    // }
    // if (count == 2) {
    // System.out.println("Prime number");
    // } else {
    // System.out.println("Not prime");
    // }
    // }

    // Que 11 Armstrong number cube(power 3)//
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number : ");
    // int num = sc.nextInt();
    // int temp = num;
    // int sum = 0;

    // while(num > 0) {
    // int digit = num % 10;
    // sum = sum + (digit * digit * digit);
    // num = num / 10;
    // }
    // if(sum == temp) {
    // System.out.println("Armstrong");
    // }
    // else{
    // System.out.println("Not Armstrong");
    // }
    // }

    // Que 12 fibonnaci series //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter how many numbers : ");
    // int n = sc.nextInt();

    // int first = 0, second = 1;
    // System.out.print(first + " " + second + " ");

    // for (int i = 3; i <= n; i++) {
    // int next = first + second;
    // System.out.print(next + " ");
    // first = second;
    // second = next;
    // }
    // }

    // Que GCS (Greatest common Divsor) //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        int gcd = 1;
        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD = " + gcd);
    }
}
