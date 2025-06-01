package Laboratorio6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//comentario de prueba
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
                            
                            
                        }
                        catch(NumberFormatException e){
                            System.out.println("Error en el formato de entrada");
                            
                            
                        }
                        problema1 factoria = new problema1(factorial);
                        factoria.calcular();
                        System.out.println("El numero factorial de "+ factorial + " es " + factoria.calcular());
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
                    try {
                        System.out.print("\nIngrese el límite inferior (mayor o igual que 2):");
                        limiteInferiorPrimos = Integer.parseInt(bufer.readLine());

                        System.out.print("Ingrese el límite superior (mayor que el inferior):");
                        limiteSuperiorPrimos = Integer.parseInt(bufer.readLine());

                        if (limiteInferiorPrimos < 2) {
                            System.out.println("\nEl límite inferior debe ser mayor o igual que 2.\n");
                        } else if (limiteSuperiorPrimos <= limiteInferiorPrimos) {
                            System.out.println("\nEl límite superior debe ser mayor que el límite inferior.\n");
                        } else {
                            problema3 p = new problema3(limiteInferiorPrimos, limiteSuperiorPrimos);
                            p.calcularNumerosPrimos();
                        }

                    } catch (IOException e) {
                        System.out.println("Error al leer la entrada.");
                    } catch (NumberFormatException e) {
                        System.out.println("Error en el formato de entrada, introduzca un número.");
                    }
                    break;
                case 4:
                
                     problema4 objeto4;

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
                    objeto4 = new problema4(mayorMenor);

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
                            System.out.println("El numero mayor de la serie es:" + objeto4.getNumeroMayor());
                            break;
                        }
                        else{
                            objeto4.setNumeroIngresado(mayorMenor);
                            objeto4.encontrarNumeroMayor(mayorMenor);
                        }
                        
                        
                        
                    }while(true);
                    break;

                default:
                    if(opcionesMenu ==0){
                        break;
                    }
                    else{
                        System.out.println("Opcion no valida, por favor intente de nuevo");
                    }
                    
            }
        
            
            



            if(opcionesMenu == 0){
                break;
            }
        
        }while(true);
        
        
    }
}
