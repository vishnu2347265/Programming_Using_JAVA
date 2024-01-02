package labworks.lab6;

public class PharmacyApp {
    public static void main(String[] args) {
        // Creating a generic medication with a specific type (e.g., String for a pill name)
        Medication<String> pillMedication = new Medication<>("Aspirin");

        // Creating a generic medication with another type (e.g., Integer for a liquid volume)
        Medication<Integer> liquidMedication = new Medication<>(150);

        // Dispensing medications
        Pharmacy.dispenseMedication(pillMedication);
        Pharmacy.dispenseMedication(liquidMedication);

        // Creating a Medication Storage for pills
        MedicationStorage<Medication<String>> pillStorage = new MedicationBox<>();
        pillStorage.addMedication(pillMedication);

        // Getting medication from the storage
        Medication<String> retrievedPill = pillStorage.getMedication();
        System.out.println("Retrieved Medication: " + retrievedPill);
    }
}
