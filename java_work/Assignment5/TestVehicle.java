class Vehicle {
    int speed;
    String brand;
    String model;
    double price;

    // default constructor
    Vehicle() {
        System.out.println("Default constructor called");
        this.speed = 120;
        this.brand = "Unknown";
        this.model = "Generic";
        this.price = 200000;
    }

    // parameterized constructor
    Vehicle(int s, String b, String m, double p) {
        System.out.println("Parameterized constructor called");
        this.speed = s;
        this.brand = b;
        this.model = m;
        this.price = p;
    }

    // setter methods
    void setSpeed(int s) { this.speed = s; }
    void setBrand(String b) { this.brand = b; }
    void setModel(String m) { this.model = m; }
    void setPrice(double p) { this.price = p; }

    // getter methods
    int getSpeed() { return this.speed; }
    String getBrand() { return this.brand; }
    String getModel() { return this.model; }
    double getPrice() { return this.price; }

    void display() {
        System.out.println("Vehicle Speed: " + this.speed);
        System.out.println("Vehicle Brand: " + this.brand);
        System.out.println("Vehicle Model: " + this.model);
        System.out.println("Vehicle Price: " + this.price);
    }
}

//-----------------------------class Car---------------------------

class Car extends Vehicle {
    int seat;
    int door;
    String color;

    // default constructor
    Car() {
        super();
        System.out.println("Default Car constructor called");
        this.seat = 4;
        this.door = 4;
        this.color = "White";
    }

    // parameterized constructor
    Car(int s, String b, String m, double p, int se, int d, String c) {
        super(s, b, m, p);
        System.out.println("Parameterized Car constructor called");
        this.seat = se;
        this.door = d;
        this.color = c;
    }

    // display method
    void display() {
        super.display();
        System.out.println("Car Seat: " + this.seat);
        System.out.println("Car Door: " + this.door);
        System.out.println("Car Color: " + this.color);
    }
}

//------------------------Truck--------------------------

class Truck extends Vehicle {
    int wheels;
    double loadCapacity;
    String transportType;

    // default constructor
    Truck() {
        super();
        this.wheels = 8;
        this.loadCapacity = 10.5;
        this.transportType = "Goods";
    }

    // parameterized constructor
    Truck(int s, String b, String m, double p, int w, double l, String t) {
        super(s, b, m, p);
        this.wheels = w;
        this.loadCapacity = l;
        this.transportType = t;
    }

    // display method
    void display() {
        super.display();
        System.out.println("Truck Wheels: " + this.wheels);
        System.out.println("Truck Load Capacity: " + this.loadCapacity + " tons");
        System.out.println("Truck Transport Type: " + this.transportType);
    }
}

//-------------------ElectricCar---------------------------

class ElectricCar extends Vehicle {
    int batteryCapacity;
    double chargingTime;

    // default constructor
    ElectricCar() {
        super();
        this.batteryCapacity = 40;
        this.chargingTime = 5.0;
    }

    // parameterized constructor
    ElectricCar(int s, String b, String m, double p, int bc, double ct) {
        super(s, b, m, p);
        this.batteryCapacity = bc;
        this.chargingTime = ct;
    }

    // display method
    void display() {
        super.display();
        System.out.println("Battery Capacity: " + this.batteryCapacity + " kWh");
        System.out.println("Charging Time: " + this.chargingTime + " hours");
    }
}

//----------------------TestVehicle---------------------------

 class TestVehicle {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setSpeed(150);
        v.setBrand("BMW");
        v.setModel("X7");
        v.setPrice(30000000);
        v.display();

        System.out.println("\n=================== Car details ===================");
        Car ca = new Car(180, "Audi", "A6", 6500000, 5, 4, "Black");
        ca.display();

        System.out.println("\n=================== Truck details ===================");
        Truck ta = new Truck(90, "Tata", "Ultra", 1200000, 10, 20.0, "Cargo");
        ta.display();

        System.out.println("\n=================== ElectricCar details ===================");
        ElectricCar ec = new ElectricCar(160, "Tesla", "Model 3", 5500000, 75, 1.5);
        ec.display();
    }
}