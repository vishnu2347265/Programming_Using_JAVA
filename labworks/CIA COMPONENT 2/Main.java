public class Main {
    public static void main(String[] args) {
        GraduateStudent[] graduateStudents = new GraduateStudent[5];

        for (int i = 0; i < graduateStudents.length; i++) {
            graduateStudents[i] = new GraduateStudent("Student" + (i + 1), 20 + i, 170 + i, "Institute" + (i + 1),
                    "Phone" + (i + 1));
            graduateStudents[i].get();
        }

        System.out.println("\nDisplaying Student Information:");
        for (GraduateStudent graduateStudent : graduateStudents) {
            graduateStudent.show();
            System.out.println();
        }
    }
}
