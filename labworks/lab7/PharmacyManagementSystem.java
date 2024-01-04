import java.util.ArrayList;
import java.util.List;

public class PharmacyManagementSystem {

    public static void main(String[] args) {
        // Sample list of medicines
        List<Medicine> medicines = new ArrayList<>();
        medicines.add(new Medicine("Paracetamol", 5.99));
        medicines.add(new Medicine("Aspirin", 3.49));
        medicines.add(new Medicine("Cough Syrup", 8.99));
        medicines.add(new Medicine("Antibiotic", 12.99));

        // Using lambda expression to filter medicines based on price
        List<Medicine> expensiveMedicines = filterMedicines(medicines, medicine -> medicine.getPrice() > 10.0);

        // Print the result
        System.out.println("Expensive Medicines: " + expensiveMedicines);
    }

    // Medicine class
    static class Medicine {
        private String name;
        private double price;

        public Medicine(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Medicine{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    // Method to filter medicines based on a given condition
    private static List<Medicine> filterMedicines(List<Medicine> medicines, MedicineFilter filter) {
        List<Medicine> filteredMedicines = new ArrayList<>();
        for (Medicine medicine : medicines) {
            if (filter.test(medicine)) {
                filteredMedicines.add(medicine);
            }
        }
        return filteredMedicines;
    }

    // Functional interface for filtering medicines
    @FunctionalInterface
    interface MedicineFilter {
        boolean test(Medicine medicine);
    }
}
