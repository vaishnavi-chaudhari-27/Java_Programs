import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // *For Loop* //

        // que 1 print the sum of first n natural number.//

        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();

        // que 2 print the table of a number input by the user.//

        // int m = sc.nextInt();
        // for (int i = 1; i < 11; i++) {
        // System.out.println(m * i);
        // }
        // sc.close();

        // que 3 print the number from 0 to 10.//

        // for (int i = 1; i < 11; i++) {
        // System.out.print(i + " ");
        // }

        // que 4 //

        // for (int count = 0; count < 10; count = count + 1) {
        // System.out.println("Hello");
        // }

        // que 5 //

        // for (int i = 1; i <= 20; i++) {
        // System.out.println(i);
        // }
        // sc.close();

        // que 6 print the 1 to 10 even number.//

        // for (int i = 1; i <= 20; i++) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }
        // }
        // sc.close();

        // que 7 print 1 to 10 odd number.//

        // for (int i = 1; i <= 10; i++) {
        // if (i % 2 != 0) {
        // System.out.println(i);
        // }
        // }
        // sc.close();

        // que 8 print the reverse number 10 to 1.//

        // for (int i = 10; i >= 1; i--) {
        // System.out.println(i);
        // }
        // sc.close();

        // que 9 sum of 1 to 10.//

        // int sum= 0;
        // for (int i = 1; i <= 10; i++) {
        // sum = sum + i;
        // }
        // System.out.println(sum);
        // sc.close();

        // que 10 print the number 1 to n sum.//

        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum = sum + i;
        // }
        // System.out.println(sum);
        // sc.close();

        // que 11 factorial n.//

        // int n = sc.nextInt();
        // long fact = 1;
        // for(int i=1; i<=n; i++){
        // fact = fact * i;
        // }
        // System.out.println(fact);
        // sc.close();

        // que 12 palindrome number.//

        // int num = sc.nextInt();
        // int reverse = 0;
        // int original = num;
        // for (; num > 0; num = num / 10) {
        // int last = num % 10;
        // reverse = reverse * 10 + last;
        // }
        // if (reverse == original) {
        // System.out.println("Palindrome");
        // } else {
        // System.out.println("Not Palindrome");
        // }
        // sc.close();

        // *while loop* //

        // que1 1to10 print//

        // int i = 1;
        // while (i < 11) {
        // System.out.println(i);
        // i = i + 1;
        // }

        // que2 even number//

        // int i = 0;
        // while (i <= 20) {
        // System.out.println(i);
        // i++;
        // }

        // que3 odd number//

        // int i = 1;
        // while(i<=10){
        // System.out.println(i);
        // i++;
        // }

        // que4 //

        // int i = 2;
        // while (i<=10) {
        // System.out.println(i);
        // i = i + 2;
        // }

        // que5 //

        // int i = 1;
        // while(i<=10){
        // System.out.println(i);
        // i = i + 2;
        // }

        // que6 reverse 10 to 1//

        // int i = 10;
        // while(i >= 1){
        // System.out.println(i);
        // i--;
        // }

        // que7 sum 1 to 10//

        // int n = sc.nextInt();
        // int i = 1;
        // while(i <= n){
        // System.out.println(i);
        // i++;
        // }

        // que8 sum 1 to n//

        // int i = 1;
        // int sum = 0;
        // while(i<=10){
        // sum = sum + i;
        // i++;
        // }
        // System.out.println(sum);

        // que9 factorial //

        // int n = sc.nextInt();
        // int i = 1;
        // long fact = 1;
        // while(i<=n){
        // fact = fact * i;
        // i++;
        // }
        // System.out.println(fact);

        // *do while loop* //

        // que1 //

        // int i = 1;
        // do {
        // System.out.println(i);
        // i = i + 1;
        // } while (i < 11);

        // que2 1 to 5 print//

        // int i = 1;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i <= 5);

        // que3 repeat till 0//

        // int num;
        // do {
        // num = sc.nextInt();
        // if (num != 0) {
        // System.out.println(num);
        // }
        // } while (num != 0);

        // sc.close();

    }
}
