import java.util.*;

// Define the Student class
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

// Define the Checker class to sort students
class Checker implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        // Compare by CGPA in descending order
        if (Double.compare(b.getCgpa(), a.getCgpa()) != 0) {
            return Double.compare(b.getCgpa(), a.getCgpa());
        }
        // If CGPA is the same, compare by first name alphabetically
        int nameComparison = a.getFname().compareTo(b.getFname());
        if (nameComparison != 0) {
            return nameComparison;
        }
        // If first name is also the same, compare by ID in ascending order
        return Integer.compare(a.getId(), b.getId());
    }
}

public class compartorStudentClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of students
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();

        List<Student> studentList = new ArrayList<>();

        // Input details for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + " (Format: ID Name CGPA):");
            int id = sc.nextInt();
            String fname = sc.next();
            double cgpa = sc.nextDouble();

            Student student = new Student(id, fname, cgpa);
            studentList.add(student);
        }

        // Sort the students using Checker
        Collections.sort(studentList, new Checker());

        // Display sorted students
        System.out.println("Sorted students:");
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }

        sc.close();
    }
}
