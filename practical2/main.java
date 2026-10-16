class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    int speed = 120;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Car c = new Car();

        c.start();    // Inherited method
        c.display();  // Car's own method
    }
}

