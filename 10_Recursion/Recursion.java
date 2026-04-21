public class Recursion {
    // Que 1 print numbers from 5 to 1 //
    // public static void printNum(int n) {
    // if (n == 0) {
    // return;
    // }
    // System.out.println(n);
    // printNum(n - 1);
    // }

    // public static void main(String[] args) {
    // int n = 5;
    // printNum(n);
    // }
    // }

    // Que 2 //
    // public static void printNum(int n) {
    // if (n == 6) {
    // return;
    // }
    // System.out.println(n);
    // printNum(n + 1);
    // }

    // public static void main(String[] args) {
    // int n = 1;
    // printNum(n);
    // }
    // }

    // Que 3 print sum of first n natural numbers //
    // public static void printSum(int i, int n, int sum) {
    // if (i == n) {
    // sum += i;
    // System.out.println(sum);
    // return;
    // }
    // sum += i;
    // printSum(i + 1, n, sum);
    // System.out.println(i);
    // }

    // public static void main(String[] args) {
    // printSum(1, 5, 0);
    // }
    // }

    // Que 4 print factorial of a number n //
    // public static int calculateFactorial(int n) {
    // if (n == 1 || n == 0) {
    // return 1;
    // }
    // int fact_nm1 = calculateFactorial(n - 1);
    // int fact_n = n * fact_nm1;
    // return fact_n;
    // }

    // public static void main(String[] args) {
    // int n = 5;
    // int ans = calculateFactorial(n);
    // System.out.println(ans);
    // }
    // }

    // Que 5 print the fibonacci sequence till nth term* //
    // public static void printFb(int a, int b, int n) {
    // if (n == 0) {
    // return;
    // }
    // int c = a + b;
    // System.out.println(c);
    // printFb(b, c, n - 1);
    // }

    // public static void main(String[] args) {
    // int a = 0, b = 1;
    // System.out.println(a);
    // System.out.println(b);
    // int n = 7;
    // printFb(a, b, n - 2);
    // }
    // }

    // Que 6 print x^n (stack height = n) //
    // public static int calcPower(int x, int n) {
    // if (n == 0) {
    // return 1;
    // }
    // if (x == 0) {
    // return 0;
    // }
    // int xPownm1 = calcPower(x, n - 1);
    // int xPown = x * xPownm1;
    // return xPown;
    // }

    // public static void main(String[] args) {
    // int x = 2, n = 5;
    // int ans = calcPower(x, n);
    // System.out.println(ans);
    // }
    // }

    // Que 7 print x^n(stack height = logn)
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
