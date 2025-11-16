class Device {
    String brand;
    String model;
    double price;

    // default constructor
    Device() {
        System.out.println("Default Device constructor called");
        this.brand = "Generic";
        this.model = "BaseModel";
        this.price = 10000;
    }

    // parameterized constructor
    Device(String b, String m, double p) {
        System.out.println("Parameterized Device constructor called");
        this.brand = b;
        this.model = m;
        this.price = p;
    }

    // setter methods
    void setBrand(String b) { this.brand = b; }
    void setModel(String m) { this.model = m; }
    void setPrice(double p) { this.price = p; }

    // getter methods
    String getBrand() { return this.brand; }
    String getModel() { return this.model; }
    double getPrice() { return this.price; }

    void display() {
        System.out.println("Device Brand: " + this.brand);
        System.out.println("Device Model: " + this.model);
        System.out.println("Device Price: ₹" + this.price);
    }
}

//-----------------------------class Mobile---------------------------

class Mobile extends Device {
    int battery;
    String os;
    double screenSize;

    // default constructor
    Mobile() {
        super();
        System.out.println("Default Mobile constructor called");
        this.battery = 4000;
        this.os = "Android";
        this.screenSize = 6.5;
    }

    // parameterized constructor
    Mobile(String b, String m, double p, int ba, String o, double s) {
        super(b, m, p);
        System.out.println("Parameterized Mobile constructor called");
        this.battery = ba;
        this.os = o;
        this.screenSize = s;
    }

    void display() {
        super.display();
        System.out.println("Battery: " + this.battery + "mAh");
        System.out.println("Operating System: " + this.os);
        System.out.println("Screen Size: " + this.screenSize + " inches");
    }
}

//-----------------------------class Laptop---------------------------

class Laptop extends Device {
    int ram;
    String processor;
    double weight;

    // default constructor
    Laptop() {
        super();
        System.out.println("Default Laptop constructor called");
        this.ram = 8;
        this.processor = "Intel i5";
        this.weight = 1.5;
    }

    // parameterized constructor
    Laptop(String b, String m, double p, int r, String pr, double w) {
        super(b, m, p);
        System.out.println("Parameterized Laptop constructor called");
        this.ram = r;
        this.processor = pr;
        this.weight = w;
    }

    void display() {
        super.display();
        System.out.println("RAM: " + this.ram + "GB");
        System.out.println("Processor: " + this.processor);
        System.out.println("Weight: " + this.weight + "kg");
    }
}

//-----------------------------class Tablet---------------------------

class Tablet extends Device {
    boolean stylusSupport;
    int storage;
    double thickness;

    // default constructor
    Tablet() {
        super();
        System.out.println("Default Tablet constructor called");
        this.stylusSupport = true;
        this.storage = 64;
        this.thickness = 7.5;
    }

    // parameterized constructor
    Tablet(String b, String m, double p, boolean s, int st, double t) {
        super(b, m, p);
        System.out.println("Parameterized Tablet constructor called");
        this.stylusSupport = s;
        this.storage = st;
        this.thickness = t;
    }

    void display() {
        super.display();
        System.out.println("Stylus Support: " + this.stylusSupport);
        System.out.println("Storage: " + this.storage + "GB");
        System.out.println("Thickness: " + this.thickness + "mm");
    }
}

//----------------------TestDevice---------------------------

class TestDevice {
    public static void main(String[] args) {
        Device d ;       //generic reference
        d = new Device();

        d.setBrand("Sony");
        d.setModel("X100");
        d.setPrice(25000);
        d.display();

        System.out.println("\n=================== Mobile details ===================");
        d = new Mobile("Samsung", "S24", 80000, 5000, "Android", 6.8);
        d.display();

        System.out.println("\n=================== Laptop details ===================");
        d = new Laptop("HP", "Pavilion", 65000, 16, "Intel i7", 1.3);
        d.display();

        System.out.println("\n=================== Tablet details ===================");
        d = new Tablet("Apple", "iPad Pro", 90000, true, 256, 6.4);
        d.display();
    }
}
