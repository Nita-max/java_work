class Book
{
  String ISBN, bName, category;
  double price;

  void setISBN(String i)
  {
    this.ISBN = i;
  }

  void setBName(String n)
  {
    this.bName = n;
  }

  void setCategory(String c)
  {
    this.category = c;
  }

  void setPrice(double p)
  {
    this.price = p;
  }
} // Book ends here

class DisplayBook
{
  public static void main(String[] args)
  {
    Book b1;
    b1 = new Book();

    b1.setISBN("978-12345");
    b1.setBName("chava");
    b1.setCategory("historical");
    b1.setPrice(499.0);

    System.out.println("ISBN: " + b1.ISBN + "  Name: " + b1.bName + "  Category: " + b1.category + "  Price: " + b1.price);
  }
}
