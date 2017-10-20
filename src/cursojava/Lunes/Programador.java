
package cursojava.Lunes;
/*
Herencia: Es un mecanismo que pemite que un objeto adquiera todas las 
propiedades y comportamientos de un objeto padre.

La idea de la herencia es que pueas crear nuevas clases a partir de las 
existetes.

Relaciones Entre clases: Asociacion, composicion, agegacion y herencia.

Hay un termino que permite distinguir los dstintos tipos de relaciones,
llamado ACOPLAMIENTO.

*- Medida de dependencia que hay entre 2 modulos, existentes grados de 
acoplamiento (bajo/alto).
*- Cada clase y metodo hace una sola cosa y la hace bien (COHESION), Numero de 
tareas que tiene cada clase o metodo.

Es deseable que 2 o mas modulos de un programa mantengan alta cohesion y bajo 
acoplamiento.

Relacion entre clases:
    Asociacion (Es Un): Cuando entre  o mas clases se da una interacion que no 
modifica en nada el comportamiento de los objetos de antes o despues de 
terminada la relacion.
La asociacion 




La asociacion es una relacion de un objeto debiadamnte acoplados.

Agregaion (Tiene Un): Es una relacion entre objetos que el comportamiento entre
ellos, mietras que dura la relacion. Es decir, un objeto depede de los revicios 
de otro largo plazo.

Composicion (Contiene un): Cuando un objeto complejo usa otros objetos 
permantemente. La composicion es una relacion entre objetos cuya escencia tiene 
sentido solo cuando ellos estan acoplados.

Herencia: Cuando un objeto tiene las carateristicas de otro permanentemente, 
tendremos una relacion entre objetos intimamnete acoplados cuya existencia 
depende de un ancestro padre.
*/

class Empleado{
     float salario = 40000;
}
public class Programador extends Empleado {
   int bono = 10000;
   String msg="";
   public static void main(String[] args)
   {
       String msg="";
       Programador p = new Programador();
       msg+="El Salario del programador es de "+p.salario;
       System.out.println(msg);
       System.out.println("El bono es: "+p.bono);
       
   }
        
}
