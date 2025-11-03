class Employee
{
  int id,salary;
  String name;
   
  void setId(int i)
  {
   this.id=i;
  }
 
  void setSalary(int s)
  {
   this.salary=s;
  }
 
 void setName(String n)
  {
   this.name=n;
  }
}//class employee ends here

class PrintEmployee
{
  public static void main(String[] arg)
  {
    Employee e1;//reference
    e1=new Employee();

    e1.setId(201);
    e1.setSalary(25000);
    e1.setName("akshay");

    System.out.println("Employee id:=" +e1.id+  "salary=" +e1.salary+  "name=" +e1.name);
  }
}//main ends here

 