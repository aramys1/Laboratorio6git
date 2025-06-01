package Laboratorio6;

public class problema1 {
    private int numero;


    //el constructor estaba mal

    public long calcular(){
        //declarabas la i dos veces
        long resultado = 1;
        for (int i = 1; i <= numero; i++ ){
            resultado = resultado*i;
        }
        return resultado;
    }
}
