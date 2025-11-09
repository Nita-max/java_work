import java.util.Scanner;
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

    Car(int m,String b,String c,int p,double f)
    {
        System.out.println("parameterized Constructor called");
        this.model = m;
        this.brand = b;
        this.color = c;
        this.price = p;
        this.fuelCapacity = f;
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
    public static void main(String[] args)
   {
     Scanner sc = new Scanner (System.in);
    
     System.out.println("Enter the model:");
     int model = sc.nextInt();

     sc.nextLine();
    
     System.out.print("Enter brand:");
     String brand = sc.nextLine();

     System.out.print("Enter color:");
     String color = sc.nextLine();
      
     System.out.print("Enter price:");
     int price = sc.nextInt();
     
     System.out.print("Enter fuelcapacity:");
     double fuelcapacity = sc.nextDouble();

  
     Car c1 = new Car(model,brand,color,price,fuelcapacity);
     c1.display();
   }
}
//Class TestCar ends here
