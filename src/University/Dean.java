package University;

import java.util.Date;

public class Dean extends AdmWorker{
    private Date begginingDate;
    private Date endDate;
    private Teacher [] employedTeachers;

    public Dean(String name, String surname) {
        super(name, surname);
    }
}
