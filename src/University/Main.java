package University;

public class Main {
    public static void main(String[] args) {
        Student kowalski = new Student("a","b","c");
        kowalski = Main.initialazeStudent();
        kowalski.showMarks();
    }

    private static Student initialazeStudent() {
        Student student = new Student("bbb", "Fizyka", "ddd");
        Index index = new Index();
        Mark[] marks = new Mark[3];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = new Mark();
        }


        marks[0].setScore(5);
        marks[0].setSubject("Programowanie");

        marks[1].setScore(4);
        marks[1].setSubject("Java");

        marks[2].setScore(3);
        marks[2].setSubject("C");
        index.setMarks(marks);
        student.setIndex(index);
        return student;
    }
}
