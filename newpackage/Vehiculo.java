
package newpackage;

public abstract class Vehiculo {
    //atributos
    
    int numRuedas;
    int velocidadMax;
    //constructor

    public Vehiculo(int numRuedas, int velocidadMax) {
        this.numRuedas = numRuedas;
        this.velocidadMax = velocidadMax;
    }
    

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
     
    public void vehiculo(){
       System.out.println(numRuedas + ""); 
    }
    public void acelerar(){
        System.out.println(velocidadMax + "");

 }
    
}

