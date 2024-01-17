package labworks.lab8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Medication {
    private String name;
    private int quantity;
    private double price;

    public Medication(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}

class Pharmacy {
    private List<Medication> medicationList;

    public Pharmacy() {
        this.medicationList = new ArrayList<>();
    }

    public void addMedication(Medication medication) {
        medicationList.add(medication);
        System.out.println("Medication added successfully: " + medication.getName());
    }

    public void displayMedications() {
        System.out.println("Medications in the pharmacy:");
        medicationList.stream()
                .map(Medication::toString) 
                .collect(Collectors.toList())
                .forEach(System.out::println);  
    }
}

public class PharmacyManagementSystem {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();

        Medication med1 = new Medication("Paracetamol", 100, 5.99);
        Medication med2 = new Medication("Aspirin", 50, 3.49);

        pharmacy.addMedication(med1);
        pharmacy.addMedication(med2);

        // Displaying 
        pharmacy.displayMedications();
    }
}
