import java.util.Scanner;

public abstract class Guest {
    protected String name;
    protected int age;
    protected int phoneNr;
    protected Room room;

    public Guest(String name, int age, int phoneNr, Room room){
        this.name = name;
        this.age = age;
        this.phoneNr = phoneNr;
        this.room = room;
    }

    protected void addRoom(){}
}
