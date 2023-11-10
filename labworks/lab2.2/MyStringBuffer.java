public class MyStringBuffer{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("There is only one thing we say to death:");

        //1. append()
           System.out.println("\n Append -> Not today. : "+sb.append(" Not today.")); 

        // 2. insert()
            System.out.println("\n Insert -> Game of Thrones - : "+sb.insert(0, "Game of Thrones - "));

        // 3. replace()
            System.out.println("\n Replace -> ame of Thrones to ot: "+(sb.replace(1, 15, "ot")));

        // 4. delete()
            System.out.println("\n Delete index 0 to 5 : "+sb.delete(0, 6));

        // 5. charAt()
            System.out.println("\n CharAt() : "+sb.charAt(0));

        // 6.setCharAt()
            sb.setCharAt(1, 'H');
            System.out.println("\n setCharAt(1, 'H'): " + sb);

        // 7.length()
            System.out.println("\n Length : "+sb.length());

        // 8.capacity()
        //The capacity() method returns the current capacity of the StringBuffer. The initial capacity is typically 16, but it can increase dynamically as needed.
        // This value represents the amount of memory allocated to the StringBuffer. It's not the same as the length of the string it contains.
          
            System.out.println("\n Capacity of the stringbuffer : "+sb.capacity());

        // 9.ensureCapacity()
        //Ensures capacity is at least equal to the given minimum.
        //the output of 230 indicates that the StringBuffer has ensured a capacity of at least 120 characters, 
        //and it allocated additional space to improve performance.

            sb.ensureCapacity(120);
            int capacity = sb.capacity();
            System.out.println("\n Capacity after ensuring: " +capacity);

        // 10.toString()
            System.out.println("\n toString : "+ sb.toString());

        // 11.substring(int start)
            System.out.println("\n Substring starting from index 9 till end : " +sb.substring(9));

        // 12. substring(int start, int end)
            System.out.println("\n Substring from 24 to 39 : " + sb.substring(24, 39));
    }
}
