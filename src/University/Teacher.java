package University;

public class Teacher extends AdmWorker {
    private String degree;
    private Dean boss;
    private Mark[] marksGiven;

    public Teacher(String name, String surname) {
        super(name, surname);
    }
}
