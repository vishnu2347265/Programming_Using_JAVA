// Abstract class representing a Medication
abstract class Medication {
    private String name;
    private double price;

    public Medication(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Named subclass for the abstract method
    public static class MedicationImpl extends Medication {
        public MedicationImpl(String name, double price) {
            super(name, price);
        }

        @Override
        public double calculateTotalCost(int quantity) {
            // Default implementation for the abstract method
            return getPrice() * quantity;
        }
    }

    // Factory method to create instances of the named subclass
    public static Medication createMedication(String name, double price) {
        return new MedicationImpl(name, price);
    }

    // Abstract method for calculating the total cost of medication
    public abstract double calculateTotalCost(int quantity);
}

// Concrete class representing a specific type of medication - Tablet
class Tablet extends Medication {
    private int dose;

    public Tablet(String name, double price, int dose) {
        super(name, price);
        this.dose = dose;
    }

    public int getDose() {
        return dose;
    }

    // Override the abstract method to calculate the total cost for tablets
    @Override
    public double calculateTotalCost(int quantity) {
        return getPrice() * quantity * dose;
    }
}

// Concrete class representing a specific type of medication - Syrup
class Syrup extends Medication {
    private int volume;

    public Syrup(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    // Override the abstract method to calculate the total cost for syrups
    @Override
    public double calculateTotalCost(int quantity) {
        return getPrice() * quantity * volume;
    }
}

// Final class representing a Prescription, which cannot be further subclassed
final class Prescription {
    private String patientName;
    private Medication medication;
    private int quantity;

    public Prescription(String patientName, Medication medication, int quantity) {
        this.patientName = patientName;
        this.medication = medication;
        this.quantity = quantity;
    }

    public String getPatientName() {
        return patientName;
    }

    public Medication getMedication() {
        return medication;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to calculate the total cost of the prescription
    public double calculateTotalCost() {
        return medication.calculateTotalCost(quantity);
    }
}
// Example of using the Pharmacy Management System
public class PharmacyApp {
    public static void main(String[] args) {
        Medication aspirinMedication = Medication.createMedication("Aspirin", 5.0);
        Medication coughSyrupMedication = Medication.createMedication("Cough Syrup", 10.0);

        Tablet aspirinTablet = new Tablet("Aspirin", 5.0, 1);
        Syrup coughSyrup = new Syrup("Cough Syrup", 10.0, 200);

        Prescription prescription1 = new Prescription("John Doe", aspirinTablet, 3);
        Prescription prescription2 = new Prescription("Jane Doe", coughSyrup, 2);

        System.out.println("Prescription 1 for " + prescription1.getPatientName() + ":");
        System.out.println("Medication: " + prescription1.getMedication().getName());
        System.out.println("Quantity: " + prescription1.getQuantity());
        System.out.println("Total Cost: $" + prescription1.calculateTotalCost());
        System.out.println();

        System.out.println("Prescription 2 for " + prescription2.getPatientName() + ":");
        System.out.println("Medication: " + prescription2.getMedication().getName());
        System.out.println("Quantity: " + prescription2.getQuantity());
        System.out.println("Total Cost: $" + prescription2.calculateTotalCost());
    }
}
