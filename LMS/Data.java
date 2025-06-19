package LMS;

public class Data {
    public static void main(String[] args) {
        //student details
        String studentname="Sai Adarsh";
        int studentid=25801;
        short age=20;
        String studentemail="adarsh@gmail.com";
        Long studentno=759687458l;
        char gender='M';

        //Trainer Details
        String trainername="Ramesh";
        int trainerid=25801;
        short trainerage=35;
        String traineremail="Ramesh@gmail.com";
        Long trainerno=759687458l;
        char sex='M';

        //Course Details
        String coursename="Java Full Stack";
        int courseid=25801;
        short durationweeks=20;
        int noofstudents=20;
        int price=25000;
        boolean trainerassined=true; 

        //Student Output
        System.out.println("Student Name= "+studentname);
        System.out.println("Student ID= "+studentid);
        System.out.println("Student Age= "+age);
        System.out.println("Student Email= "+studentemail);
        System.out.println("Student Number= "+studentno);
        System.out.println("Gender= "+gender);

        //Trainer Output
        System.out.println("====================");
        System.out.println("Trainer Name= "+trainername);
        System.out.println("Trainer ID= "+trainerid);
        System.out.println("Trainer Age= "+trainerage);
        System.out.println("Trainer Email= "+traineremail);
        System.out.println("Trainer Number= "+trainerno);
        System.out.println("Gender= "+sex);

        //Course Output
        System.out.println("====================");
        System.out.println("Course Name= "+coursename);
        System.out.println("Course ID= "+courseid);
        System.out.println("Course Duration= "+durationweeks);
        System.out.println("Students per Batch= "+noofstudents);
        System.out.println("Course Fee= "+price);
        System.out.println("Trainer Available= "+trainerassined);
    }
    
}
