//Klass som skapar gästen
public abstract class Guest {
    protected String name;
    protected int age;
    protected int phoneNr;
    protected Room room;

    //Gästens attribut
    public Guest(String name, int age, int phoneNr){
        this.name = name;
        this.age = age;
        this.phoneNr = phoneNr;
    }

    //Metod för att gästen ska kunna äga ett rum
    protected void addRoom(){}
}
