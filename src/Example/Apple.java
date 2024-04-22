package Example;

import java.awt.*;

public class Apple extends Fruit{
    public Apple(String n, int w, Color c){
        //super(n,w,c);
    }

    @Override
    public void changeColor() {
        color= Color.red;

    }

}
