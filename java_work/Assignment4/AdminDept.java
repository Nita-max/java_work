import java.util.Scanner;

class Admin
{
 int Id;
 String name;
 double salary;
 float allowance;

 //default constructor called

 Admin()
 {
   System.out.println("Constructor called");
   this.Id=20;
   this.name="Sambhaji";
   this.salary=20000;
   this.allowance=2000;
 }

// paramterized constructor called
 Admin(int i ,String str, double s, float a)
 {
   System.out.println("parametrized Constructor called");
   this.Id        = i;
   this.name      = str;
   this.salary    = s;
   this.allowance = a;
 }

// setter method
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

void setAllowance(float a)
{
this.allowance=a;
}

// getter method

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

float getAllowance()
{
 return this.allowance;
}

//display method
void display()
{
System.out.println(" Admin Id       :" +this.Id);
System.out.println(" Admin name     :" +this.name);
System.out.println(" Admin salary   :" +this.salary);
System.out.println(" Admin allowance:" +this.allowance);
}

} //class Admin ends here

class AdminDept
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter admin Id:");
     int Id    = sc.nextInt();
    
    sc.nextLine();

    System.out.println("enter admin Name:");
    String name = sc.nextLine();

    System.out.println(" enter admin salary :");
    double salary = sc.nextDouble();

    System.out.println(" enter admin allowance:");
    float allowance = sc.nextFloat();

    Admin a1 = new Admin(Id, name,salary,allowance);
    Admin a2 = new Admin(102,"Nita",45000,300);
    Admin a3 = new Admin();
    a1.display();
    a2.display();
    a3.display();

  }
}
//Class AdminDept ends here