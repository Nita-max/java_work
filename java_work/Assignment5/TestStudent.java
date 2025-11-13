class Student {
    int rollNo;
    String name;
    String course;

    // default constructor
    Student() {
        System.out.println("Default Student constructor called");
        this.rollNo = 101;
        this.name = "Unknown";
        this.course = "General Studies";
    }

    // parameterized constructor
    Student(int r, String n, String c) {
        System.out.println("Parameterized Student constructor called");
        this.rollNo = r;
        this.name = n;
        this.course = c;
    }

    // setter methods
    void setRollNo(int r) { this.rollNo = r; }
    void setName(String n) { this.name = n; }
    void setCourse(String c) { this.course = c; }

    // getter methods
    int getRollNo() { return this.rollNo; }
    String getName() { return this.name; }
    String getCourse() { return this.course; }

    void display() {
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Course: " + this.course);
    }
}

//-----------------------------class SchoolStudent---------------------------

class SchoolStudent extends Student {
    String schoolName;
    int std;
    char division;

    // default constructor
    SchoolStudent() {
        super();
        System.out.println("Default SchoolStudent constructor called");
        this.schoolName = "ABC Public School";
        this.std = 10;
        this.division = 'A';
    }

    // parameterized constructor
    SchoolStudent(int r, String n, String c, String sn, int s, char d) {
        super(r, n, c);
        System.out.println("Parameterized SchoolStudent constructor called");
        this.schoolName = sn;
        this.std = s;
        this.division = d;
    }

    void display() {
        super.display();
        System.out.println("School Name: " + this.schoolName);
        System.out.println("Standard: " + this.std);
        System.out.println("Division: " + this.division);
    }
}

//-----------------------------class CollegeStudent---------------------------

class CollegeStudent extends Student {
    String collegeName;
    String stream;
    int semester;

    // default constructor
    CollegeStudent() {
        super();
        System.out.println("Default CollegeStudent constructor called");
        this.collegeName = "XYZ College";
        this.stream = "Computer Science";
        this.semester = 5;
    }

    // parameterized constructor
    CollegeStudent(int r, String n, String c, String cn, String st, int sm) {
        super(r, n, c);
        System.out.println("Parameterized CollegeStudent constructor called");
        this.collegeName = cn;
        this.stream = st;
        this.semester = sm;
    }

    void display() {
        super.display();
        System.out.println("College Name: " + this.collegeName);
        System.out.println("Stream: " + this.stream);
        System.out.println("Semester: " + this.semester);
    }
}

//-----------------------------class ResearchStudent---------------------------

class ResearchStudent extends Student {
    String researchTopic;
    String guideName;
    int duration; // in years

    // default constructor
    ResearchStudent() {
        super();
        System.out.println("Default ResearchStudent constructor called");
        this.researchTopic = "Artificial Intelligence";
        this.guideName = "Dr. Sharma";
        this.duration = 3;
    }

    // parameterized constructor
    ResearchStudent(int r, String n, String c, String rt, String g, int d) {
        super(r, n, c);
        System.out.println("Parameterized ResearchStudent constructor called");
        this.researchTopic = rt;
        this.guideName = g;
        this.duration = d;
    }

    void display() {
        super.display();
        System.out.println("Research Topic: " + this.researchTopic);
        System.out.println("Guide Name: " + this.guideName);
        System.out.println("Duration: " + this.duration + " years");
    }
}

//----------------------TestStudent---------------------------

class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRollNo(201);
        s.setName("Riya");
        s.setCourse("Science");
        s.display();

        System.out.println("\n=================== SchoolStudent details ===================");
        SchoolStudent ss = new SchoolStudent(301, "Aman", "Matric", "Bright Future School", 9, 'B');
        ss.display();

        System.out.println("\n=================== CollegeStudent details ===================");
        CollegeStudent cs = new CollegeStudent(401, "Sneha", "BCA", "SBES College", "Computer Science", 3);
        cs.display();

        System.out.println("\n=================== ResearchStudent details ===================");
        ResearchStudent rs = new ResearchStudent(501, "Kunal", "PhD", "Machine Learning", "Dr. Patel", 4);
        rs.display();
    }
}
