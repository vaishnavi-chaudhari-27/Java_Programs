public class Arrays {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // marks[0] = 98;
        // marks[1] = 78;
        // marks[2] = 67;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int number[] = new int[size];

        // for (int i = 0; i < size; i++) {
        // number[i] = sc.nextInt();
        // }

        // for (int i = 0; i < size; i++) {
        // System.out.println(number[i]);
        // }
        // sc.close();
        // }
        // }

        // QUE1 Take an array as input from the user. serach for a
        // given number x print th index at which it occurs //

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];

        // for (int i = 0; i < size; i++) {
        // numbers[i] = sc.nextInt();
        // }
        // int x = sc.nextInt();

        // for (int i = 0; i < numbers.length; i++) {
        // if(numbers[i] == x) {
        // System.out.println("x found at index : " + i);
        // }
        // }
        // sc.nextInt();
        // }
        // }

        // Que2
        // int[] arr = {10, 20, 30, 40, 60, 70};
        // int sum = 0;
        // for(int i=0; i<arr.length; i++){
        // sum = sum + arr[i];
        // }
        // System.out.println("Sum is : " + sum);
        // }
        // }

        // Que3
        // int[] arr = { 10, 25, 5, 40, 15 };
        // int max = arr[0];
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }
        // }
        // System.out.println("Maximum is: " + max);
        // }
        // }

        // Que4
        // int[] arr = { 10, 25, 5, 40, 15 };
        // int min = arr[0];
        // for (int i = 0; i < arr.length; i++) {

        // if (arr[i] < min) {
        // min = arr[i];
        // }
        // }
        // System.out.println("minimum is : " + min);
        // }
        // }

        // Que5

        // int[] arr = { 1, 2, 3, 4 };
        // for (int i = arr.length - 1; i >= 0; i--) {
        // System.out.print(arr[i] + " ");
        // }
        // }
        // }

        // Que6 count even number
        // int[] arr = { 2, 3, 4, 7, 8 };
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0) {
        // count++;
        // }
        // }
        // System.out.println("Even number count: " + count);
        // }
        // }

        // int[] arr = { 5, 10, 15, 20 };
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0) {
        // count++;
        // }
        // }
        // System.out.println("Even number count : " + count);
        // }
        // }

        // Que7 reverse array

        int[] arr = { 10, 20, 30, 40, 50 };
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
            System.out.println(arr[i] + " ");
        }
    }
}
