import java.util.Scanner;

class Student extends Person {
    protected static int studentCount = 1000;
    protected int studentId;
    protected String institutionName;
    protected String phoneNumber;

    Student(String name, int age, double height, String institutionName, String phoneNumber) {
        super(name, age, height);
        this.studentId = studentCount++;
        this.institutionName = institutionName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    void get() {
        Scanner scanner = new Scanner(System.in);
        super.get();
        System.out.print("Enter Institution Name: ");
        this.institutionName = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        this.phoneNumber = scanner.nextLine();
    }

    @Override
    void show() {
        super.show();
        System.out.println("Student ID: " + studentId);
        System.out.println("Institution Name: " + institutionName);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
