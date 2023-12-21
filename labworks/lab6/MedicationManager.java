package labworks.lab6;

public interface MedicationManager<T> {
    void addMedication(Medication<T> medication);
    Medication<T> getMedication(String medicationId);
    List<Medication<T>> getAllMedications();
    void removeMedication(String medicationId);
}
