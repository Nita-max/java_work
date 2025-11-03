class Admin
{
  int id,salary;
  double allowance;
  String name;

 void setId(int d)
  {
   this.id=d;
  }

  void setSalary(int s)
  {
    this.salary=s;
  }

  void setAllowance(double a)
   {
    this.allowance=a;
   }
 
   void setName(String str)
   {
     this.name=str;
   }
}//admin ends here

class Display
{
  public static void main(String[]arg)
  {
    Admin a1;//reference
    a1=new Admin();

    a1.setId(11);
    a1.setSalary(30000);
    a1.setAllowance(2000.50);
    a1.setName("neeta");

   System.out.println("Admin id:=" +a1.id+ "salary=" +a1.salary+ "allowance=" +a1.allowance+ "name=" +a1.name);

 }
}