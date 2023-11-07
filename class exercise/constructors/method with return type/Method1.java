public class Method1{
    public static void main(String[] args){
        System.out.println("This is Method with two return type ");
        int result =add(10,9);
        System.out.println("Addition  :"+result);
        float divi=division(10,2,2);
        System.out.println("Division "+divi);

    }
    public static int add(int n1, int n2){
        int sum;
        sum=n1+n2;
        return sum;
    }
    public static float division(int n1,int n2,int n3){
        float div = (float)(n1/n2)/n3;
        return div;
    }

}


