package labworks.lab4;
import labworks.lab4.pharmacyPackage.Pharmacy;
public class Main {
    public static void main(String[] args) {
        
        Pharmacy pharmacy = new Pharmacy();
        System.out.println("Default Constructor");
        pharmacy.display();
        Pharmacy medication1 = new Pharmacy("D308", "Paracetomol", 20.0);
        System.out.println("\nConstructor Overloading 1");
        medication1.display();
        Pharmacy medication2 = new Pharmacy("D327", "Aspirin", 100, 48.5);
        System.out.println("\nConstructor Overloading 2");
        medication2.display();
    }
}
