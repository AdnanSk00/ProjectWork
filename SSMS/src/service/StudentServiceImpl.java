package service;

import dao.StudentDAO;
import exception.StudentNotFoundException;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDAO dao = new StudentDAO();

    @Override
    public void addStudent(Student s) {
        dao.addStudent(s);
    }

    @Override
    public List<Student> getAllStudents() {
        return dao.getAllStudents();
    }

    @Override
    public void deleteStudent(int id) throws StudentNotFoundException {
        try {
            boolean removed = dao.deleteStudent(id);
            if (!removed) throw new StudentNotFoundException("Student not found with ID: " + id);
        } catch (Exception e) {
            throw new StudentNotFoundException(e.getMessage());
        }
    }

    @Override
    public Student searchStudentById(int id) throws StudentNotFoundException {
        for (Student s : getAllStudents()) {
            if (s.getId() == id) return s;
        }
        throw new StudentNotFoundException("No student found with ID: " + id);
    }

    // ✅ Method Overloading (compile-time polymorphism)
    @Override
    public List<Student> searchStudent(String name) {
        List<Student> result = new ArrayList<>();
        for (Student s : getAllStudents()) {
            if (s.getName().equalsIgnoreCase(name)) {
                result.add(s);
            }
        }
        return result;
    }

    @Override
    public List<Student> searchStudent(String course, float minMarks) {
        List<Student> result = new ArrayList<>();
        for (Student s : getAllStudents()) {
            if (s.getCourse().equalsIgnoreCase(course) && s.getMarks() >= minMarks) {
                result.add(s);
            }
        }
        return result;
    }
}

	