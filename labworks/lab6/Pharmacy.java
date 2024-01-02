package labworks.lab6;

// Generic method for dispensing medication
class Pharmacy {
    public static <T> void dispenseMedication(Medication<T> medication) {
        System.out.println("Dispensing: " + medication);
    }
}