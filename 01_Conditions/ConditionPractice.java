import java.util.Scanner;

public class ConditionPractice {
    // Even Or Odd //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // if(n % 2 == 0) {
    // System.out.println("Even Number");
    // } else {
    // System.out.println("Odd Number");
    // }
    // System.out.println();
    // }

    // Positive Negative Zero //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number : ");
    // int num = sc.nextInt();
    // if(num > 0) {
    // System.out.println("Positive value");
    // }else if(num < 0) {
    // System.out.println("Negative value");
    // } else {
    // System.out.println("Zero");
    // }
    // }

    // voting Eligibility //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter your age : ");
    // int age = sc.nextInt();
    // if (age >= 18) {
    // System.out.println("Eligible for voting");
    // } else {
    // System.out.println("Not Eligible for voting");
    // }
    // }

    // Greater Number //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the 1st number : ");
    // int num1 = sc.nextInt();
    // System.out.print("Enter the 2nd number : ");
    // int num2 = sc.nextInt();
    // if (num1 > num2) {
    // System.out.println("The biggest number of " + num1);
    // } else {
    // System.out.println("The biggest number of " + num2);
    // }
    // }

    // Leap Year //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int year = sc.nextInt();
    // if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
    // System.out.println("The Leap yera");
    // } else {
    // System.out.println("Not Leap year");
    // }
    // }

    // largest of 3 number //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the a value of number : ");
    // int a = sc.nextInt();
    // System.out.print("Enter the b value of number : ");
    // int b = sc.nextInt();
    // System.out.print("Enter the c value of number : ");
    // int c = sc.nextInt();

    // if (a > b) {
    // System.out.println("This is biggest number of : " + a);
    // } else if (a < b) {
    // System.out.println("This is biggest number of : " + b);
    // } else {
    // System.out.println("This is biggest number of : " + c);
    // }
    // }

    // Grade System //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the Marks");
    // int marks = sc.nextInt();
    // if(marks >= 90 && marks <= 100) {
    // System.out.println("The Grade of Student A+ ");
    // } else if (marks >= 75 && marks >= 89 ) {
    // System.out.println("The Grade of Student B");
    // } else if(marks >= 74) {
    // System.out.println("The Grade of Student C");
    // } else if (marks >= 50) {
    // System.out.println("pass");
    // } else {
    // System.out.println("Fail");
    // }
    // }

    // Week Day Finder //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int Week = sc.nextInt();
    // switch (Week) {
    // case 1:
    // System.out.println("Monday");
    // case 2:
    // System.out.println("Tuesday");
    // case 3:
    // System.out.println("Wednesday");
    // case 4:
    // System.out.println("Thursday");
    // case 5:
    // System.out.println("Friday");
    // case 6:
    // System.out.println("Saturday");
    // case 7:
    // System.out.println("Sunday");
    // default:
    // break;
    // }
    // }

    // Nested if login system //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // String correctUser = "Vaishnavi";
    // String correctPass = "12345";

    // System.out.print("Enter Your Username : ");
    // String User = sc.next();

    // System.out.print("Enter the Password : ");
    // String Pass = sc.next();

    // if (User.equals(correctUser)) {
    // if (Pass.equals(correctPass)) {
    // System.out.println("Login Success");
    // } else {
    // System.out.println("Wrong Password");
    // }
    // }
    // else {
    // System.out.println("Wrong username");
    // }
    // }

    // Triangle Type //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the side 1 : ");
    // int side1 = sc.nextInt();

    // System.out.print("Enter the side 2 : ");
    // int side2 = sc.nextInt();

    // System.out.print("Enter the side 3 : ");
    // int side3 = sc.nextInt();

    // if (side1 == side2 && side2 == side3) {
    // System.out.println("Equilateral Triangle");
    // } else if (side1 == side3 || side2 == side3 || side1 == side3) {
    // System.out.println("Isosceles Triangle");
    // } else {
    // System.out.println("Scalene Triangle");
    // }
    // }

    // Number Comparison //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the Number of b : ");
        int b = sc.nextInt();

        System.out.print("Enter the Number c : ");
        int c = sc.nextInt();

        int biggest, smallest, secondLargest;

        // Biggest find
        if (a > b && a > c) {
           biggest = a;
        } else if (b > a && b > c) {
           biggest = b;
        } else {
            biggest = c;
        }

        // Smallest Finde
        if(a < b && a < c) {
          smallest = a;
        } 
        else if(b < a && b < c) {
           smallest = b;
        }
        else {
          smallest = c;
        }

        // Second largest
         secondLargest = (a + b + c) - (biggest + smallest);

         System.out.println("Biggest : " +  biggest);
         System.out.println("Smallest : " + smallest);
         System.out.println("SecondLargest : " + secondLargest);    
        }

      
      
        // BillAmount Discount System //
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Bill Amount : ");
    int BillAmount = sc.nextInt();

    if (BillAmount > 5000) {
    System.out.println("20 % Discount \n" + "Wellcome");
    } else if (BillAmount >= 2000) {
    System.out.println("10 % Discount \n" + "Wellcome");
    } else {
    System.out.println("Not Discount \n" + "Sorry");
    }

    }
}
