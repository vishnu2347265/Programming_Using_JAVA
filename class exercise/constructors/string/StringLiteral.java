public class StringLiteral{// string is immutable
    public static void main(String[] args) {
        // Create a string literal
        String originalString = "Hello";

        originalString.concat("world");
        System.out.println("The original string is still 'Hello'");

        // Modify the string by concatenating
        originalString = originalString + " World"; // Creates a new string

        // Check if the reference has changed
        if (originalString == "Hello") {
            System.out.println("The original string is still 'Hello'");
        } else {
            System.out.println("The original string has changed");
        }

        // Check the value of the modified string
        System.out.println("Modified string: " + originalString);
    }
}

//write a java pgm to compare strings using 3 different method
//by using equals() method
