class Distance
{
  int km,meter
  
 Distance()//default constructor called
 {
  System.out.println("default constructor called");
  this.km=1000;
  this.meter=500;
 }//default constructor ends here

 Distance(int k,int m)
 {
  System.out.println("parameterized constructor called");
  this.km=k;
  this.meter=m;
 }//parameterized constructor ends here

}//distance ends here

class DistancePrint
{
  public static void main(String[]arg)
  {
    Distance d1,d2; //object create
    d1=new Distance();          //default
    d2=new Distance(5000,1000); //parameterized
 
   System.out.println("Distance d1:km:"+dm+ "meter" +d1.m);
   System.out.println("Distance d2:km: +d2km+ "meter" +d2.m);
  }
}