public class CompareStrings {
    public static void main(String[] args) {
        String s1="Vishnu";
        String s2="Vishnu";
        String str = new String("Vishnu");
        if (s1.equals(s2)) {
            System.out.println("true");
        }
        if(s1.equals(str)){
            System.out.println("True");
        }
    }
    
}
