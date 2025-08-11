package basic_concepts;

public class Stringmanupulation {
	 public static void main(String[] args) {
	        String original = "Java Programming";

	        
	        System.out.println("Length: " + original.length());

	       
	        System.out.println("Substring: " + original.substring(5));

	       
	        System.out.println("Replace: " + original.replace("Java", "Python"));

	        
	        System.out.println("Uppercase: " + original.toUpperCase());

	        
	        System.out.println("Char at index 2: " + original.charAt(2));

	        
	        System.out.println("Index of 'Program': " + original.indexOf("Program"));
	    }

}
