package basic_concepts;

import java.util.Scanner;

public class Conrtolflowlooping {
	public class LoopingDemo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer n: ");
	        int n = scanner.nextInt();

	        int sum = 0;

	        System.out.println("Using for loop:");
	        for (int i = 1; i <= n; i++) {
	            System.out.print(i + " ");
	            sum += i;
	        }
	        System.out.println("\nSum using for loop: " + sum);

	        System.out.println("\nUsing while loop:");
	        int i = 1;
	        sum = 0;
	        while (i <= n) {
	            System.out.print(i + " ");
	            sum += i;
	            i++;
	        }
	        System.out.println("\nSum using while loop: " + sum);

	        System.out.println("\nUsing do-while loop:");
	        i = 1;
	        sum = 0;
	        do {
	            System.out.print(i + " ");
	            sum += i;
	            i++;
	        } while (i <= n);
	        System.out.println("\nSum using do-while loop: " + sum);

	        scanner.close();
	    }
	}

}
