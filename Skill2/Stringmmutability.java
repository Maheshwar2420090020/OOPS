package basic_concepts;

public class Stringmmutability {
	public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;

        s1 = s1.concat(" World");

        System.out.println("s1: " + s1); 
        System.out.println("s2: " + s2); 
	}

}
