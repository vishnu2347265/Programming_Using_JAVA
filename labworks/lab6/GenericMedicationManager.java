package labworks.lab6;
import java.util.List;

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
