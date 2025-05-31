package Laboratorio6;

public class problema4 {
    private double numeroIngresado;
    private double numeroMayor = 0;
    private double numeroMenor = 0;


    public problema4(double numeroIngresado) {
        this.numeroIngresado = numeroIngresado;
        encontrarNumeroMayor(numeroIngresado);
    }

    public void setNumeroIngresado(double numeroIngresado) {
        this.numeroIngresado = numeroIngresado;
    }

    public double getNumeroMayor() {
        return numeroMayor;
    }


    public void encontrarNumeroMayor(double numeroIngresado) {
        if(numeroIngresado > numeroMayor){
            numeroMayor = numeroIngresado;
        }
    }


    
}
