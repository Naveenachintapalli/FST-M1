package Activities;

public class Car {

    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    // Constructor initializes tyres and doors to 4
    public Car() {
        this.tyres = 4;
        this.doors = 4;
    }

    // Method to display all characteristics
    public void displayCharacteristics() {
        System.out.println("Car Color: " + color);
        System.out.println("Car Transmission: " + transmission);
        System.out.println("Car Make: " + make);
        System.out.println("Number of Tyres: " + tyres);
        System.out.println("Number of Doors: " + doors);
    }

    // Accelerate method
    public void accelarate() {
        System.out.println("Car is moving forward.");
    }

    // Brake method
    public void brake() {
        System.out.println("Car has stopped.");
    }
}