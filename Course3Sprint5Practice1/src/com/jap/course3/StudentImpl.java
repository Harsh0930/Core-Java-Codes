package com.jap.course3;

public class StudentImpl {

    public static void main(String[] args) {
        StudentMarks student=new StudentMarks();
        String studentType="Business";

        if (studentType.equalsIgnoreCase("Medical")){
            student.calculateMarks(52,85,45,65);
        } else if (studentType.equalsIgnoreCase("Non medical")) {
            student.calculateMarks(65.0,75.4,85.5);
        } else if (studentType.equalsIgnoreCase("Business")) {
            student.calculateMarks(66.5f,85.5f,45.2f);
        }else {
            System.out.println("Invalid!!!");
        }
    }


}
