import java.util.Scanner;

abstract class Person {
    protected String name;
    protected int age;
    protected double height;
    protected String gender;

    public Person(String name, int age, double height, String gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }

    public abstract void get();

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Gender: " + gender);
    }
}

class Student extends Person {
    protected static int studentCounter = 1000;
    protected int studentId;
    protected String institutionName;
    protected String phoneNumber;

    public Student(String name, int age, double height, String gender) {
        super(name, age, height, gender);
    }

    @Override
    public void get() {
        Scanner scanner = new Scanner(System.in);

        //Student ID using the static variable
        studentId = studentCounter++;

        System.out.print("Enter institution name: ");
        institutionName = scanner.nextLine();

        System.out.print("Enter phone number: ");
        phoneNumber = scanner.nextLine();
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Student ID: " + studentId);
        System.out.println("Institution Name: " + institutionName);
        System.out.println("Phone Number: " + phoneNumber);
    }
}

class GraduateStudent extends Student {
    private String programName;
    private int noOfSubjects;
    private String classTeacherName;
    private double marks;
    private double attendance;

    public GraduateStudent(String name, int age, double height, String gender) {
        super(name, age, height, gender);
    }

    @Override
    public void get() {
        super.get();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter program name: ");
        programName = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        noOfSubjects = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter class teacher name: ");
        classTeacherName = scanner.nextLine();

        System.out.print("Enter marks: ");
        marks = scanner.nextDouble();

        System.out.print("Enter attendance: ");
        attendance = scanner.nextDouble();
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Program Name: " + programName);
        System.out.println("Number of Subjects: " + noOfSubjects);
        System.out.println("Class Teacher Name: " + classTeacherName);
        System.out.println("Marks: " + marks);
        System.out.println("Attendance: " + attendance);
    }

    public boolean isInMCAProgram() {
        return programName.equalsIgnoreCase("MCA");
    }

    public boolean isMale() {
        return gender.equalsIgnoreCase("male");
    }

    public boolean hasAbove60PercentMarks() {
        return marks > 60.0;
    }

    public boolean hasAbove75PercentAttendance() {
        return attendance > 75.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();
        scanner.nextLine(); 

        Person[] people = new Person[numberOfPersons];

        for (int i = 0; i < people.length; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            System.out.print("Enter height: ");
            double height = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Enter gender: ");
            String gender = scanner.nextLine().toLowerCase();

            if (gender.equals("male") || gender.equals("female")) {
                System.out.print("Is person " + (i + 1) + " a student? (yes/no): ");
                String response = scanner.nextLine().toLowerCase();

                if (response.equals("yes")) {
                    people[i] = new Student(name, age, height, gender);
                } else {
                    people[i] = new GraduateStudent(name, age, height, gender);
                }

                System.out.println("\nEnter details for person " + (i + 1) + ":");
                people[i].get();

                System.out.println("\nInformation for person " + (i + 1) + ":");
                people[i].show();
                System.out.println("\n");
            } else {
                System.out.println("Invalid gender. Please enter 'male' or 'female'.");
                i--; 
            }
        }

        System.out.println("\nList of male students with above 60% marks in MCA:");
        boolean maleStudentFound = false;
        for (Person person : people) {
            if (person instanceof GraduateStudent) {
                GraduateStudent graduateStudent = (GraduateStudent) person;
                if (graduateStudent.isMale() && graduateStudent.isInMCAProgram() && graduateStudent.hasAbove60PercentMarks()) {
                    graduateStudent.show();
                    maleStudentFound = true;
                }
            }
        }
        if (!maleStudentFound) {
            System.out.println("No male students with above 60% marks in MCA found.");
        }

        System.out.println("\nList of female students with above 75% attendance in MCA:");
        boolean femaleStudentFound = false;
        for (Person person : people) {
            if (person instanceof GraduateStudent) {
                GraduateStudent graduateStudent = (GraduateStudent) person;
                if (!graduateStudent.isMale() && graduateStudent.isInMCAProgram() && graduateStudent.hasAbove75PercentAttendance()) {
                    graduateStudent.show();
                    femaleStudentFound = true;
                }
            }
        }
        if (!femaleStudentFound) {
            System.out.println("No female students with above 75% attendance in MCA found.");
        }
    }
}