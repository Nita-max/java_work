class Student {
    int rollno;
    String name;
    double marks;

    Student() {
        System.out.println("Constructor called");
        this.rollno = 115;
        this.name = "Jayesh";
        this.marks = 90;
    }

    void setRollno(int i) {
        this.rollno = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setMarks(double m) {
        this.marks = m;
    }

    int getRollno() {
        return this.rollno;
    }

    String getName() {
        return this.name;
    }

    double getMarks() {
        return this.marks;
    }

    void display() {
        System.out.println(" Student Roll No : " + this.rollno);
        System.out.println(" Student Name    : " + this.name);
        System.out.println(" Student Marks   : " + this.marks);
    }
} 
//class Student ends here

class StudentDept {
    public static void main(String[] args) {
        Student a; // reference
        a = new Student();

        Student b;
        b = new Student();

        a.setRollno(112);
        a.setName("Himanshu");
        a.setMarks(95.0);

        b.setRollno(113);
        b.setName("Nikhil");
        b.setMarks(88.0);

        a.display();
        b.display();
    }
}
//Class StudentDept ends here
