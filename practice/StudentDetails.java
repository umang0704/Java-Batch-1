package practice;

import java.util.Scanner;

public class StudentDetails {

    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    public String getStudentName() {
        return this.studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentAddress() {
        return this.studentAddress;
    }

    public String getCollegeName() {
        return this.collegeName;
    }

    public StudentDetails(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }

    public StudentDetails(int studentId, String studentName, String studentAddress, String collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentId = 0;
        String name = "";
        String address = "";
        String collegeName = "";
        StudentDetails object = null;

        System.out.println("Enter Student's Id:");
        studentId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student's Name:");
        name = sc.nextLine();
        System.out.println("Enter Student's address:");
        address = sc.nextLine();
        System.out.println("Whether the student is from NIT(Yes/No):");
        String option = "";
        boolean isOptionCorrect = false;
        while (!isOptionCorrect) {
            option = sc.nextLine();
            if (option.equalsIgnoreCase("no")) {
                isOptionCorrect = true;
                System.out.println("Enter the college name:");
                collegeName = sc.nextLine();
                object = new StudentDetails(studentId, name, address, collegeName);
            } else if (option.equalsIgnoreCase("yes")) {
                isOptionCorrect = true;
                object = new StudentDetails(studentId, name, address);
            } else {
                System.out.println("Wrong Option\nPlease Input again:");
                option = sc.nextLine();
            }

        }
        System.out.println("Student id:" + object.getStudentId() + "\n"
                + "Student name:" + object.getStudentName() + "\n"
                + "Address:" + object.getStudentAddress() + "\n"
                + "College name:" + object.getCollegeName());

    }
}
