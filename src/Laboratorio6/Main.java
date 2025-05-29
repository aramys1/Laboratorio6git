package Laboratorio6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        bufferedReader bufer = new bufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Que problema desea realizar?");
            System.out.println("1. Calcular el factorial de un numero \n2. Calcular la suma de los divisores de un numero\n3. Calcular la cantidad de numeros primos que hay entre dos numeros \n4. Encontrar el numero mas grande de una serie de numeros ingresados por el usuario");
        }catch(IOException e){
            System.out.println("Error al leer la entrada: ");
        }
        
    }
}
