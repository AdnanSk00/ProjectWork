package main;

import model.Student;
import service.StudentService;
import service.StudentServiceImpl;
import exception.StudentNotFoundException;

import java.io.*;
import java.util.*;

public class SSMS {

    private static final Scanner sc = new Scanner(System.in);
    private static final StudentService service = new StudentServiceImpl();
    private static final String FILE_PATH = "data/students_backup.dat";

    public static void main(String[] args) {
        System.out.println("📘 Welcome to Smart Student Management System 📘");

      menu();	// start recursion
    }

    private static void menu() {
        System.out.println("\n1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Delete Student");
        System.out.println("4. Search by ID");
        System.out.println("5. Search by Name");
        System.out.println("6. Search by Course & Min Marks");
        System.out.println("7. Save to File (Thread)");
        System.out.println("8. Sort Students by Marks");
        System.out.println("9. Exit");

        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        try {
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> deleteStudent();
                case 4 -> searchById();
                case 5 -> searchByName();
                case 6 -> searchByCourseAndMarks();
                case 7 -> saveToFileInThread();
                case 8 -> sortStudentsByMarks();
                case 9 -> {
                    System.out.println("Thanks for using SSMS. Bye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option.");
            }
        } catch (StudentNotFoundException e) {
            System.err.println("❌ " + e.getMessage());
        } catch (Exception e) {
            System.err.println("⚠️ Error: " + e.getMessage());
        }

        menu(); // ⬅️ Recursion to show menu again
    }


    private static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Course: ");
        String course = sc.next();

        System.out.print("Enter Marks: ");
        float marks = sc.nextFloat();

        Student s = new Student(id, name, age, course, marks);
        s.setTempCode("TEMP" + id); // transient field

        service.addStudent(s);
    }

    private static void viewStudents() {
        List<Student> students = service.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            Iterator<Student> it = students.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

    private static void deleteStudent() throws StudentNotFoundException {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        service.deleteStudent(id);
        System.out.println("Deleted successfully.");
    }

    private static void searchById() throws StudentNotFoundException {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();
        Student s = service.searchStudentById(id);
        System.out.println(s);
    }

    private static void searchByName() {
        System.out.print("Enter name to search: ");
        String name = sc.next();
        List<Student> result = service.searchStudent(name);
        result.forEach(System.out::println);
    }

    private static void searchByCourseAndMarks() {
        System.out.print("Enter course: ");
        String course = sc.next();
        System.out.print("Enter minimum marks: ");
        float marks = sc.nextFloat();

        List<Student> result = service.searchStudent(course, marks);
        result.forEach(System.out::println);
    }

    private static void saveToFileInThread() {
        List<Student> students = service.getAllStudents();
        Thread fileWriter = new Thread(() -> {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
                oos.writeObject(students);
                System.out.println("✅ Backup saved to file: " + FILE_PATH);
            } catch (IOException e) {
                System.err.println("❌ Error saving to file: " + e.getMessage());
            } finally {
                System.out.println("File operation completed.");
            }
        });

        fileWriter.start();
    }
    
    private static void sortStudentsByMarks() {
        List<Student> list = service.getAllStudents();
        if (list.isEmpty()) {
            System.out.println("No students to sort.");
            return;
        }

        // ✅ Using Comparator for sorting by marks (descending)
        list.sort((s1, s2) -> Float.compare(s2.getMarks(), s1.getMarks()));

        System.out.println("\n📊 Students sorted by marks (High to Low):");
        list.forEach(System.out::println);
    }

    
}

