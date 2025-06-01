package Laboratorio6;

public class problema1 {
    private int numero;

    public problema1 (int numero){
        this.numero = numero;   
    }

    public long calcular(){
        long resultado = 1;
        for (int i = 1; i <= numero; i++ ){
            resultado = resultado*i;
        }
        return resultado;
    }
}
