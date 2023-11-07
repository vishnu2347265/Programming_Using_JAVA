
public class Vehicle{
    public static void main(String[] args){
	car obj = new car();
	car.obj();

	
        System.out.println("Methodriding");
    }
    
}

public class car extends Vehicle{
public static void run()
{
	System.out.println("CAR");
}
}


public class bike extends Vehicle{
public static void run()
{
	System.out.println("CAR");
}
}
 