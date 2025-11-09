class Hr
{
  int id;
  double salary,commission;
  String name;

 void setId(int i)
  {
   this.id=i;
  }

  void setSalary(double s)
  {
    this.salary=s;
  }

  void setCommission(double a)
   {
    this.commission=a;
   }
 
   void setName(String str)
   {
     this.name=str;
   }
}//class ends here

class TestHr
{
  public static void main(String[]arg)
  {
    Hr h1;//reference
    h1=new Hr();

    h1.setId(11);
    h1.setSalary(30000);
    h1.setCommission(2000.50);
    h1.setName("monika");

   System.out.println("Hr id:=" +h1.id+  "salary=" +h1.salary+ "commission=" +h1.commission+ "name=" +h1.name);

 }
}//main ends here