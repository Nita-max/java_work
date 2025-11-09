import java.util.Scanner;
class Student
{
 
  int rollno, marks ;
  String name;
 
 //default constructor 

 Student()
 {
  System.out.println("default constructor called");
  this.rollno = 102;
  this.marks  = 90;
  this.name   = "sneha";
 }

//parameterized constructor

Student(int r , int m , String str)
 { 
   System.out.println("parameterized constructor called");
   this.rollno = r;
   this.marks  = m;
   this.name   = str;
 }

 

//display method 
void display()
 {
   System.out.println(" student rollno :" +this.rollno);
   System.out.println(" student marks  :" +this.marks);
   System.out.println(" student name   :" +this.name);
 }

}// class student ends here

class TestStudent
{
  public static void main(String[] arg)
  {
   Scanner sc = new Scanner (System.in);
  
   System.out.println("enter student rollno :");
   int rollno = sc.nextInt();
   
   sc.nextLine();

   System.out.println("enter student marks :");
   int marks = sc.nextInt();

   System.out.println("enter student name :");
   String name = sc.nextLine();

   Student s1,s2 ; 
    
    s1 = new Student();
    s2 = new Student(102,79,"niku");
   
    s1.display();
    s2.display();
  }
}