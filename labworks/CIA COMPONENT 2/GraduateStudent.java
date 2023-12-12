import java.util.Scanner;

class GraduateStudent extends Student {
    protected String programName;
    protected int noOfSubjects;
    protected String classTeacherName;
    protected double marks;
    protected double attendance;

    GraduateStudent(String name, int age, double height, String institutionName, String phoneNumber) {
        super(name, age, height, institutionName, phoneNumber);
    }

    @Override
    void get() {
        Scanner scanner = new Scanner(System.in);
        super.get();
        System.out.print("Enter Program Name: ");
        this.programName = scanner.nextLine();
        System.out.print("Enter Number of Subjects: ");
        this.noOfSubjects = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Class Teacher Name: ");
        this.classTeacherName = scanner.nextLine();
        System.out.print("Enter Marks: ");
        this.marks = scanner.nextDouble();
        System.out.print("Enter Attendance: ");
        this.attendance = scanner.nextDouble();
    }

    @Override
    void show() {
        super.show();
        System.out.println("Program Name: " + programName);
        System.out.println("Number of Subjects: " + noOfSubjects);
        System.out.println("Class Teacher Name: " + classTeacherName);
        System.out.println("Marks: " + marks);
        System.out.println("Attendance: " + attendance);
    }
}
