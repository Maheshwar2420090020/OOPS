package basic_concepts;

import java.util.Scanner;

public class Controlflowconditional {
	public class GradeEvaluator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your marks (0–100): ");
	        int marks = scanner.nextInt();

	        if (marks >= 90) {
	            System.out.println("Grade: A");
	        } else if (marks >= 80) {
	            System.out.println("Grade: B");
	        } else if (marks >= 70) {
	            System.out.println("Grade: C");
	        } else if (marks >= 60) {
	            System.out.println("Grade: D");
	        } else {
	            System.out.println("Grade: F");
	        }

	        switch (marks / 10) {
	            case 10:
	            case 9:
	                System.out.println("Remark: Excellent");
	                break;
	            case 8:
	                System.out.println("Remark: Very Good");
	                break;
	            case 7:
	                System.out.println("Remark: Good");
	                break;
	            case 6:
	                System.out.println("Remark: Satisfactory");
	                break;
	            default:
	                System.out.println("Remark: Needs Improvement");
	        }

	        scanner.close();
	    }
	}

}
