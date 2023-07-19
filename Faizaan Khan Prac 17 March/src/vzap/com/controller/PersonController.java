package vzap.com.controller;

import vzap.com.interfaces.StudentDaoInterface;
import vzap.com.model.Student;

import java.util.ArrayList;

public class PersonController {

    private StudentDaoInterface sdi;

    public PersonController(StudentDaoInterface sdi) {
        this.sdi = sdi;
    }

    public void addStudent(Student st){
        sdi.addStudent(st);
    }

    public void deleteStudent(int studentID){
        sdi.deleteStudent(studentID);
    }

    public Student searchforStudent(int studentID){
        Student st = sdi.editStudentDetails(studentID);
        return st;
    }

    public ArrayList<Student> listAllStudents(){
        return sdi.listAllStudents();
    }

    public Student editStudentDetails(int studentID){
        Student st = this.searchforStudent(studentID);
        return st;
    }

    public void exitProgram(){
        System.out.println("Program is now quitting...");
        System.exit(0);
    }
}
