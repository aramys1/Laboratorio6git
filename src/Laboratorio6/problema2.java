package Laboratorio6;

public class problema2 {
    private long numero;

    public problema2(long numero){
        this.numero = numero;
    }

    public long calcularSuma(){
        long suma = 0;
        long n = numero;
        while ( n > 0){
            suma = suma + (n % 10);
            n = n / 10;
        }
        return suma;
    }
}
