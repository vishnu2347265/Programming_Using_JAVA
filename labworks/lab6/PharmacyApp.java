package labworks.lab6;

public class PharmacyApp {
    public static void main(String[] args) {
        Medication<String> pillMedication = new Medication<>("Aspirin");

        Medication<Integer> liquidMedication = new Medication<>(150);

        Pharmacy.dispenseMedication(pillMedication);
        Pharmacy.dispenseMedication(liquidMedication);

        MedicationStorage<Medication<String>> pillStorage = new MedicationBox<>();
        pillStorage.addMedication(pillMedication);

        Medication<String> retrievedPill = pillStorage.getMedication();
        System.out.println("Retrieved Medication: " + retrievedPill);
    }
}