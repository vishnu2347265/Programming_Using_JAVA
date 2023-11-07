//Program to show the use of default constructor
import java.io.*;
import java.util.*;

//Creating a class 'Product'
public class Product {
    String id;
    String product_name;
    double price;
    
    //No creation of any constructor by the user
    
	public static void main (String[] args) {
	    //Creating an object by calling
	    //default constructor
	    Product product = new Product();
	    
	    //Trying to access the variables and print their default values
	    System.out.println(product.id);
	    System.out.println(product.product_name);
	    System.out.println(product.price);
    }
}
