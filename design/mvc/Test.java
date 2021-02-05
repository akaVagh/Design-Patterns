/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.mvc;

/**
 *
 * @author harsh vaghani
 */
public class Test {

    public static void main(String[] args) {
        Student student = getStudentFromDB();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        System.out.println("Update student's Roll No.");
        controller.setStudentRollNo(1);
        controller.updateView();
    }

    public static Student getStudentFromDB() {
        Student st = new Student();
        st.setName("Harsh");
        st.setRollNo(2);
        return st;
    }
}
