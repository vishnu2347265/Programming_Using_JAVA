import java.util.Scanner;
interface MyInterface<T>{
T performOperation(T value);
}
class GenericInterfaceExample {
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter an integer:");
int intValue=scanner.nextInt();
System.out.println("Enter a double:");
double doubleValue=scanner.nextDouble();
System.out.println("Enetr a string:");
MyInterface<Object> myInterface = new myInterface<Object>() {
public Object performOperation(Object value) {
if (value instanceof Integer) {
return (int)value * 2;
}
else if (value instanceof Double)
{
return (double)value / 2;
}
else if(value instanceof String)
{
return ((String)value).toUpperCase();
}
else{
return null;
}
}