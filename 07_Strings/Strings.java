
public class Strings {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("My Name Is :" + name);

        // sc.close();

        // concatenation //
        // String firstName = "Vaishnavi";
        // String lastName = "Chaudhari";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName.length());

        // charAt

        // for(int i=0; i<fullName.length(); i++){
        // System.out.println(fullName.charAt(i));
        // }

        // compare
        // String name1 = "Vaishu";
        // String name2 = "Vaishnavi";

        // if(name1.compareTo(name2) == 0){
        // System.out.println("String are equal");
        // } else {
        // System.out.println("String are not equal");
        // }

        // String sentence = "Vaishnavi";
        // String name = sentence.substring(6);
        // System.out.println(name);

        // string are imutable //
        // StringBuilder sb = new StringBuilder("Rohini");
        // System.out.println(sb);

        // chat at index 0
        // System.out.println(sb.charAt(3));

        // set char at index 0
        // sb.setCharAt(0, 'M');
        // System.out.println(sb);

        // sb.insert(2, 'n');
        // System.out.println(sb);

        // sb.delete(6, 07);
        // System.out.println(sb);

        // StringBuilder sb = new StringBuilder("H");
        // sb.append("E");
        // sb.append("Y");
        // System.out.println(sb);

        StringBuilder sb = new StringBuilder("Vaishnavi");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; 

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
