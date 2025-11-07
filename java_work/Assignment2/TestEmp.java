class Employee
{
  int Id;
  String name;
  double salary;

  //default constructor called
  Employee()
  {
   this.Id=101;
   this.name="Nita";
   this.salary=30000;
  }
 
 void setId(int i)
 {
  this.Id=i;
 }

 void setName(String n)
 {
  this.name=n;
 }

 void setSalary(double s)
 {
  this.salary=s;
 }

 int getId()
 {
  return this.Id;
 }

 String getName()
 {
   return this.name;
 }

 double getSalary()
 {
  return this.salary;
 }

void display()
 {
  System.out.println(" Employee Id    :" +this.Id);
  System.out.println(" Employee Name  :" +this.name);
  System.out.println(" Employee Salary:" +this.salary);
 }

}//Employee ends here


class TestEmp
{
  public static void main(String[] a)
  {
   Employee e1 ;
   e1= new Employee ();

   Employee e2;
   e2=new Employee();

   e1.setId(101);
   e1.setName("Moni");
   e1.setSalary(30000);

   e1.display();
   e2.display();
  }
}


  
 
    