
package newpackage;

public class Automovil {
    
   //atributos
   int num_puertas;

    public automovil(int num_puertas, int num_ruedas, int velocidadmaxima) {
        super(numRuedas, velocidadmaxima);
        this.num_puertas = num_puertas;
    }

    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }

    public int getNum_ruedas() {
        return num_ruedas;
    }

    public void setNum_ruedas(int num_ruedas) {
        this.num_ruedas = num_ruedas;
    }

    public int getVelocidadmaxima() {
        return velocidadmaxima;
    }

    public void setVelocidadmaxima(int velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }
    
    @Override
    public void acelerar(){
         System.out.println("La velocidad actual del automovil es:"+0);

    }
}
