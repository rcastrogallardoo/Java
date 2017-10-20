package cursojava.Martes.Interfaces.Pruebas;
import cursojava.Martes.Interfaces.Drawable;

public class Test {
    public static void main(String[] args)
    {
        Drawable d = (Drawable) new Circle();
        d.draw();
    }
}
