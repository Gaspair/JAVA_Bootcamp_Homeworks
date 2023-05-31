import java.util.Scanner;

public class StudentGrader {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's score:");
        int score = sc.nextInt();


        String grade;

        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score <= 89) {
            grade = "B";
        } else if (score >= 70 && score <= 79) {
            grade = "C";
        } else if (score >= 60 && score <= 69) {
            grade = "D";
        } else if (score >= 50 && score <= 59) {
            grade = "E";
        } else {
            grade = "F";
        }

        System.out.println("The student's grade is:"+ grade);


        sc.close();


    }
}
