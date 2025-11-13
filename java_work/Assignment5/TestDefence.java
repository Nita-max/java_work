class Defence {
    String country;
    int soldiers;
    double budget;

    // default constructor
    Defence() {
        System.out.println("Default Defence constructor called");
        this.country = "Unknown";
        this.soldiers = 10000;
        this.budget = 5000000.0;
    }

    // parameterized constructor
    Defence(String c, int s, double b) {
        System.out.println("Parameterized Defence constructor called");
        this.country = c;
        this.soldiers = s;
        this.budget = b;
    }

    void setCountry(String c) { this.country = c; }
    void setSoldiers(int s) { this.soldiers = s; }
    void setBudget(double b) { this.budget = b; }

    String getCountry() { return this.country; }
    int getSoldiers() { return this.soldiers; }
    double getBudget() { return this.budget; }

    void display() {
        System.out.println("Country: " + this.country);
        System.out.println("Soldiers: " + this.soldiers);
        System.out.println("Budget: ₹" + this.budget);
    }
}

//-----------------------------class Army---------------------------

class Army extends Defence {
    String division;
    String commander;
    int tanks;

    // default constructor
    Army() {
        super();
        System.out.println("Default Army constructor called");
        this.division = "Infantry";
        this.commander = "General Singh";
        this.tanks = 300;
    }

    // parameterized constructor
    Army(String c, int s, double b, String d, String com, int t) {
        super(c, s, b);
        System.out.println("Parameterized Army constructor called");
        this.division = d;
        this.commander = com;
        this.tanks = t;
    }

    void display() {
        super.display();
        System.out.println("Division: " + this.division);
        System.out.println("Commander: " + this.commander);
        System.out.println("Number of Tanks: " + this.tanks);
    }
}

//-----------------------------class Navy---------------------------

class Navy extends Defence {
    int ships;
    String baseLocation;
    String admiral;

    // default constructor
    Navy() {
        super();
        System.out.println("Default Navy constructor called");
        this.ships = 50;
        this.baseLocation = "Mumbai";
        this.admiral = "Admiral Verma";
    }

    // parameterized constructor
    Navy(String c, int s, double b, int sh, String bl, String ad) {
        super(c, s, b);
        System.out.println("Parameterized Navy constructor called");
        this.ships = sh;
        this.baseLocation = bl;
        this.admiral = ad;
    }

    void display() {
        super.display();
        System.out.println("Ships: " + this.ships);
        System.out.println("Base Location: " + this.baseLocation);
        System.out.println("Admiral: " + this.admiral);
    }
}

//-----------------------------class AirForce---------------------------

class AirForce extends Defence {
    int aircrafts;
    String baseName;
    String airMarshal;

    // default constructor
    AirForce() {
        super();
        System.out.println("Default AirForce constructor called");
        this.aircrafts = 120;
        this.baseName = "Pune Airbase";
        this.airMarshal = "Marshal Kumar";
    }

    // parameterized constructor
    AirForce(String c, int s, double b, int a, String bn, String am) {
        super(c, s, b);
        System.out.println("Parameterized AirForce constructor called");
        this.aircrafts = a;
        this.baseName = bn;
        this.airMarshal = am;
    }

    void display() {
        super.display();
        System.out.println("Aircrafts: " + this.aircrafts);
        System.out.println("Base Name: " + this.baseName);
        System.out.println("Air Marshal: " + this.airMarshal);
    }
}

//-----------------------------TestDefence---------------------------

class TestDefence {
    public static void main(String[] args) {
        Defence d = new Defence();
        d.setCountry("India");
        d.setSoldiers(1500000);
        d.setBudget(80000000000.0);
        d.display();

        System.out.println("\n=================== Army Details ===================");
        Army a = new Army("India", 1200000, 40000000000.0, "Armored", "General Rajput", 1000);
        a.display();

        System.out.println("\n=================== Navy Details ===================");
        Navy n = new Navy("India", 70000, 20000000000.0, 150, "Visakhapatnam", "Admiral Mehta");
        n.display();

        System.out.println("\n=================== AirForce Details ===================");
        AirForce af = new AirForce("India", 150000, 25000000000.0, 250, "Bangalore Air Command", "Air Marshal Rana");
        af.display();
    }
}
