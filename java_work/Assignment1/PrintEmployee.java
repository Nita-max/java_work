class Employee
{
  int id,salary;
  String name;
   
  Employee()//default constructor
  {
   System.out.println("constructor called");
    this.id=13;
    this.salary=12000;
    this.name="monika";
  }
  Employee(int i,int s,String n)//parameterized constructor
{
  System.out.println("parameterized constructor called");
  this.id=i;
  this.salary=s;
  this.name=n;
}
  

class PrintEmployee
 {
  public static void main(String[] arg)
  {
    Employee e1;//reference
    e1=new Employee();
    
   Employee e2;//reference
   e2=new Employee(101,25000,"nita")

  }
}
