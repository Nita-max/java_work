class Student
{
  int rollno,mark;
  String name;
 
 void setRollno(int r)
  {
    this.rollno=r;
  }
 void setMark(int m)
  {
    this.mark=m;
  }
 void setName(String n)
 {
  this.name=n;
 }
}// student ends here
 
class TestStudent
{
  public static void main(String[] arg)
  {
    Student s1;//reference
    s1=new Student();
    
    s1.setRollno(101);
    s1.setMark(98);
    s1.setName("nita");

   System.out.println("student info:" +s1.rollno+ "/" +s1.mark);
   System.out.println("name of the student:" +s1.name);
  }
}

