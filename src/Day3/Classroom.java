package Day3;

public class Classroom extends Room{
    public double temp;
    public int studentsNumber;
    public boolean isTeacherIn;
    private String name= "paracownia";

    

    public Human[] students;
    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}
