package cursojava.Martes.Interfaces.Acciones;

import cursojava.Martes.Interfaces.Drawable;

class Rectangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
public class Figuras {
    public static void main(String[] args){
        Drawable d = new Circle();
        d.draw();
    }
    
    
}
