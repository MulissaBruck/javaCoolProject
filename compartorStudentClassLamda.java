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

// Main class containing the solution
public class compartorStudentClassLamda {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask the user for the number of students
        System.out.print("Enter the number of students: ");
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();

        // Input student data
        for (int i = 0; i < testCases; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = in.nextInt();
            System.out.print("Name: ");
            String fname = in.next();
            System.out.print("CGPA: ");
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
        }

        // Sort using a lambda expression to define the comparator
        studentList.sort((s1, s2) -> {
            // First compare by CGPA in descending order
            int cgpaComparison = Double.compare(s2.getCgpa(), s1.getCgpa());
            if (cgpaComparison != 0)
                return cgpaComparison;

            // If CGPA is the same, compare by first name alphabetically
            int nameComparison = s1.getFname().compareTo(s2.getFname());
            if (nameComparison != 0)
                return nameComparison;

            // If both CGPA and first name are the same, compare by ID in ascending order
            return Integer.compare(s1.getId(), s2.getId());
        });

        // Output the sorted list of student first names
        System.out.println("\nSorted student names based on CGPA, Name, and ID:");
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
