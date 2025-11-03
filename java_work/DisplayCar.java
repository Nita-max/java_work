class Car
{
  String model, brand, colour;
  double price;
  int fuelCapacity;

  void setModel(String m)
  {
    this.model = m;
  }

  void setBrand(String b)
  {
    this.brand = b;
  }

  void setPrice(double p)
  {
    this.price = p;
  }

  void setColour(String c)
  {
    this.colour = c;
  }

  void setFuelCapacity(int f)
  {
    this.fuelCapacity = f;
  }
} // Car ends here

class DisplayCar
{
  public static void main(String[] args)
  {
    Car c1;
    c1 = new Car();

    c1.setModel("Swift");
    c1.setBrand("Maruti");
    c1.setPrice(700000);
    c1.setColour("Red");
    c1.setFuelCapacity(40);

    System.out.println("Model: " + c1.model + "  Brand: " + c1.brand + "  Price: " + c1.price + "  Colour: " + c1.colour + "  Fuel Capacity: " + c1.fuelCapacity);
  }
}
