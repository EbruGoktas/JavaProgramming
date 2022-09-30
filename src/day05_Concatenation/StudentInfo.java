package day05_Concatenation;

import javax.lang.model.SourceVersion;

public class StudentInfo {

    public static void main(String[] args) {

        String student_name = "Ebru";
        int age = 30;
        char gender = 'F';
        String schoolName = "Cydeo";
        String phoneNumber1 = "(535)-123-45-67";
        String phoneNumber2 = "(533)-123-45-67";
        boolean isFullTime = true;
        double GPA = 3.5;

        System.out.println("student_name = " + student_name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("schoolName = " + schoolName);
        System.out.println("phoneNumber = " + phoneNumber1);
        System.out.println("phoneNumber2 = " + phoneNumber2);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("GPA = " + GPA);

    }
}
/*
    2. Create a class called StudentInfo, and declare variables for the followings:
    			1. student name (String)
    			2. age (int)
    			3. gender (char)
    			4. school name (String)
    			5. phone number (String) (###)-###-####
    			6. full time (boolean)
 */