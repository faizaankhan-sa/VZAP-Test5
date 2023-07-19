package vzap.com.interfaces;

import vzap.com.model.Student;

import java.util.ArrayList;

public interface StudentDaoInterface {
    void addStudent(Student st);

    void deleteStudent(int studentID);

    Student editStudentDetails(int studentID);

    ArrayList<Student> listAllStudents();
}
