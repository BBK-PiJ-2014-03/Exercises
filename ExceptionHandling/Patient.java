public class Patient {

    private String name;
    private int age;

    public Patient (String name, int age) {
       
        if (age > 130 || age < 0) {
            throw new IllegalArgumentException("Error: Patient age not in range.");
        }
        
        this.name = name;
        this.age = age;
    }
    
    public String toString () {
        return " " + name + " " + age;
    }
}
