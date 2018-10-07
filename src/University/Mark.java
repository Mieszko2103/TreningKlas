package University;

import java.util.Date;

public class Mark {
    private Date dateOfMark;
    private double score;
    private String subject;
    private Teacher whoGave;
    private Index index;

    public double getScore() {
        return score;
    }

    public String getSubject() {
        return subject;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
