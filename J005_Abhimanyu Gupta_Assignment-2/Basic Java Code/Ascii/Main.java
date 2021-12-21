import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        // Declare the object and initialize with
        // taking the value from user
        System.out.println("Enter the alphabet whose ascii value is to be found: ");
        Scanner sc = new Scanner(System.in);

        // Character input
        char c = sc.next().charAt(0);
        // giving the ascii value of the alphabet
        int asciivalue1 = c;
        // printing value
        System.out.println("The ASCII value of " + c + " is: " + asciivalue1);
    }
}
