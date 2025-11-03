class Product
{
  int productID;
  String Name;
  double price;
  int quantity;

  void setProductID(int id)
  {
    this.productID = id;
  }

  void setName(String n)
  {
    this.Name = n;
  }

  void setPrice(double p)
  {
    this.price = p;
  }

  void setQuantity(int q)
  {
    this.quantity = q;
  }
} // Product ends here

class DisplayProduct
{
  public static void main(String[] args)
  {
    Product p1;
    p1 = new Product();

    p1.setProductID(111);
    p1.setName("mobile");
    p1.setPrice(55000);
    p1.setQuantity(5);

    System.out.println("Product ID: " + p1.productID + "  Name: " + p1.Name + "  Price: " + p1.price + "  Quantity: " + p1.quantity);
  }
}
