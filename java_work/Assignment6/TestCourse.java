class Course {
    String courseName;
    String instructor;
    double duration; // in hours

    // default constructor
    Course() {
        System.out.println("Default  constructor called");
        this.courseName = "Unknown Course";
        this.instructor = "Not Assigned";
        this.duration = 10.0;
    }

    // parameterized constructor
    Course(String c, String i, double d) {
        System.out.println("Parameterized constructor called");
        this.courseName = c;
        this.instructor = i;
        this.duration = d;
    }

    void setCourseName(String c) { this.courseName = c; }
    void setInstructor(String i) { this.instructor = i; }
    void setDuration(double d) { this.duration = d; }

    String getCourseName() { return this.courseName; }
    String getInstructor() { return this.instructor; }
    double getDuration() { return this.duration; }

    void display() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Instructor: " + this.instructor);
        System.out.println("Duration (hours): " + this.duration);
    }
}

//-----------------------------class OnlineCourse---------------------------

class OnlineCourse extends Course {
    String platform;
    boolean hasCertificate;
    double fee;

    // default constructor
    OnlineCourse() {
        super();
        System.out.println("Default constructor called");
        this.platform = "Udemy";
        this.hasCertificate = true;
        this.fee = 499.0;
    }

    // parameterized constructor
    OnlineCourse(String c, String i, double d, String p, boolean cert, double f) {
        super(c, i, d);
        System.out.println("Parameterized constructor called");
        this.platform = p;
        this.hasCertificate = cert;
        this.fee = f;
    }

    void display() {
        super.display();
        System.out.println("Platform: " + this.platform);
        System.out.println("Has Certificate: " + this.hasCertificate);
        System.out.println("Fee: " + this.fee);
    }
}

//-----------------------------class OfflineCourse---------------------------

class OfflineCourse extends Course {
    String location;
    int students;
    boolean hasLab;

    // default constructor
    OfflineCourse() {
        super();
        System.out.println("Default constructor called");
        this.location = "Campus A";
        this.students = 30;
        this.hasLab = true;
    }

    // parameterized constructor
    OfflineCourse(String c, String i, double d, String l, int s, boolean lab) {
        super(c, i, d);
        System.out.println("Parameterized  constructor called");
        this.location = l;
        this.students = s;
        this.hasLab = lab;
    }

    void display() {
        super.display();
        System.out.println("Location: " + this.location);
        System.out.println("Students Enrolled: " + this.students);
        System.out.println("Has Lab: " + this.hasLab);
    }
}

//-----------------------------class Workshop---------------------------

class Workshop extends Course {
    int days;
    String topic;
    String organizer;

    // default constructor
    Workshop() {
        super();
        System.out.println("Default constructor called");
        this.days = 2;
        this.topic = "Team Building";
        this.organizer = "Tech Academy";
    }

    // parameterized constructor
    Workshop(String c, String i, double d, int da, String t, String o) {
        super(c, i, d);
        System.out.println("Parameterized constructor called");
        this.days = da;
        this.topic = t;
        this.organizer = o;
    }

    void display() {
        super.display();
        System.out.println("Days: " + this.days);
        System.out.println("Topic: " + this.topic);
        System.out.println("Organizer: " + this.organizer);
    }
}

//-----------------------------TestCourse---------------------------

class TestCourse {
    public static void main(String[] args) {
        Course c ;         //generic reference
        c = new Course();

        c.setCourseName("Basic Programming");
        c.setInstructor("Rahul");
        c.setDuration(20.0);
        c.display();

        System.out.println("\n=================== Online Course Details ===================");
        c = new OnlineCourse("Java Masterclass", "Neha", 40.0, "Coursera", true, 1200.0);
        c.display();

        System.out.println("\n=================== Offline Course Details ===================");
        c = new OfflineCourse("Data Science", "Amit", 60.0, "Pune Campus", 25, true);
        c.display();

        System.out.println("\n=================== Workshop Details ===================");
        c = new Workshop("AI Bootcamp", "Dr. Mehta", 15.0, 3, "Machine Learning", "TechX Institute");
        c.display();
    }
}
