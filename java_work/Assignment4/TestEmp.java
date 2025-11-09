import java.util.Scanner;

class Employee
{
  int Id;
  String name;
  double salary;

  //default constructor called
  Employee()
  {
   System.out.println("default constructor called:");
   this.Id=101;
   this.name="Nita";
   this.salary=30000;
  }
 
  //parameterized constructor called
  Employee(int i, String str , double s)
  {
   System.out.println("parameterized constructor called:");
   this.Id     = i;
   this.name   = str;
   this.salary = s;
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
    Scanner sc = new Scanner (System.in);
    
    System.out.println("enter Employee ID:");
    int Id = sc.nextInt();   

    sc.nextLine();

   System.out.println("enter Employee Name:");
   String name = sc.nextLine();   

  
   System.out.println("enter Employee Salary:");
   double salary = sc.nextDouble();
   
   Employee e1 = new Employee(Id,name,salary);
   Employee e2 = new Employee(101,"Nita",30000);

   e1.display();  
   e2.display();   
  }

}
