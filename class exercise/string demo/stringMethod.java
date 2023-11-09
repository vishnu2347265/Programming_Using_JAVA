public class stringMethod {
    public static void main(String[] args) {
        String txt="Hello World!!!";
        String txt1="";

        int len = txt.length();
        int len1 = txt1.length();

        System.out.println(len);
        System.out.println(len1);

        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.startsWith("H"));
        System.out.println(txt.endsWith("H"));
        System.out.println(txt1.isEmpty());
        System.out.println(txt.isEmpty());
        System.out.println(txt.indexOf("o"));
    }
}
