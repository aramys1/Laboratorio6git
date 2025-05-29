package Laboratorio6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        int opcionesMenu = 0;
        int factorial = 0;
        long sumaDigitos = 0;
        

        do{
            try{
            System.out.println("Que problema desea realizar?");
            System.out.println("1. Calcular el factorial de un numero \n2. Calcular la suma de los divisores de un numero\n3. Calcular la cantidad de numeros primos que hay entre dos numeros \n4. Encontrar el numero mas grande de una serie de numeros ingresados por el usuario \n0. Salir");
            opcionesMenu = Integer.parseInt(bufer.readLine());

            }catch(IOException e){
                System.out.println("Error al leer la entrada: ");
            }
            catch(NumberFormatException e){
                System.out.println("Error en el formato de entrada");
            }

            switch (opcionesMenu){
                case 1:
                    System.out.println("Digite el numero al que desea calcular el factorial: ");
                    try{
                        factorial = Integer.parseInt(bufer.readLine());

                    }
                    catch(IOException e){
                        System.out.println("error al leer la entrada");
                    }
                    catch(NumberFormatException e){
                     System.out.println("Error en el formato de entrada");
                    }

                    break;
                case 2:
                    System.out.println("Digite el numero del cual quiera la suma de sus digitos");
                    try{
                        sumaDigitos = Integer.parseInt(bufer.readLine());

                    }
                    catch(IOException e){
                        System.out.println("error al leer la entrada");
                    }
                    catch(NumberFormatException e){
                     System.out.println("Error en el formato de entrada");
                    }

                    break;
                
                case 3:
                    try{
                        System.out.println("Ingrese el limite inferior");
                        
                    }
            }



            if(opcionesMenu == 0){
                break;
            }
        
        }while(true);
        
        
    }
}
