import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }
}

public class StudentReader {

    public List<Student> readStudents() {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many students? ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            students.add(new Student(name, age));
        }
        return students;
    }
    public List<String> getStudentList() {
        List<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        return students;
    }
    public void printStudents() {
        List<String> students = getStudentList();
        System.out.println("List of students:");
        for (String student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        StudentReader reader = new StudentReader();
        List<Student> students = reader.readStudents();
        
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student);
        }
        StudentReader reader2 = new StudentReader();
        reader.printStudents();
    }
}
