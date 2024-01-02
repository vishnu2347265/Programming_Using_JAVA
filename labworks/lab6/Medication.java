package labworks.lab6;

// Generic Medication class
class Medication<T> {
    private T genericMedication;

    // Constructor
    public Medication(T genericMedication) {
        this.genericMedication = genericMedication;
    }

    // Getter and Setter
    public T getGenericMedication() {
        return genericMedication;
    }

    public void setGenericMedication(T genericMedication) {
        this.genericMedication = genericMedication;
    }

    // toString method
    @Override
    public String toString() {
        return "Medication: " + genericMedication;
    }
}
