class Animal {
    String name;
    int age;
    String habitat;

//default constructor
 
    Animal() {
        System.out.println("Default Animal constructor called");
        this.name = "Unknown";
        this.age = 1;
        this.habitat = "Land";
    }

//parameterized constructor
    Animal(String n, int a, String h) {
        System.out.println("Parameterized Animal constructor called");
        this.name = n;
        this.age = a;
        this.habitat = h;
    }

//setter and getter method

    void setName(String n) { this.name = n; }
    void setAge(int a) { this.age = a; }
    void setHabitat(String h) { this.habitat = h; }

    String getName() { return this.name; }
    int getAge() { return this.age; }
    String getHabitat() { return this.habitat; }

//display method
    void display() {
        System.out.println("Animal Name: " + this.name);
        System.out.println("Animal Age: " + this.age);
        System.out.println("Habitat: " + this.habitat);
    }
}

//-----------------------------class Dog---------------------------

class Dog extends Animal {
    String breed;
    String color;
    boolean trained;

//default constructor

    Dog() {
        super();
        System.out.println("Default Dog constructor called");
        this.breed = "Labrador";
        this.color = "Brown";
        this.trained = true;
    }

//parameterized constructor

    Dog(String n, int a, String h, String b, String c, boolean t) {
        super(n, a, h);
        System.out.println("Parameterized Dog constructor called");
        this.breed = b;
        this.color = c;
        this.trained = t;
    }

//display method

    void display() {
        super.display();
        System.out.println("Breed: " + this.breed);
        System.out.println("Color: " + this.color);
        System.out.println("Trained: " + this.trained);
    }
}

//-----------------------------class Cat---------------------------

class Cat extends Animal {
    String furType;
    boolean indoor;
    int lives;

//default constructor

    Cat() {
        super();
        System.out.println("Default Cat constructor called");
        this.furType = "Short Hair";
        this.indoor = true;
        this.lives = 9;
    }

// parameterized constructor

    Cat(String n, int a, String h, String f, boolean i, int l) {
        super(n, a, h);
        System.out.println("Parameterized Cat constructor called");
        this.furType = f;
        this.indoor = i;
        this.lives = l;
    }

//display method

    void display() {
        super.display();
        System.out.println("Fur Type  : " + this.furType);
        System.out.println("Indoor Cat: " + this.indoor);
        System.out.println("Lives     : " + this.lives);
    }
}

//-----------------------------class Bird---------------------------

class Bird extends Animal {
    double wingspan;
    String color;
    boolean canFly;

    Bird() {
        super();
        System.out.println("Default Bird constructor called");
        this.wingspan = 1.0;
        this.color = "Gray";
        this.canFly = true;
    }

    Bird(String n, int a, String h, double w, String c, boolean f) {
        super(n, a, h);
        System.out.println("Parameterized Bird constructor called");
        this.wingspan = w;
        this.color = c;
        this.canFly = f;
    }

    void display() {
        super.display();
        System.out.println("Wingspan: " + this.wingspan + " meters");
        System.out.println("Color: " + this.color);
        System.out.println("Can Fly: " + this.canFly);
    }
}

//----------------------TestAnimal---------------------------

class TestAnimal {
    public static void main(String[] args) {
        Animal a ;            //generic reference
        a = new Animal();

        a.setName("Elephant");
        a.setAge(10);
        a.setHabitat("Forest");
        a.display();

        System.out.println("\n=================== Dog details ===================");
        a = new Dog("Tommy", 5, "House", "Beagle", "White", true);
        a .display();

        System.out.println("\n=================== Cat details ===================");
        a = new Cat("Mittens", 3, "Home", "Long Hair", true, 9);
        a .display();

        System.out.println("\n=================== Bird details ===================");
        a = new Bird("Parrot", 2, "Tropical", 0.5, "Green", true);
        a .display();
    }
}