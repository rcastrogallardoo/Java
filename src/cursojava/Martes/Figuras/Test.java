
package cursojava.Martes.Figuras;


class Shape {
    void draw(){
        System.out.println("Dibujando ...");
    }
}
class Rectangle extends Shape {
    void draw(){
        System.out.println("Dibujando un Rectangulo");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Dibujando un Circulo");
    }
}

class Triangle extends Shape {
    void draw(){
        System.out.println("Dibujando un Triangulo");
    }
    
}

class TestFigurass{
    public static void main(String[] args){
        Shape s;
        s=new Rectangle();
        s.draw();
        s=new Circle();
        s.draw();
        s=new Triangle();
        s.draw();
        
    }
    
}