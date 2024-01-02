package labworks.lab6;

// Generic interface for Medication Storage
interface MedicationStorage<T> {
    void addMedication(T medication);

    T getMedication();
}