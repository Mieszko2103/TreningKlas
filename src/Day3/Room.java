package Day3;

public class Room {
    public boolean hasAirCon;
    public int lvl;
    public double lengthInM;
    public double widthInM;
    public double hightInM;

   /* public Room(double lengthInM, double widthInM, double hightInM) {
        this.lengthInM = lengthInM;
        this.widthInM = widthInM;
        this.hightInM = hightInM;
    }*/

    public double volume(){
        return (hightInM*lengthInM*widthInM);
    }

    public void setLengthInM(double lengthInM) {
        this.lengthInM = lengthInM;
    }

    public void setWidthInM(double widthInM) {
        this.widthInM = widthInM;
    }

    public void setHightInM(double hightInM) {
        this.hightInM = hightInM;
    }
}
