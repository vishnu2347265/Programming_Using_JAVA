public class Pharmacy{
    String id;
    String product_name;
    private int quantity;
    private double price;



    //default constructor
    public Pharmacy(){
        this.id="Unknown";
        this.product_name=null;
        this.quantity=0;
        this.price=0.0;
    }
    //parameterized constructor
    public Pharmacy(String id,String product_name,double price){
        this.id=id;
        this.product_name=product_name;
        this.price=price;
    }
    //parameterized constructor 2
    public Pharmacy(String id,String product_name,int quantity,double price){
        this.id=id;
        this.product_name=product_name;
        this.quantity=quantity;
        this.price=price;
    }

    public void display() {
        System.out.println("Medication ID : "+id);
        System.out.println("Medicine Name : "+product_name);
        System.out.println("Quantity : "+quantity);
        System.out.println("Price : "+price);
        calculateTotalPrice("Aspirin");
        System.out.println("Price of 10 Items : $" + calculateTotalPrice(10));
        System.out.println("Total Price: $" + calculateTotalPrice());


    }
    //method overloading 
    public void calculateTotalPrice(String product_name){
        System.out.println("Total price of medicine is shown below :");
    }
    public double calculateTotalPrice(){
        return price * quantity;
    }
    public double calculateTotalPrice(int quantity){
        return price * quantity;
    }


    public static void main(String[] args) {
        //creating an object called pharmacy to access the default values of variables created
        Pharmacy pharmacy = new Pharmacy();
        System.out.println("Default Constructor");
        pharmacy.display();
        Pharmacy medication1 = new Pharmacy("D308","Paracetomol",20.0);
        System.out.println("\nConstructor Overloading 1");
        medication1.display();
        Pharmacy medication2 = new Pharmacy("D327","Aspirin",100,48.5);
        System.out.println("\nConstructor Overloading 2");
        medication2.display();
    }
}