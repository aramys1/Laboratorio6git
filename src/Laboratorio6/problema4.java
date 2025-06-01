package Laboratorio6;

public class problema4 {
    private double numeroIngresado;
    private double numeroMayor = 0;
    private double numeroMenor = 0;

    public double getNumeroMayor() {
        return numeroMayor;
    }

    public void encontrarNumeroMayor(double numeroIngresado) {
        if(numeroIngresado > numeroMayor){
        numeroMayor = numeroIngresado;
        }  
    }
}
