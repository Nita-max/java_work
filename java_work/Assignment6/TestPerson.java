class Person {
    String name;
    int age;
    String gender;

    // default constructor
    Person() {
        System.out.println("Default Person constructor called");
        this.name = "Unknown";
        this.age = 18;
        this.gender = "Not specified";
    }

    // parameterized constructor
    Person(String n, int a, String g) {
        System.out.println("Parameterized Person constructor called");
        this.name = n;
        this.age = a;
        this.gender = g;
    }

    // setter methods
    void setName(String n) { this.name = n; }
    void setAge(int a) { this.age = a; }
    void setGender(String g) { this.gender = g; }

    // getter methods
    String getName() { return this.name; }
    int getAge() { return this.age; }
    String getGender() { return this.gender; }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
    }
}

//-----------------------------class Student---------------------------

class Student extends Person {
    int rollNo;
    String course;
    double marks;

    Student() {
        super();
        System.out.println("Default Student constructor called");
        this.rollNo = 1;
        this.course = "BCA";
        this.marks = 85.5;
    }

    Student(String n, int a, String g, int r, String c, double m) {
        super(n, a, g);
        System.out.println("Parameterized Student constructor called");
        this.rollNo = r;
        this.course = c;
        this.marks = m;
    }

    void display() {
        super.display();
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Course: " + this.course);
        System.out.println("Marks: " + this.marks);
    }
}

//-----------------------------class Teacher---------------------------

class Teacher extends Person {
    String subject;
    int experience;
    double salary;

    Teacher() {
        super();
        System.out.println("Default Teacher constructor called");
        this.subject = "Math";
        this.experience = 5;
        this.salary = 40000;
    }

    Teacher(String n, int a, String g, String s, int e, double sal) {
        super(n, a, g);
        System.out.println("Parameterized Teacher constructor called");
        this.subject = s;
        this.experience = e;
        this.salary = sal;
    }

    void display() {
        super.display();
        System.out.println("Subject: " + this.subject);
        System.out.println("Experience: " + this.experience);
        System.out.println("Salary: " + this.salary);
    }
}

//-----------------------------class Doctor---------------------------

class Doctor extends Person {
    String specialization;
    int patientsPerDay;
    double fees;

    Doctor() {
        super();
        System.out.println("Default Doctor constructor called");
        this.specialization = "General";
        this.patientsPerDay = 10;
        this.fees = 500;
    }

    Doctor(String n, int a, String g, String s, int p, double f) {
        super(n, a, g);
        System.out.println("Parameterized Doctor constructor called");
        this.specialization = s;
        this.patientsPerDay = p;
        this.fees = f;
    }

    void display() {
        super.display();
        System.out.println("Specialization: " + this.specialization);
        System.out.println("Patients per day: " + this.patientsPerDay);
        System.out.println("Fees: " + this.fees);
    }
}

//----------------------TestPerson---------------------------

class TestPerson {
    public static void main(String[] args) {
        Person p ;
        p = new Person();

        p.setName("Amit");
        p.setAge(30);
        p.setGender("Male");
        p.display();

        System.out.println("\n=================== Student details ===================");
        p = new Student("Riya", 21, "Female", 102, "BSc", 89.4);
        p.display();

        System.out.println("\n=================== Teacher details ===================");
        p = new Teacher("Rajesh", 40, "Male", "Physics", 12, 60000);
        p.display();

        System.out.println("\n=================== Doctor details ===================");
        p = new Doctor("Sneha", 35, "Female", "Dentist", 15, 800);
        p.display();
    }
}
