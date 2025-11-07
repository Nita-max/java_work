class Product
{
  int productid,quantity;
  String pname;
  double price;

  
 //default constructor
 
 Product()
 {
   System.out.println("default constructor called:"); 
   this.productid=23;
   this.quantity=5;
   this.pname="laptop";
   this.price=45000;
 }

 //parameterized constructor
 
  Product(int pid,int q,String str,double p)
  {
   System.out.println("parameterized constructor called");
   this.productid=pid;
   this.quantity=q;
   this.pname=str;
   this.price=p;
  }
}//product class ends here

class Proinfo
{
  public static void main(String[] arg)
  {
   Product p1,p2;  //object creation
   p1=new Product();  //default constructor
   p2=new Product(20,10,"mobile",20000);

   System.out.println("ProductId:" +p1.productid+ "quantity:" +p1.quantity+ "pname:" +p1.pname+ "price:" +p1.price);
  }
}