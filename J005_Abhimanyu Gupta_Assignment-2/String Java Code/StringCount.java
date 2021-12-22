//Abhimanyu Gupta
//J005
//BTech Data Science
// 70092000030

public class StringCount {
    public static void main(String[] args) {
        String line = "Abhimanyu Gupta Studying BTech Data Science";
        int count = 0;

        // Counts each character except space
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != ' ')
                count++;
        }

        // Displays the total number of Number of character used are
        System.out.println("Number of character used are: " + count);
    }
}