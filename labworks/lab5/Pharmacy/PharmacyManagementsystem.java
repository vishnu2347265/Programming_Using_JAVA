package labworks.lab5.Pharmacy;

import java.util.ArrayList;
import java.util.List;

class PharmacyOrder {
    private String medication;
    private int quantity;

    public PharmacyOrder(String medication, int quantity) {
        this.medication = medication;
        this.quantity = quantity;
    }

    public String getMedication() {
        return medication;
    }

    public int getQuantity() {
        return quantity;
    }
}

class PharmacyInventory {
    private List<String> availableMedications = new ArrayList<>();

    public void addMedication(String medication) {
        availableMedications.add(medication);
        System.out.println("Added " + medication + " to inventory.");
    }

    public boolean checkAvailability(String medication, int quantity) {
        // Simulate checking inventory availability
        return availableMedications.contains(medication) && quantity <= 10;
    }
}

class OrderProcessor extends Thread {
    private PharmacyInventory inventory;
    private PharmacyOrder order;

    public OrderProcessor(PharmacyInventory inventory, PharmacyOrder order) {
        this.inventory = inventory;
        this.order = order;
    }

    @Override
    public void run() {
        System.out.println("Processing order for " + order.getQuantity() + " " + order.getMedication() + "(s).");
        if (inventory.checkAvailability(order.getMedication(), order.getQuantity())) {
            System.out.println("Order processed successfully.");
        } else {
            System.out.println("Insufficient stock for " + order.getMedication() + ". Order canceled.");
        }
    }
}

public class PharmacyManagementsystem {
    public static void main(String[] args) {
        PharmacyInventory inventory = new PharmacyInventory();
        inventory.addMedication("Aspirin");
        inventory.addMedication("Antibiotic");

        // Creating multiple orders to be processed concurrently
        PharmacyOrder order1 = new PharmacyOrder("Aspirin", 5);
        PharmacyOrder order2 = new PharmacyOrder("Antibiotic", 8);

        // Creating multiple threads to process orders concurrently
        OrderProcessor processor1 = new OrderProcessor(inventory, order1);
        OrderProcessor processor2 = new OrderProcessor(inventory, order2);

        // Start the threads
        processor1.start();
        processor2.start();
    }
}
