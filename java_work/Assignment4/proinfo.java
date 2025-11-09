import java.util.Scanner;

class Product
{
  int Id, quantity;
  String pname;
  double price;

  
 //default constructor
 
 Product()
 {
   System.out.println("default constructor called:"); 
   this.Id=23;
   this.quantity=5;
   this.pname="laptop";
   this.price=45000;
 }

 //parameterized constructor
 
  Product(int id,int q,String str,double p)
  {
   System.out.println("parameterized constructor called");
   this.Id       = id;
   this.quantity = q;
   this.pname    = str;
   this.price    = p;
  }

 void display()
 {
  System.out.println("=================================");
  System.out.println("product Id       :" +this.Id);
  System.out.println("product quantity :" +this.quantity);
  System.out.println("product pname    :" +this.pname);
  System.out.println("product price    :" +this.price);
 }
 
}//product class ends here

class Proinfo
{
  public static void main(String[] arg)
  {
   
   Scanner sc = new Scanner(System.in);
   
   System.out.println("enter Id");
   int Id = sc.nextInt();

   System.out.println("enter quantity");
   int quantity = sc.nextInt();

   sc.nextLine();
   System.out.println("enter pname");
   String pname = sc.nextLine();

   System.out.println("enter price");
   double price = sc.nextDouble();

   Product p1,p2,p3;                            //object creation

   p1 = new Product();                       //default 
   p2 = new Product(201,10,"mobile",20000);  //parameterized
   p3 = new Product(Id,quantity,pname,price);//user input
    
   p1.display();
   p2.display();
   p3.display();


 }
}