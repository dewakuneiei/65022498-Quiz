public class Quiz1 {
    public static void main(String[] args) {
        Student studentA = new Student("Owen", 2565, 1.75f);
        Student studentB = new Student("Plug", 2564, 3.17f);
        Student studentC = new Student("Thanet", 2566, 2.75f);

        System.out.println("--Initailize--");
        studentA.ShowDetails();
        studentB.ShowDetails();
        studentC.ShowDetails();
        
        System.out.println("--Modification--");
        studentA.SetGPA(3.98f);
        studentA.UpdateAdmisYear(1);
        studentB.UpdateAdmisYear(2);
        studentC.SetName("Jin Mori");

        for (Student student : new Student[] {studentA, studentB, studentC}) {
            student.ShowDetails();
        }
    }
}

class Student {
    private static int seed = 100;

    private int id;
    private String name;
    private int addmissionYear;
    private float gpa;

    public Student(String name, int addmissionYear, float gpa) {
        seed += 1;
        this.id = seed; this.name = name; this.addmissionYear = addmissionYear; this.gpa = gpa;
    }

    public void ShowDetails() {
        System.out.println( String.format("****** Show Details ******\nID: %d\nName: %s\nAddmission Year: %d\nGPA: %s\n", 
        this.id, this.name,this.addmissionYear,String.format("%.02f", this.gpa)));
    }

    public int GetId() {
        return this.id;
    }

    public void SetName(String newName) {
        this.name = newName;
    }

    public void UpdateAdmisYear(int nextNumber) {
        this.addmissionYear += nextNumber;
    }

    public void SetGPA(float newGPA) {
        this.gpa = newGPA;
    }
}