package vzap.com.view;

import vzap.com.controller.PersonController;
import vzap.com.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TextFrontEnd {
    public static void main(String[] args) {

    }
}
class ViewMenu{
    private PersonController pc;
    Scanner input;
    ArrayList<Student> list;

    public ViewMenu(){
        input = new Scanner("");
    }

    public void displayMenu(){
        while (true){
            System.out.println("+-----------------------------------------------------+");
            System.out.println("|             1. Add Student                          |");
            System.out.println("|             2. Delete Student                       |");
            System.out.println("|             3. Search for Student                   |");
            System.out.println("|             4. List all Students                    |");
            System.out.println("|             5. Edit Student Details                 |");
            System.out.println("|             6. Exit Program                         |");
            System.out.println("+-----------------------------------------------------|");
        }
    }

    public void menuSelection(){

        int choice = 0;
        System.out.println("Enter your choice: ");
        choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println("To add a new enter the students name: ");
                String name = input.nextLine();


                System.out.println("Student added");
                break;
            case 2:
                System.out.println("To delete enter the students ID number: ");
                int d = input.nextInt();

                int id = 0;
                Student st = pc.searchforStudent(id);
                pc.deleteStudent(st.getStudentID());
                System.out.println("Student deleted ");
                break;
            case 3:
                System.out.println("to search enter the students ID number: ");
                id = input.nextInt();
                st = pc.searchforStudent(id);
                System.out.println("Student name: " + st.getStudentName());
                System.out.println("Student id number: " + st.getStudentID());
                break;
            case 4:
                list = pc.listAllStudents();
                pc.listAllStudents();
                Iterator<Student> iter = list.iterator();
                while (iter.hasNext()){
                    System.out.println("---------------------------------");
                    Student stud = iter.next();
                    System.out.println("Student ID: " + stud.getStudentID());
                    System.out.println("Student name: " + stud.getStudentName());
                    System.out.println("----------------------------------");
                }
                break;
            case 5:
                System.out.println("To edit students enter an ID number: ");
                id = input.nextInt();
                st = pc.editStudentDetails(id);
                System.out.println("Existing name: " + st.getStudentName());
                System.out.println("Enter new name of student with ID of: " + st.getStudentID() + ": ");
                name = input.nextLine();
                st.setStudentName(name);
                System.out.println("Name changed....>>>>>");
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Choose a correct value");
        }



    }
}

