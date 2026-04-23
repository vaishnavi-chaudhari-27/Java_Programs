import java.util.ArrayList;

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
    // public static int calcPower(int x, int n) {
    // if (n == 0) {
    // return 1;
    // }
    // if (x == 0) {
    // return 0;
    // }
    // if (n % 2 == 0) {
    // return calcPower(x, n / 2) * calcPower(x, n / 2);
    // } else {
    // return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
    // }
    // }

    // public static void main(String[] args) {
    // int x = 2, n = 5;
    // int ans = calcPower(x, n);
    // System.out.println(ans);
    // }
    // }

    // Que 8 //
    // public static void towerOfHanoi(int n, String src, String helper, String
    // dest) {
    // if (n == 1) {
    // System.out.println("transfer disk " + n + "from" + src + "to" + dest);
    // return;
    // }
    // towerOfHanoi(n - 1, src, dest, helper);
    // System.out.println("transfer disk " + n + "from" + src + "to" + dest);
    // towerOfHanoi(n - 1, helper, src, dest);
    // }

    // public static void main(String[] args) {
    // int n = 3;
    // towerOfHanoi(n, "S", "H", "D");
    // }
    // }

    // Que 9 print a string in reverse 'abcd'//
    // public static void printRev(String str, int idx) {
    // if (idx == 0) {
    // System.out.println(str.charAt(idx));
    // return;
    // }
    // System.out.println(str.charAt(idx));
    // printRev(str, idx - 1);
    // }

    // public static void main(String[] args) {
    // String str = "abcd";
    // printRev(str, str.length()-1);
    // }
    // }

    // Que 10 find the 1st and last occurance of an element in string 'abaacdaefaah'

    // public static int first = -1;
    // public static int last = -1;

    // public static void findOccurance(String str, int indx, char element) {
    // if (indx == str.length()) {
    // System.out.println(first);
    // System.out.println(last);
    // return;
    // }
    // char currChar = str.charAt(indx);
    // if (currChar == element) {
    // if (first == -1) {
    // first = indx;
    // } else {
    // last = indx;
    // }
    // }
    // findOccurance(str, indx + 1, element);
    // }

    // public static void main(String[] args) {
    // String str = "abaacdaefaah";
    // findOccurance(str, 0, 'a');
    // }
    // }

    // Que 11 check if an array is sorted(strictly increses)//
    // public static boolean isSorted(int arr[], int idx) {
    // if (idx == arr.length - 1) {
    // return true;
    // }
    // if (arr[idx] < arr[idx + 1]) {
    // return isSorted(arr, idx + 1);
    // } else {
    // return false;
    // }
    // }

    // public static void main(String[] args) {
    // int arr[] = { 1, 3, 8 };
    // System.out.println(isSorted(arr, 0));
    // }
    // }

    // Que 12 move all 'x' to the end of the string 'axbcxxd' //
    // public static void moveAllX(String str, int idx, int count, String newString)
    // {
    // if (idx == str.length()) {
    // for (int i = 0; i < count; i++) {
    // newString += 'x';
    // }
    // System.out.println(newString);
    // return;
    // }
    // char currChar = str.charAt(idx);
    // if (currChar == 'x') {
    // count++;
    // moveAllX(str, idx + 1, count, newString);
    // } else {
    // newString += currChar;
    // moveAllX(str, idx + 1, count, newString);
    // }
    // }

    // public static void main(String[] args) {
    // String str = "axbcxxd";
    // moveAllX(str, 0, 0, "");
    // }
    // }

    // Que 12 remove duplicates in a string //
    // public static boolean[] map = new boolean[26];

    // public static void removeDuplicates(String str, int idx, String newString) {
    // if (idx == str.length()) {
    // System.out.println(newString);
    // return;
    // }
    // char currChar = str.charAt(idx);
    // if (map[currChar - 'a']) {
    // removeDuplicates(str, idx + 1, newString);
    // } else {
    // newString += currChar;
    // map[currChar - 'a'] = true;
    // removeDuplicates(str, idx + 1, newString);
    // }
    // }

    // public static void main(String[] args) {
    // String str = "abbccda";
    // removeDuplicates(str, 0, "");
    // }
    // }

    // Que IMP 13 print all the subsequences of a string //
    // public static void subsequences(String str, int idx, String newString) {
    // if (idx == str.length()) {
    // System.out.println(newString);
    // return;
    // }
    // char currChar = str.charAt(idx);
    // subsequences(str, idx + 1, newString + currChar);

    // subsequences(str, idx + 1, newString);
    // }

    // public static void main(String[] args) {
    // String str = "abc";
    // subsequences(str, 0, "");
    // }
    // }

    // Que 14 print all the unique subsequences of a string //
    // public static void subsequences(String str, int idx, String newString,
    // HashSet<String> set) {
    // if (idx == str.length()) {
    // if (set.contains(newString)) {
    // return;
    // } else {
    // System.out.println(newString);
    // set.add(newString);
    // return;
    // }
    // }
    // char currChar = str.charAt(idx);
    // subsequences(str, idx + 1, newString + currChar, set);

    // subsequences(str, idx + 1, newString, set);
    // }

    // public static void main(String[] args) {
    // String str = "abc";
    // HashSet<String> set = new HashSet<>();
    // subsequences(str, 0, "", set);
    // }
    // }

    // Que 15 print keypad combination //
    // public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno",
    // "pqrs", "tu", "vwx", "yz" };

    // public static void printCom(String str, int idx, String combination) {
    // if (idx == str.length()) {
    // System.out.println(combination);
    // return;
    // }
    // char currChar = str.charAt(idx);
    // String mapping = keypad[currChar - '0'];

    // for (int i = 0; i < mapping.length(); i++) {
    // printCom(str, idx + 1, combination + mapping.charAt(i));
    // }
    // }

    // public static void main(String[] args) {
    // String str = "2";
    // printCom(str, 0, "");
    // }
    // }

    // Que 16 print all permutations of a string //
    // public static void printPerm(String str, String permutation) {
    // if (str.length() == 0) {
    // System.out.println(permutation);
    // return;
    // }
    // for (int i = 0; i < str.length(); i++) {
    // char currChar = str.charAt(i);
    // String newStr = str.substring(0, i) + str.substring(i + 1);
    // printPerm(newStr, permutation + currChar);
    // }
    // }

    // public static void main(String[] args) {
    // String str = "abc";
    // printPerm(str, "");
    // }
    // }

    // Que 17 count total paths in a maze to move from(0,0) to (n, m)//
    // public static int countPaths(int i, int j, int n, int m) {
    // if (i == n || j == m) {
    // return 0;
    // }
    // if (i == n - 1 && j == m - 1) {
    // return 1;
    // }
    // int downPaths = countPaths(i + 1, j, n, m);
    // int rightPaths = countPaths(i, j + 1, n, m);
    // return downPaths + rightPaths;
    // }

    // public static void main(String[] args) {
    // int n = 3, m = 3;
    // int totalPaths = countPaths(0, 0, n, m);
    // System.out.println(totalPaths);
    // }
    // }

    // Que 18 place tiles of size 1xm in a floor of size nxm //
    // public static int placeTiles(int n, int m) {
    // if (n == m) {
    // return 2;
    // }
    // if (n < m) {
    // return 1;
    // }

    // int vertPlacements = placeTiles(n - m, m);

    // int horPlacements = placeTiles(n - 1, m);

    // return vertPlacements + horPlacements;
    // }

    // public static void main(String[] args) {
    // int n = 5, m = 5;
    // System.out.println(placeTiles(n, m));
    // }
    // }

    // Que 19 find the number of ways in which you can invite n people to //
    // you party single or in pairs //
    // public static int callGuest(int n) {
    // if (n <= 1) {
    // return 1;
    // }
    // int ways1 = callGuest(n - 1);

    // int ways2 = (n - 1) * callGuest(n - 2);
    // return ways1 + ways2;
    // }

    // public static void main(String[] args) {
    // int n = 4;
    // System.out.println(callGuest(n));
    // }
    // }

    // Que 20 print all the subset of a set of first n natural number //
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.println(subset.get(i) + "");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }
        subset.add(n);
        findSubset(n - 1, subset);

        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}