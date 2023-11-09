public class String_Methods{
String str;
    public String_Methods(){
        this.str =" We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative The alternative mentioned here is the Tata Nano, which soon after came as the world’s cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano.";

    }
     
    public static void main(String[] args) {
        String_Methods text = new String_Methods();
        String paragraph=text.str;
        System.out.println(paragraph);
        
        
    // String charAt()
        System.out.println("Print the Character at index 11 :"+paragraph.charAt(11));

    // String compareTo()
        String str1 =" It became our goal to uplift their quality of life as well.";
        String str2 =" It became our goal to uplift their quality of life as well.";
        String str3 =" I remember seeing a family of 4 on a motorbike in the heavy Bombay rain.";

        System.out.println("Comparing two strings : "+str1.compareTo(str2));
        System.out.println("Comparing two strings : "+str1.compareTo(str3));

    // String concat()
        System.out.println("After Concatenation : "+str1.concat(str3));
        
    // String contains()
        System.out.println("Check if it Contains -> quality of life :"+paragraph.contains("quality of life"));
        System.out.println("Check if it Contains -> Give up on your Dreams :"+paragraph.contains(" Give up on your Dreams"));
        
    // String endsWith()
        System.out.println("Check if the string ends with rain. :"+paragraph.endsWith(str3));
        System.out.println("Check if the string ends with Nano. :"+paragraph.endsWith(" Nano."));
        
    // String equals()
        System.out.println("String 1 equal to String 2 : "+str1.equals(str2));
        System.out.println("String 1 equal to String 3 : "+str1.equals(str3));

    // equalsIgnoreCase()
        String str4=str3.toUpperCase();
        System.out.println("Compares two strings, ignoring case differences : "+str3.equalsIgnoreCase(str4));
        
    // String format()
        System.out.println(String.format("Formatted string : %s %s ",str1, str2));

    // String getBytes()
        System.out.println();

    // String getChars()
    // String indexOf()
    // String intern()
    // String isEmpty()





    // String join()
    // String lastIndexOf()
    // String length()
    // String replace()
    // String replaceAll()
    // String split()
    // String startsWith()
    // String substring()
    // String toCharArray()
    // String toLowerCase()
    // String toUpperCase()
    // String trim()
    // String valueOf()
    }
}