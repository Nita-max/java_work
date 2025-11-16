class Employee
{
  int id;
  String name;
  double salary;

 //default constructor

 Employee()
 {
  System.out.println("default constructor called");
  this.id   = 102;
  this.name = " nita " ;
  this.salary = 25000;
 }


 //parameterized constructor

 Employee(int i , String n , double s)
 {
  System.out.println("parameterized constructor called");
  this.id   = i;
  this.name = n;
  this.salary=s;
 }

//setter method

void setId(int id) { this.id = id;}
void setName(String name) {this.name = name;}
void setSalary(double salary){this.salary = salary;}

//getter method

int getId(){return id;}
String getName(){return name;}
double getsalary(){return salary;}

//display method

void display()
{
 System.out.println("Employee Id     : " + this.id);
 System.out.println("Employee Name   : " + this.name);
 System.out.println("Employee Salary : " + this.salary);
}

}//employee class ends here

//-------------------------HR class-----------------------------

class HR extends Employee
{
 
  double commission;
  
 //default constructor

 HR()
{
 super();
 System.out.println("default constructor called");
 this.commission = 2000;
}

//parameterized constructor

 HR(int i,String n,double s,double c)
{
 super(i,n,s);
 System.out.println("parameterized constructor called");
 this.commission = c;
}

  //setter getter method

 void setCommission(double c){this.commission = c;}
 double getCommission() { return commission ;}

void display()
{
 super.display();
 System.out.println(" HR commission : " +this.commission);
}

}//HR ends here

//--------------------sales manager-------------------------

class SalesManager extends Employee
{
  int target;
  double incentive;

 //default constructor
 SalesManager()
 {
   super();
   this.target = 30;
   this.incentive = 5000;
 }
  

  //parameterized  constructor
 SalesManager(int i,String n,double s,int t, double in)
 {
   super(i,n,s);
   this.target = t;
   this.incentive = in;
 }

//setter getter method

void setTarget(int t) {this.target= t;}
void setIncentive(double in){this.incentive = in;}

int getTarget(){return target;}
double getIncetive(){return incentive;}

// display method

void display()
{
 super.display();
 System.out.println(" SalesManager target    :" + this.target);
 System.out.println(" SalesManager incentive :" + this.incentive);
}

}//salesmanager ends here

//------------------------Admin---------------------------------------

class Admin extends Employee
{
   float allowance;
  
  //default constructor
   Admin()
  {
   super();
   System.out.println("Constructor called");
   this.allowance=2000;
  }

  //paramterized constructor

  Admin(int i,String n,double s,float a)
  {
   super(i,n,s);
   System.out.println("parameterized Constructor called");
   this.allowance= a;
  }
 
//setter getter method

 void setAllowance(float a){this.allowance=a;}

 float getAllowance(){return this.allowance;}

 //display method

  void display()
  {
   super.display();
   System.out.println(" Admin allowance:" +this.allowance);
  }

} //admin ends here

//-------------------Test---------------------------------

class TestEmp
{
  public static void main(String[] a)
  {
    Employee e1 ;   //generic eference
    e1 = new Employee (101,"mahesh",500000);
    e1.display();

    e1 = new HR (102,"nita",600000,7000);  //upcasting
    e1.display();

    e1 = new SalesManager(103,"monika",45000,60,500);
    e1.display();
     
    e1 = new Admin(104,"gita",35000,2000);
    e1.display();
  }

}//class testemp ends here

 
 
 