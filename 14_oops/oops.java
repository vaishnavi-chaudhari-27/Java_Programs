class Student {
    String name;
    int prn;

    public void getInfo() {
        System.out.println("The name of this student is" + this.name);
        System.out.println("The PRN of this student is" + this.prn);
    }
}

public class oops {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "chikku";
        s1.prn = 234;
        s1.getInfo();

        Student s2 = new Student();
        s2.name = "Vaishu";
        s2.prn = 123;
        s2.getInfo();
    }
}