public class remember {
        public static void main(String[] args) {
            // Define a sample string
            String sampleString = "Hello, World!";
    
            // Length of the string
            int length = sampleString.length();
            System.out.println("Length of the string: " + length);
    
            // Convert the string to uppercase
            String upperCaseString = sampleString.toUpperCase();
            System.out.println("Uppercase: " + upperCaseString);
    
            // Convert the string to lowercase
            String lowerCaseString = sampleString.toLowerCase();
            System.out.println("Lowercase: " + lowerCaseString);
    
            // Check if the string contains a substring
            boolean containsSubstring = sampleString.contains("World");
            System.out.println("Contains 'World': " + containsSubstring);
    
            // Get a substring
            String substring = sampleString.substring(7, 12); // Extract "World"
            System.out.println("Substring: " + substring);
    
            // Replace a substring
            String replacedString = sampleString.replace("World", "Java");
            System.out.println("After Replacement: " + replacedString);
    
            // Split the string into an array
            String[] words = sampleString.split(" ");
            System.out.print("Split into words: ");
            for (String word : words) {
                System.out.print(word + " ");
            }
            System.out.println();
    
            // Remove leading and trailing white spaces
            String trimmedString = "   Trim Me   ".trim();
            System.out.println("Trimmed String: '" + trimmedString + "'");
    
            // Check if the string starts with a prefix
            boolean startsWithHello = sampleString.startsWith("Hello");
            System.out.println("Starts with 'Hello': " + startsWithHello);
    
            // Check if the string ends with a suffix
            boolean endsWithExclamation = sampleString.endsWith("!");
            System.out.println("Ends with '!': " + endsWithExclamation);
        }
    }
    
