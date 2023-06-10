package com.jap.course3;

public class StudentMarks {

    //method overloading...medical students
    public int calculateMarks(int math,int physics,int chemistry,int biology){
        int sum=math+physics+chemistry+biology;
        System.out.println("Sum of marks for Medical pathway Students: "+sum);
        return sum;
    }

    //method for non-medical students...
    public double calculateMarks(double maths,double physics,double chemistry){
        double sum=maths+physics+chemistry;
        System.out.println("Sum of marks for Non-Medical pathway Students: "+sum);
        return sum;
    }

    //method for business students...
    public float calculateMarks(float businessStudies, float finance, float accounting){
        float sum=businessStudies+finance+accounting;
        System.out.println("Sum of marks for Business pathway Students: "+sum);
        return sum;
    }
}
