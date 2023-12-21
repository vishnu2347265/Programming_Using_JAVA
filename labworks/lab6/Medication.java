package labworks.lab6;

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
