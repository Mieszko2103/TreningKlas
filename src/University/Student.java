package University;

public class Student extends Human {
    private int year;
    private String fieldOfStudy;
    private Index index;
    private Lecture lecture;
    private Test[] tests;


    public Student(String name, String surname, String fieldOfStudy) {
        super(name, surname);
        this.fieldOfStudy = fieldOfStudy;

    }

    public void setIndex(Index index) {
        this.index = index;
    }

    public void showMarks() {
        {
            for (Mark mark : index.getMarks()) {
                System.out.println(mark.getSubject());
                System.out.println(mark.getScore());
            }
        }
    }


}
