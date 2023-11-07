//Program to show the use of default constructor
import java.io.*;
import java.util.*;

//Creating a class 'Product'but i have changed it to defaultConstructor to 
public class defaultConstructorProductClass {
    String id;
    String product_name;
    double price;
    
    //No creation of any constructor by the user
    
	public static void main (String[] args) {
	    //Creating an object by calling
	    //default constructor
	    defaultConstructorProductClass product = new defaultConstructorProductClass();
	    
	    //Trying to access the variables and print their default values
	    System.out.println(product.id);
	    System.out.println(product.product_name);
	    System.out.println(product.price);
    }
}
