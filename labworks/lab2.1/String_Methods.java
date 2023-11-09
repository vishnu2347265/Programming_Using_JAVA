import java.util.Arrays;

public class String_Methods{
     
    public static void main(String[] args) {
        String paragraph=" We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative The alternative mentioned here is the Tata Nano, which soon after came as the world’s cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano.";

        System.out.println("\nParagraph : "+paragraph);
        
    // String charAt()
        System.out.println("\nPrint the Character at index 11 : "+paragraph.charAt(11));

    // String compareTo()
        String str1 =" It became our goal to uplift their quality of life as well.";
        String str2 =" It became our goal to uplift their quality of life as well.";
        String str3 =" I remember seeing a family of 4 on a motorbike in the heavy Bombay rain.";

        System.out.println("\nComparing two strings : "+str1.compareTo(str2));
        System.out.println("\nComparing two strings : "+str1.compareTo(str3));

    // String concat()
        System.out.println("\nAfter Concatenation : "+str1.concat(str3));
        
    // String contains()
        System.out.println("\nCheck if it Contains -> quality of life : "+paragraph.contains("quality of life"));
        System.out.println("\nCheck if it Contains -> Give up on your Dreams : "+paragraph.contains(" Give up on your Dreams"));
        
    // String endsWith()
        System.out.println("\nCheck if the string ends with rain. : "+paragraph.endsWith(str3));
        System.out.println("\nCheck if the string ends with Nano. : "+paragraph.endsWith(" Nano."));
        
    // String equals()
        System.out.println("\nString 1 equal to String 2 : "+str1.equals(str2));
        System.out.println("\nString 1 equal to String 3 : "+str1.equals(str3));

    // equalsIgnoreCase()
        String str4=str3.toUpperCase();
        System.out.println("\nCompares two strings, ignoring case differences : "+str3.equalsIgnoreCase(str4));
        
    // String format()
        System.out.println(String.format("\nFormatted string : %s %s ",str1, str2));

    // String getBytes()
        //System.out.println("getBytes() : "+ new String(paragraph.getBytes()));

        //Encodes this String into a sequence of bytes using the named charset,
        // storing the result into a new byte array
        byte[] textBytes = paragraph.getBytes();
        System.out.println("\ngetBytes(): " + new String(textBytes));


    // String getChars()
    char[] charArray = new char[25];
    paragraph.getChars(3,28, charArray, 0);
    System.out.println("\ngetChars(): " + new String(charArray));

    // String indexOf()
        System.out.println("\nindexOf (remember) : "+paragraph.indexOf("remember"));

    // String intern()
        System.out.println("\nintern(): " +paragraph.intern());


    // String isEmpty()
        System.out.println("\nisEmpty() : "+paragraph.isEmpty());

    // String join()
        System.out.println("\njoin two strings : "+String.join("_",str1,str4));

    // String lastIndexOf()
        System.out.println("\nLast occurance of the word THE : "+paragraph.lastIndexOf("the"));

    // String length()
        System.out.println("\nLength of the Main paragraph : "+ paragraph.length());

    // String replace()
        System.out.println("\nReplace l to L : "+ str1.replace("l", "L"));

    // String replaceAll()
        System.out.println("\nReplace all : "+ paragraph.replaceAll(str3, str4));

    // String split()
        String[] splStrings = str1.split(" ");
        System.out.println("\nSplit the paragraph : "+ Arrays.toString(splStrings));

    // String startsWith()
        System.out.println("\nStarts with a : " + str1.startsWith("a"));
        System.out.println("\nStarts with I : " + str1.startsWith("I"));

    // String substring()
        System.out.println("\nSubstring of paragraph 7 to 36 : "+ paragraph.substring(7,36));

    // String toCharArray()
        char[] charArrayText = str2.toCharArray();
        System.out.println("\nConverts the string to a new character array :" + new String(charArrayText));

    // String toLowerCase()
        System.out.println("\nLower case of str3 : "+ str3.toLowerCase());

    // String toUpperCase()
        System.out.println("\nTo Upper case of str3 : "+ str3.toUpperCase());

    // String trim()
        System.out.println("\nRemove whitespace from both sides of a string :"+ str3.trim());
    // String valueOf()
           String valueOfString = String.valueOf(paragraph.length());
           System.out.println("\nvalueOfString : " + valueOfString);


    }
}