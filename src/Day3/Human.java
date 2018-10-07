package Day3;

public class Human {
     private String name;
     private String surname;
     private Room room;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Room getWhereIsHe() {
        return room;
    }

    public void setWhereIsHe(Room whereIsHe) {
        this.room = whereIsHe;
    }
}
