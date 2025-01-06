import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class compartorStudentClass3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask the user for the number of students
        System.out.print("Enter the number of students: ");
        int n = in.nextInt();
        List<Student> students = new ArrayList<>();

        // Ask the user to enter details for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Enter ID: ");
            int id = in.nextInt();
            System.out.print("Enter First Name: ");
            String fname = in.next();
            System.out.print("Enter CGPA: ");
            double cgpa = in.nextDouble();
            students.add(new Student(id, fname, cgpa));
        }

        // Sort the list using simplified comparator logic
        Collections.sort(students, Comparator
                .comparing(Student::getCgpa, Comparator.reverseOrder()) // Sort by CGPA (descending)
                .thenComparing(Student::getFname) // If CGPA is the same, sort by first name (alphabetical)
                .thenComparingInt(Student::getId)); // If both CGPA and name are the same, sort by ID (ascending)

        // Output the sorted student names
        System.out.println("\nSorted student names:");
        for (Student student : students) {
            System.out.println(student.getFname());
        }
    }
}
