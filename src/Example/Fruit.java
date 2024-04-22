package Example;

import java.awt.*;

public abstract class Fruit {
    String name;
    int weight;
    Color color;

    public  Fruit(){}

    public void eat(int eaten){
        weight -= eaten;
    }
    public abstract void changeColor();
}

