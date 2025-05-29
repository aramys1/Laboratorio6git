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
        int limiteInferiorPrimos = 0;
        int limiteSuperiorPrimos = 0;
        double mayorMenor = 0;
        boolean bucleDeErrores = false;

        do{
            try{
            System.out.println("Que problema desea realizar?");
            System.out.println("1. Calcular el factorial de un numero \n2. Calcular la suma de los divisores de un numero\n3. Calcular la cantidad de numeros primos que hay entre dos numeros \n4. Encontrar el numero mas grande de una serie de numeros ingresados por el usuario \n0. Salir");
            opcionesMenu = Integer.parseInt(bufer.readLine());

            }catch(IOException e){
                System.out.println("Error al leer la entrada: ");
                continue;
            }
            catch(NumberFormatException e){
                System.out.println("Error en el formato de entrada");
                continue; 
            }

            
        
            switch (opcionesMenu){     
                case 1:
                    do{
                         System.out.println("Digite el numero al que desea calcular el factorial: ");
                        try{
                            factorial = Integer.parseInt(bufer.readLine());

                        }
                        catch(IOException e){
                            System.out.println("error al leer la entrada");
                            continue;
                            
                        }
                        catch(NumberFormatException e){
                            System.out.println("Error en el formato de entrada");
                            continue;
                            
                        }
                    }while(false);
        
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
                        limiteInferiorPrimos = Integer.parseInt(bufer.readLine());

                        System.out.println("Ingrese el limite superior");
                        limiteInferiorPrimos = Integer.parseInt(bufer.readLine());
                    }
                    catch(IOException e){
                        System.out.println("error al leer la entrada");
                    }
                    catch(NumberFormatException e){
                    System.out.println("Error en el formato de entrada");
                    }
                    break;
                case 4:
                    do{
                        try{
                            System.out.println("Ingrese un numero");
                            mayorMenor = Double.parseDouble(bufer.readLine());
                        }
                        catch(IOException e){
                        System.out.println("error al leer la entrada");
                        
                        }
                        catch(NumberFormatException e){
                        System.out.println("Error en el formato de entrada");
                        }

                        if(mayorMenor < 0){
                            break;
                        }
                        break;

                    }while(true);

                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo");
            }
        
            
            



            if(opcionesMenu == 0){
                break;
            }
        
        }while(true);
        
        
    }
}
