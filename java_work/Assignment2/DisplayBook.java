class Book
{
  String ISBN, bName, category;
  double price;

  // default constructor
  Book()
  {
    System.out.println("default constructor called");
    this.ISBN = "986082";
    this.bName = "chava";
    this.category = "historical";
    this.price = 499;
  }

  // parameterized constructor
  Book(String b, String str, String c, double p)
  {
    System.out.println("parameterized constructor called");
    this.ISBN = b;
    this.bName = str;
    this.category = c;
    this.price = p;
  }
}


class DisplayBook
{
  public static void main(String[] args)
  {
    // creating objects
    Book b1 = new Book();   // default constructor
    Book b2 = new Book("996054", "mrutunjay", "historical", 599.00); // parameterized constructor

    // display data
    System.out.println("Book 1 -> ISBN: " + b1.ISBN + "  Name: " + b1.bName + "  Category: " + b1.category + "  Price: " + b1.price);
    System.out.println("Book 2 -> ISBN: " + b2.ISBN + "  Name: " + b2.bName + "  Category: " + b2.category + "  Price: " + b2.price);
  }
}
