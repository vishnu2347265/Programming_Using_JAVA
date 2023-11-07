package methodoverloading;

public class Overloading{
    public static void main(String[] args){
        System.out.println("sum is "+add(10,5));
        System.out.println("sum of three numbers is "+add(10,11,12));
        System.out.println("Concatination :"+add("Hello ","World ","Welcome"));

    }
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }
    // method Overloading -n here same method name add but different number of parameters
    public static int add(int a, int b, int c){
        return a+b;
    }
    public static String add(String str1,String str2, String str3 ){
        return str1+str2+str3;
    }
}

