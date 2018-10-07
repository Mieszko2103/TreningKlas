package Day3;

public class PodstOb {
    public static void main(String[] args) {
        Classroom pracwonia = new Classroom();
        pracwonia.lvl = 2;
        pracwonia.studentsNumber = 17;
        pracwonia.setName("Pracownia komputerowa");
        pracwonia.hasAirCon = true;
        pracwonia.isTeacherIn = true;
        System.out.println(pracwonia.getName());


       Calac calculator = new Calac();
        System.out.printf("%.3f",calculator.add(4,7.2342));
        pracwonia = null;

    }
}
