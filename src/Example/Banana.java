package Example;

import java.awt.*;

public class Banana extends Fruit{
    public Banana(String n, int w, Color c){
        //super(n,w,c);
    }

    @Override
    public void eat(int eaten) {

    }

    @Override
    public void changeColor() {
        color= Color.yellow;
    }

}
