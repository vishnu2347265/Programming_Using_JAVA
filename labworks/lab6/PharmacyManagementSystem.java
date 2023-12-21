// Generic Medication class
public class Medication<T> {
    private T genericMedication;

    public Medication(T genericMedication) {
        this.genericMedication = genericMedication;
    }

    public T getGenericMedication() {
        return genericMedication;
    }

    public void setGenericMedication(T genericMedication) {
        this.genericMedication = genericMedication;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "genericMedication=" + genericMedication +
                '}';
    }
}

// Interface for medication management
public interface MedicationManager<T> {
    void addMedication(Medication<T> medication);
    Medication<T> getMedication(String medicationId);
    List<Medication<T>> getAllMedications();
    void removeMedication(String medicationId);
}

// Generic implementation of MedicationManager interface
public class GenericMedicationManager<T> implements MedicationManager<T> {
    private Map<String, Medication<T>> medicationMap;

    public GenericMedicationManager() {
        this.medicationMap = new HashMap<>();
    }

    @Override
    public void addMedication(Medication<T> medication) {
        medicationMap.put(UUID.randomUUID().toString(), medication);
    }

    @Override
    public Medication<T> getMedication(String medicationId) {
        return medicationMap.get(medicationId);
    }

    @Override
    public List<Medication<T>> getAllMedications() {
        return new ArrayList<>(medicationMap.values());
    }

    @Override
    public void removeMedication(String medicationId) {
        medicationMap.remove(medicationId);
    }
}

// Example usage
public class PharmacyManagementSystem {
    public static void main(String[] args) {
        Medication<String> painkiller = new Medication<>("Ibuprofen");
        Medication<Integer> vitamin = new Medication<>(1000);

        GenericMedicationManager<String> stringMedicationManager = new GenericMedicationManager<>();
        GenericMedicationManager<Integer> integerMedicationManager = new GenericMedicationManager<>();

        stringMedicationManager.addMedication(painkiller);
        integerMedicationManager.addMedication(vitamin);

        System.out.println("String Medication Manager: " + stringMedicationManager.getAllMedications());
        System.out.println("Integer Medication Manager: " + integerMedicationManager.getAllMedications());
    }
}
