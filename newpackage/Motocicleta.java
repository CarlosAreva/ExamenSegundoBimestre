
package newpackage;

public class Motocicleta {
    //atributos
     Boolean tieneCasco;
     Boolean notieneCasco;
    //constructor
    public Motocicleta(Boolean tieneCasco, Boolean notieneCasco, int numRuedas, int velocidadMax) {
        super(numRuedas, velocidadMax);
        this.tieneCasco = tieneCasco;
        this.notieneCasco = notieneCasco;
    }
  
     @Override
    public void acelerar(){
         System.out.println("El Maximo de Velocidad es:"+velocidadMax); 
    
    
}

}
