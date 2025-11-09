import java.util.Scanner;

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
    this.ISBN     = b;
    this.bName    = str;
    this.category = c;
    this.price    = p;
  }

  void display()
  {
   System.out.println("--------------------------");
   System.out.println(" ISBN     :" + this.ISBN);
   System.out.println(" bName    :" + this.bName);
   System.out.println(" category :" + this.category);
   System.out.println(" price    :" + this.price);
  }

} // book end here

class TestBook
{
  public static void main(String[] a)
  {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("enter ISBN");
    String ISBN = sc.nextLine();

    sc.nextLine();

    System.out.println("enter bName");
    String bName = sc.nextLine();

    System.out.println("enter category");
    String category = sc.nextLine();
   
    System.out.println("enter price");
    double price = sc.nextDouble();

    Book b1,b2,b3; // reference
    
    b1 = new Book();
    b2 = new Book("9960","radhey","historical",399);
    b3 = new Book(ISBN,bName,category,price);

   b1.display();
   b2.display();
   b3.display();
 }

}  
   