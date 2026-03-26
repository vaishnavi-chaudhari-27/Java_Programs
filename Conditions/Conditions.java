import java.util.Scanner;

public class Conditions {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        // if condition que1

        // int age = sc.nextInt();
        // if (age > 18) {
        // System.out.println("Adult");
        // } else {
        // System.out.println("Not Adult");
        // }
        // sc.close();
        // }

        // que2

        // int x = sc.nextInt();
        // if(x % 2 == 0){
        // System.out.println("Even");
        // } else {
        // System.out.println("Odd");
        // }
        // sc.close();
        // }
        // }

        // que 3

        // int num = sc.nextInt();
        // if(num > 0){
        // System.out.println("Positive");
        // } else {
        // System.out.println("Negative");
        // }
        // sc.close();
        // }
        // }

        // que 4

        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();

        // if (num1 > num2) {
        // System.out.println("num1 is greater");
        // } else {
        // System.out.println("num2 is greater");
        // }
        // sc.close();
        // }
        // }

        // que 5
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if (a == b) {
        // System.out.println("Equal");
        // } else if (a > b) {
        // System.out.println("a is greater");
        // } else {
        // System.out.println("a is lesser");
        // }
        // sc.close();
        // }
        // }

        // que 6

        // int color = sc.nextInt();

        // if(color==1){
        // System.out.println("pink");
        // }else if(color==2)
        // {
        // System.out.println("red");
        // }else if(color==3)
        // {
        // System.out.println("yellow");
        // }else
        // {
        // System.out.println("black");
        // }
        // sc.close();
        // }
        // }

        // switch condition que 7

        // System.out.print("Enter day number: ");
        // int day = sc.nextInt();switch(day)
        // {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // default:
        // System.out.println("Sunday");
        // }
        // sc.close();
        // }
        // }

        // que 8

        // int age = sc.nextInt();if(age>=18)
        // {
        // System.out.println("You can vote");
        // }else
        // {
        // System.out.println("You can not vote");
        // }sc.close();}}

        // que 10 System.out.print("Enter month number: ");
        // int month = sc.nextInt();

        // switch(month)
        // {
        // case 1:
        // System.out.println("January");
        // break;
        // case 2:
        // System.out.println("February");
        // break;
        // case 3:
        // System.out.println("March");
        // break;
        // case 4:
        // System.out.println("April");
        // break;
        // case 5:
        // System.out.println("May");
        // break;
        // case 6:
        // System.out.println("June");
        // break;
        // case 7:
        // System.out.println("July");
        // break;
        // case 8:
        // System.out.println("August");
        // break;
        // case 9:
        // System.out.println("Saptember");
        // break;
        // case 10:
        // System.out.println("Octomber");
        // break;
        // case 11:
        // System.out.println("November");
        // break;
        // case 12:
        // System.out.println("Decmber");
        // break;
        // default:
        // System.out.println("Invalid month number");
        // }
        // sc.close();
        // }
        // }

        // if-else condition
        // largest number que1

        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int num3 = sc.nextInt();
        // if (num1 > num2 && num1 > num3) {
        // System.out.println("num1 is larges");
        // } else if (num2 > num1 && num2 > num3) {
        // System.out.println("num2 is larges");
        // } else {
        // System.out.println("num3 is larges");
        // }
        // sc.close();

        // 10 greater than que2

        // int num = sc.nextInt();
        // if(num > 10){
        // System.out.println("Greater then 10");
        // } else if(num < 10){
        // System.out.println("Less then 10");
        // } else {
        // System.out.println("Equal to 10");
        // }
        // sc.close();

        // student pass fail que3

        // int marks = sc.nextInt();
        // if (marks >= 50) {
        // System.out.println("1st class pass");
        // } else if (marks >= 45) {
        // System.out.println("pass");
        // } else {
        // System.out.println("Fail");
        // }
        // sc.close();

        // student marks grade que4

        // int Marks = sc.nextInt();
        // if (Marks >= 90) {
        // System.out.println("Grade A");
        // } else if (Marks >= 75) {
        // System.out.println("Grade B");
        // } else if (Marks >= 50) {
        // System.out.println("Grade C");
        // } else {
        // System.out.println("Fail");
        // }
        // sc.close();

        // FizzBuzz que 5

        // int num = sc.nextInt();
        // if (num % 4 == 0 && num % 6 == 0) {
        // System.out.println("FizzBuzz");
        // } else if (num % 4 == 0) {
        // System.out.println("Fizz");
        // } else if (num % 6 == 0) {
        // System.out.println("Buzz");
        // } else {
        // System.out.println("num");
        // }
        // sc.close();

        // Leap year que 6

        // int year = sc.nextInt();
        // if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
        // System.out.println("Leap year");
        // } else {
        // System.out.println("Not a Leap year");
        // }
        // sc.close();

        // Simple calculator que 7

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char op = '*';

        if (op == '+') {
            System.out.println(num1 + num2);
        } else if (op == '-') {
            System.out.println(num1 - num2);
        } else if (op == '*') {
            System.out.println(num1 * num2);
        } else if (op == '%') {
            System.out.println(num1 % num2);
        } else {
            System.out.println("Invalid Operator");
        }
        sc.close();
    }
}