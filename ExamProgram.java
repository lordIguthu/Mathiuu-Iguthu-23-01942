// Imports the Scanner class to enable for user input
import java.util.Scanner;


public class ExamProgram {
    public static void main(String[] args) {
        Scanner StudentData = new Scanner(System.in);

// Variable to store the user's menu choice
        int choice;

 // Variables for storing assessment and exam marks
        double ass1 = 0, ass2 = 0, ass3 = 0, cat1 = 0, cat2 = 0, finalExam = 0;

// Array to store coursework marks
        double[] courseworkMarks = new double[5];

// Variable to count the number of assessments done
        int assessmentsDone = 0;

        do {
// Displays the menu options
            System.out.println("Menu:");
            System.out.println("1. View coursework results");
            System.out.println("2. View exam results");
            System.out.println("3. Exit the program");
            System.out.print("Choose an option: ");

// Reads the user's menu choice
            choice = StudentData.nextInt();

// Prompts the user to enter marks for each coursework assessment
            switch (choice) {
                case 1:
                    System.out.print("Enter marks for Assignment 1: ");
                    courseworkMarks[0] = StudentData.nextDouble();
                    System.out.print("Enter marks for Assignment 2: ");
                    courseworkMarks[1] = StudentData.nextDouble();
                    System.out.print("Enter marks for Assignment 3: ");
                    courseworkMarks[2] = StudentData.nextDouble();
                    System.out.print("Enter marks for CAT 1: ");
                    courseworkMarks[3] = StudentData.nextDouble();
                    System.out.print("Enter marks for CAT 2: ");
                    courseworkMarks[4] = StudentData.nextDouble();

// Variable to store the total coursework marks                    
double coursework = 0;

// Loops through the courseworkMarks array to calculate the total and count the assessments done
                    for (int i = 0; i < courseworkMarks.length; i++) {

// Adds each mark to the total coursework
                        coursework += courseworkMarks[i];

// Checks if the assessment has been done
                        if (courseworkMarks[i] > 0) {

// Increments the count of assessments done
                            assessmentsDone++;
                        }
                    }

// Displays the total coursework marks
                    System.out.println("Coursework total: " + coursework);

// Checks if the student has completed at least 2/3 of the coursework
                    if (assessmentsDone < (2.0 / 3.0) * courseworkMarks.length) {                     
                        System.out.println("Repeat the unit.");
                    }
                    break;

                case 2:
// Checks if coursework marks have been entered
                    if (courseworkMarks[0] == 0 || courseworkMarks[1] == 0 || courseworkMarks[2] == 0 || courseworkMarks[3] == 0 || courseworkMarks[4] == 0) {
                        System.out.println("You cannot get you total score without the course work filled.");
                        System.out.println("Kindly get your course work first then seek your total score else repeate the unit.");
// Prompts the user to enter marks for the final exam
                    } else {
                        System.out.print("Enter marks for the final exam: ");
                        finalExam = StudentData.nextDouble();

// Variable to store the total coursework score
                        double courseworkScore = 0;
// Loops through the courseworkMarks to calculate the total coursework score
                        for (double mark : courseworkMarks) {

// Adds each mark to the total coursework score
                            courseworkScore += mark;
                        }
                        double courseworkPercentage = courseworkScore / 50 * 50;  
                        double finalExamPercentage = finalExam;  
                        double totalScore = courseworkPercentage + finalExamPercentage;

                        // Displays the total score
System.out.println("Total Score: " + totalScore);

                    }
                    break;

// Message for exiting the program                
case 3:
                    System.out.println("Exiting the program.");
                    break;

            }
// Continues the loop until the user chooses to exit
        } while (choice != 3);

    }
}
