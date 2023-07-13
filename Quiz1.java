public class Quiz1 {
    public static void main(String[] args) {
        Student studentA = new Student("Owen", 2565, 3.84f);
        studentA.ShowDetails();
    }
}

class Student {
    private static int seed = 11001100;

    private int id;
    private String name;
    private int addmissionYear;
    private float gpa;

    public Student(String name, int addmissionYear, float gpa) {
        seed += 1;
        this.id = seed; this.name = name; this.addmissionYear = addmissionYear; this.gpa = gpa;
    }

    public void ShowDetails() {
        
        System.out.println( String.format("***\nID: %d\nName: %s\nAddmission Year: %d\nGPA: %s", 
        this.id, this.name,this.addmissionYear,String.format("%.02f", this.gpa)));
    }

    public int GetId() {
        return this.id;
    }

    public void SetName(String newName) {
        this.name = newName;
    }

    public void SetAddmission(int year) {
        this.addmissionYear = year;
    }
}