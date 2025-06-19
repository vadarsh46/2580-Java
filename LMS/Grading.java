package LMS;

public class Grading {
    public static void main(String[] args) {
        int id=584301;
        String name="Adarsh";
        short age=23;
        int quizmarks=50;
        int assignmentmarks=50;
        int exammarks=50;
        float attendance=74.0f;

        //Total Score
        int totalscore=quizmarks+assignmentmarks+exammarks;
        
        //Average Score
        float averagescore=totalscore/3f;

        //Relational Operators
        boolean ispassed=averagescore >= 50;

        //Increment
        attendance++;

        //Logical Operators
        //If the student qualifies for an attendance award (requires high attendance and a passing grade)
        boolean isqualifies=(attendance >= 75 && ispassed);
        
        //output
        System.out.println("Student Name "+name);
        System.out.println("Quiz Marks "+quizmarks);
        System.out.println("Assignment Marks "+assignmentmarks);
        System.out.println("Exam Marks "+exammarks);
        System.out.println("Total Score "+totalscore);
        System.out.println("Average Score"+averagescore);
        System.out.println("Is Passed "+ispassed);
        System.out.println("Attendance "+attendance);
        System.out.println("If Qualifies "+isqualifies);
    }
    
}
