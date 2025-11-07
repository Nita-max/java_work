class Car {
    int model;
    String brand;
    String color;
    int price;
    double fuelCapacity;

    Car() {
        System.out.println("Constructor called");
        this.model = 1001;
        this.brand = "Default Brand";
        this.color = "White";
        this.price = 500000;
        this.fuelCapacity = 40.0;
    }

    void setModel(int m) {
        this.model = m;
    }

    void setBrand(String b) {
        this.brand = b;
    }

    void setColor(String c) {
        this.color = c;
    }

    void setPrice(int p) {
        this.price = p;
    }

    void setFuelCapacity(double f) {
        this.fuelCapacity = f;
    }

    int getModel() {
        return this.model;
    }

    String getBrand() {
        return this.brand;
    }

    String getColor() {
        return this.color;
    }

    int getPrice() {
        return this.price;
    }

    double getFuelCapacity() {
        return this.fuelCapacity;
    }

    void display() {
        System.out.println(" Car Model        : " + this.model);
        System.out.println(" Car Brand        : " + this.brand);
        System.out.println(" Car Color        : " + this.color);
        System.out.println(" Car Price        : " + this.price);
        System.out.println(" Fuel Capacity    : " + this.fuelCapacity + " liters");
    }
}
//class Car ends here

class TestCar {
    public static void main(String[] args) {
        Car c1, c2;
        c1 = new Car();
        c2 = new Car();

        c1.setModel(248295);
        c1.setBrand("Honda City");
        c1.setColor("Red");
        c1.setPrice(800000);
        c1.setFuelCapacity(50.0);

        c2.setModel(248296);
        c2.setBrand("Hyundai Verna");
        c2.setColor("Blue");
        c2.setPrice(900000);
        c2.setFuelCapacity(55.0);

        System.out.println("\n--- Car Details ---");
        c1.display();
        System.out.println();
        c2.display();
    }
}
//Class TestCar ends here
