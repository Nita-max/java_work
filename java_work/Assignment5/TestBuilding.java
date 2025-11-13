class Building {
    String type;
    int floors;
    String location;

    // default constructor
    Building() {
        System.out.println("Default Building constructor called");
        this.type = "Commercial";
        this.floors = 5;
        this.location = "City Center";
    }

    // parameterized constructor
    Building(String t, int f, String l) {
        System.out.println("Parameterized Building constructor called");
        this.type = t;
        this.floors = f;
        this.location = l;
    }

    // setter methods
    void setType(String t) { this.type = t; }
    void setFloors(int f) { this.floors = f; }
    void setLocation(String l) { this.location = l; }

    // getter methods
    String getType() { return this.type; }
    int getFloors() { return this.floors; }
    String getLocation() { return this.location; }

    void display() {
        System.out.println("Building Type: " + this.type);
        System.out.println("Floors: " + this.floors);
        System.out.println("Location: " + this.location);
    }
}

//-----------------------------class House---------------------------

class House extends Building {
    int rooms;
    String color;
    boolean hasGarden;

    // default constructor
    House() {
        super();
        System.out.println("Default House constructor called");
        this.rooms = 4;
        this.color = "White";
        this.hasGarden = true;
    }

    // parameterized constructor
    House(String t, int f, String l, int r, String c, boolean g) {
        super(t, f, l);
        System.out.println("Parameterized House constructor called");
        this.rooms = r;
        this.color = c;
        this.hasGarden = g;
    }

    void display() {
        super.display();
        System.out.println("Rooms: " + this.rooms);
        System.out.println("Color: " + this.color);
        System.out.println("Has Garden: " + this.hasGarden);
    }
}

//-----------------------------class Office---------------------------

class Office extends Building {
    int employees;
    String department;
    boolean parkingAvailable;

    // default constructor
    Office() {
        super();
        System.out.println("Default Office constructor called");
        this.employees = 50;
        this.department = "IT";
        this.parkingAvailable = true;
    }

    // parameterized constructor
    Office(String t, int f, String l, int e, String d, boolean p) {
        super(t, f, l);
        System.out.println("Parameterized Office constructor called");
        this.employees = e;
        this.department = d;
        this.parkingAvailable = p;
    }

    void display() {
        super.display();
        System.out.println("Employees: " + this.employees);
        System.out.println("Department: " + this.department);
        System.out.println("Parking Available: " + this.parkingAvailable);
    }
}

//-----------------------------class Apartment---------------------------

class Apartment extends Building {
    int flats;
    boolean liftAvailable;
    double maintenanceCharge;

    // default constructor
    Apartment() {
        super();
        System.out.println("Default Apartment constructor called");
        this.flats = 20;
        this.liftAvailable = true;
        this.maintenanceCharge = 1500.50;
    }

    // parameterized constructor
    Apartment(String t, int f, String l, int fl, boolean li, double m) {
        super(t, f, l);
        System.out.println("Parameterized Apartment constructor called");
        this.flats = fl;
        this.liftAvailable = li;
        this.maintenanceCharge = m;
    }

    void display() {
        super.display();
        System.out.println("Flats: " + this.flats);
        System.out.println("Lift Available: " + this.liftAvailable);
        System.out.println("Maintenance Charge: " + this.maintenanceCharge);
    }
}

//----------------------TestBuilding---------------------------

class TestBuilding {
    public static void main(String[] args)
   {
        Building b = new Building();
        b.setType("Commercial");
        b.setFloors(10);
        b.setLocation("Pune");
        b.display();

        System.out.println("\n=================== House details ===================");
        House h = new House("Residential", 2, "Nashik", 5, "Yellow", true);
        h.display();

        System.out.println("\n=================== Office details ===================");
        Office o = new Office("Corporate", 6, "Mumbai", 120, "HR", true);
        o.display();

        System.out.println("\n=================== Apartment details ===================");
        Apartment a = new Apartment("Residential", 12, "Nagpur", 48, true, 2500.75);
        a.display();
    }
}
