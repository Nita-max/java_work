import java.util.Scanner;
class Distance
{
  int km,meter;
  

//default constructor

 Distance()
 {
  System.out.println("default constructor called");
  this.km=1000;
  this.meter=500;
 }


// parameterized constructor

 Distance(int k,int m)
 {
  System.out.println("parameterized constructor called");
  this.km=k;
  this.meter=m;
 }

 void display()
{
 
 System.out.println("---------------------");
 System.out.println("km    :" +this.km);
 System.out.println("meter :" +this.meter);
}


}//distance ends here

class TestDistance
{
  public static void main(String[]arg)
  {

   Scanner sc = new Scanner(System.in);
   
   System.out.println("enter km");
   int km = sc.nextInt();

   System.out.println("enter meter");
   int meter = sc.nextInt();

    Distance d1,d2,d3;               //object creation

    d1=new Distance();           //default

    d2=new Distance(5000,1000);  //parameterized
   
    d3=new Distance(km,meter);  //user input

    d1.display();
    d2.display();
    d3.display();
  }
}