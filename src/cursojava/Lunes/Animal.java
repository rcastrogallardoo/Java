/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.Lunes;

//Herencia Simple
public class Animal {
    void eat(){
        System.out.println("Comiendo...");
    }
    
}

class Perro extends Animal{
    void ladrar(){
        System.out.println("Ladrando...");
    }
}

class PruebaHerencia{
    public static void main(String[] args)
    {
        Perro p = new Perro();
        p.eat();
        p.ladrar();
    }
}