package model;

import java.io.Serializable;

public class Student implements Serializable {
	

    private static final long serialVersionUID = 1L; // version control
    private int id;
    private String name;
    private int age;
    private String course;
    private float marks;

    private static int totalStudents = 0;

    private final String college = "IQRA College";

    // transient will not be serialized (e.g., temp field)
    private transient String tempCode;

    // Constructors
    public Student() {
        totalStudents++;
    }

    public Student(int id, String name, int age, String course, float marks) {
        this(); // calling default constructor
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    // Getter and Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public float getMarks() { return marks; }
    public void setMarks(float marks) { this.marks = marks; }

    public String getCollege() { return college; }

    public String getTempCode() { return tempCode; }
    public void setTempCode(String tempCode) { this.tempCode = tempCode; }

    public static int getTotalStudents() {
        return totalStudents;
    }

    // toString method
    @Override
    public String toString() {
        return "Student {" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                ", Course='" + course + '\'' +
                ", Marks=" + marks +
                ", College='" + college + '\'' +
                '}';
    }
    
}
