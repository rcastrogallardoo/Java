
package cursojava.Martes;

/*
La abstraccion es un proceso para ocultar los detalles de implementacion y 
mostrar solo la funcionalidad al usuario.

Declaracion: int a;
Una clase declarada con la palabra reservada Abstract se considera abstracta
de nombre.
Puede ser abstracta con metodos no abstractos.

Enviar sms solo escribe el texto y lo envia, no conocemos el proceso interno
sobre la entrega de mensajes.

Formas de lograr la abstraccion
    1.- Clase Abstracta )0 a 100%)
    2.- Interface (100%)
Una clase declara abstracta necesita ser extendida (extends) e implemetar sus 
metodos. No se puede Instanciar.
    abstract class A{}
Un metodo declarado abstracto no tiene implementaciones 
    abstract void print();
*/

abstract class Bike{
    abstract void run();
}
public class Abstraccion extends Bike{
    @Override
    void run(){
        System.out.println("Running");
    }
    public static void main(String[] args){
        Bike b = new Abstraccion();
        b.run();
    }
}
