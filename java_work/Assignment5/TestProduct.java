class Product {
    int productId;
    String productName;
    double price;

    // default constructor
    Product() {
        System.out.println("Default Product constructor called");
        this.productId = 101;
        this.productName = "Unknown Product";
        this.price = 100.0;
    }

    // parameterized constructor
    Product(int id, String name, double p) {
        System.out.println("Parameterized Product constructor called");
        this.productId = id;
        this.productName = name;
        this.price = p;
    }

   //setter method
    void setProductId(int id) { this.productId = id; }
    void setProductName(String name) { this.productName = name; }
    void setPrice(double p) { this.price = p; }

   //getter method
    int getProductId() { return this.productId; }
    String getProductName() { return this.productName; }
    double getPrice() { return this.price; }

  //display method
    void display() {
        System.out.println("Product ID: " + this.productId);
        System.out.println("Product Name: " + this.productName);
        System.out.println("Price: " + this.price);
    }
}

//-----------------------------class Electronics---------------------------

class Electronics extends Product {
    String brand;
    int warranty;
    double power; 

    // default constructor
    Electronics() {
        super();
        System.out.println("Default Electronics constructor called");
        this.brand = "Samsung";
        this.warranty = 24;
        this.power = 65.0;
    }

    // parameterized constructor
    Electronics(int id, String name, double p, String b, int w, double pow) {
        super(id, name, p);
        System.out.println("Parameterized Electronics constructor called");
        this.brand = b;
        this.warranty = w;
        this.power = pow;
    }

    void display() {
        super.display();
        System.out.println("Brand: " + this.brand);
        System.out.println("Warranty (months): " + this.warranty);
        System.out.println("Power (Watts): " + this.power);
    }
}

//-----------------------------class Furniture---------------------------

class Furniture extends Product {
    String material;
    String type;
    double weight;

    // default constructor
    Furniture() {
        super();
        System.out.println("Default Furniture constructor called");
        this.material = "Wood";
        this.type = "Table";
        this.weight = 12.5;
    }

    // parameterized constructor
    Furniture(int id, String name, double p, String m, String t, double w) {
        super(id, name, p);
        System.out.println("Parameterized Furniture constructor called");
        this.material = m;
        this.type = t;
        this.weight = w;
    }

    void display() {
        super.display();
        System.out.println("Material: " + this.material);
        System.out.println("Type: " + this.type);
        System.out.println("Weight (kg): " + this.weight);
    }
}

//-----------------------------class Grocery---------------------------

class Grocery extends Product {
    double quantity; // in kg
    String category;
    String expiryDate;

    // default constructor
    Grocery() {
        super();
        System.out.println("Default Grocery constructor called");
        this.quantity = 1.0;
        this.category = "Daily Use";
        this.expiryDate = "01-01-2026";
    }

    // parameterized constructor
    Grocery(int id, String name, double p, double q, String c, String e) {
        super(id, name, p);
        System.out.println("Parameterized Grocery constructor called");
        this.quantity = q;
        this.category = c;
        this.expiryDate = e;
    }

    void display() {
        super.display();
        System.out.println("Quantity (kg): " + this.quantity);
        System.out.println("Category: " + this.category);
        System.out.println("Expiry Date: " + this.expiryDate);
    }
}

//-----------------------------TestProduct---------------------------

class TestProduct {
    public static void main(String[] args) {
        Product p = new Product();
        p.setProductId(200);
        p.setProductName("Basic Item");
        p.setPrice(300.0);
        p.display();

        System.out.println("\n=================== Electronics Details ===================");
        Electronics e = new Electronics(301, "LED TV", 35000.0, "LG", 36, 120.0);
        e.display();

        System.out.println("\n=================== Furniture Details ===================");
        Furniture f = new Furniture(401, "Office Chair", 5000.0, "Plastic", "Chair", 8.5);
        f.display();

        System.out.println("\n=================== Grocery Details ===================");
        Grocery g = new Grocery(501, "Rice", 60.0, 10.0, "Food", "12-12-2026");
        g.display();
    }
}
