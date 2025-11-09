class Printer
{
 void print()
{
  System.out.println("hello");
}
 void print(int n)
 {
   System.out.println(n);
 }
void print(char a)
{
  System.out.println(a);
}
void print(String str)
{
 System.out.println(str);

}
}//printer ends here

class Test
{
  public static void main(String[]args)
  {
   Printer p1;//reference
   p1=new Printer();
   p1.print();
   p1.print(10);
   p1.print('a');
   p1.print("nita");
  }
}
