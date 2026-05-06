import java.util.Scanner;

public class Practice {
    // Que1 public static int productEvenOdd(int arr[], int n) {

    // int evenSum = 0;
    // int oddSum = 0;

    // for (int i = 0; i < n; i++) {
    // if (arr[i] % 2 == 0)
    // evenSum += arr[i];
    // else
    // oddSum += arr[i];
    // }
    // return evenSum * oddSum;
    // }

    // public static void main(String arg[]) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the n : ");
    // int n = sc.nextInt();
    // // Enter the 5 elements of Array:
    // // "Enter the " + n + " elements of Array:"
    // System.out.print("Enter the " + n + " element of array : ");
    // int arr[] = new int[n];
    // for (int i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();
    // }
    // int ans = productEvenOdd(arr, n);
    // System.out.println(ans);
    // }

    // Que2 public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter the size of Array : ");
    // int n = sc.nextInt();
    // int a[] = new int[n];

    // System.out.println("Enter " + n + " Element in the Array : ");
    // for(int i=0; i<n; i++) {
    // a[i] = sc.nextInt();
    // }

    // System.out.println("The Array Element are :");
    // for(int i=0; i<n; i++) {
    // System.out.println("Array " + "[" + (i+1) + "]" + " = " + a[i]);
    // }
    // System.out.println("End of the Program !");
    // System.out.println("Thank Yoo");
    // }
    // }

    // Que3 largest number //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int arr[] = { 2, 5, 1, 8, 3 };
    // int largest = arr[0];
    // for (int i = 1; i < arr.length; i++) {
    // if (arr[i] > largest) {
    // largest = arr[i];
    // }
    // }
    // System.out.println("Largest = " + largest);
    // }

    // Que4 smallest number //
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int arr[] = { 2, 5, 1, 8, 3 };

    // int smallest = arr[0];
    // for (int i = 1; i < arr.length; i++) {
    // if (arr[i] < smallest) {
    // smallest = arr[i];
    // }
    // }
    // System.out.println("Smallest = " + smallest);
    // }

    // Que5 Sum of array //

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int arr[] = { 2, 5, 1, 8, 3 };
    // int sum = 0;

    // for (int i = 0; i < arr.length; i++) {
    // sum = sum + arr[i];
    // }
    // System.out.println("Sum is :" + sum);
    // }

    // Que6 reverse Array //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 4, 6, 5, 3 };
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
