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
        long limiteInferiorPrimos = 0;
        long limiteSuperiorPrimos = 0;
        double mayorMenor = 0;

        do{
            try{
            System.out.println("Que problema desea realizar?");
            System.out.println("1. Calcular el factorial de un numero \n2. Calcular la suma de los digitos de un numero\n3. Calcular la cantidad de numeros primos que hay entre dos numeros \n4. Encontrar el numero mas grande de una serie de numeros ingresados por el usuario \n0. Salir");
            opcionesMenu = Integer.parseInt(bufer.readLine());

            }catch(IOException e){
                System.out.println("\nError al leer la entrada:\n");
                continue;
            }
            catch(NumberFormatException e){
                System.out.println("\nError en el formato de entrada\n");
                continue; 
            }

            
        
            switch (opcionesMenu){     
                case 1:
                    do{
                        System.out.print("Digite el numero al que desea calcular el factorial (menor a 50): ");
                        try{
                            factorial = Integer.parseInt(bufer.readLine());
                            if (factorial < 0){
                                System.out.println("\nUn numero factorial no puede ser negativo\n");
                            }else if (factorial >= 50){
                                System.out.println("\nEl numero es demasiado grande, por favor ingrese un numero menor a 50\n");
                            }else {
                                problema1 factoria = new problema1 (factorial);
                                factoria.calcular();
                                System.out.println("\nEl numero factorial de "+ factorial + " es " + factoria.calcular() + "\n");
                            }
                        }
                        catch(IOException e){
                            System.out.println("\nerror al leer la entrada\n");


                        }
                        catch(NumberFormatException e){
                            System.out.println("\nError en el formato de entrada\n");


                        }
                    }while(false);

                    break;
                case 2:
                    System.out.print("Digite el numero del cual quiera la suma de sus digitos:");
                    try{
                        sumaDigitos = Long.parseLong(bufer.readLine());
                        if ( sumaDigitos < 0) {
                            System.out.println("\nNo se puede calcular numeros negativos\n");
                        }else{
                            problema2 suma = new problema2(sumaDigitos);
                            suma.calcularSuma();
                            System.out.println("\nLa suma del digito ingresado  "+ sumaDigitos + " es " + suma.calcularSuma() + "\n");
                        }
                    }
                    catch(IOException e){
                        System.out.println("\nerror al leer la entrada\n");
                    }
                    catch(NumberFormatException e){
                        System.out.println("\nError en el formato de entrada\n");
                    }

                    break;
                
                case 3:
                    try {
                        System.out.print("\nIngrese el límite inferior (mayor o igual que 2):");
                        limiteInferiorPrimos = Long.parseLong(bufer.readLine());

                        System.out.print("Ingrese el límite superior (mayor que el inferior):");
                        limiteSuperiorPrimos = Long.parseLong(bufer.readLine());

                        if (limiteInferiorPrimos < 2) {
                            System.out.println("\nEl límite inferior debe ser mayor o igual que 2.\n");
                        } else if (limiteSuperiorPrimos <= limiteInferiorPrimos) {
                            System.out.println("\nEl límite superior debe ser mayor que el límite inferior.\n");
                        } else {
                            problema3 p = new problema3(limiteInferiorPrimos, limiteSuperiorPrimos);
                            p.calcularNumerosPrimos();
                        }

                    } catch (IOException e) {
                        System.out.println("\nError al leer la entrada.\n");
                    } catch (NumberFormatException e) {
                        System.out.println("\nError en el formato de entrada, introduzca un número entero.\n");
                    }
                    break;
                case 4:
                problema4 problema4 = new problema4();
                do {
                    try {
                        System.out.print("Ingrese un número (negativo para finalizar): ");
                        mayorMenor = Double.parseDouble(bufer.readLine());
                    } catch (IOException e) {
                        System.out.println("\nError al leer la entrada.\n");
                        continue;
                    } catch (NumberFormatException e) {
                        System.out.println("\nError en el formato de entrada.\n");
                        continue;
                    }

                    if (mayorMenor < 0) {
                        System.out.println("\nEl número mayor de la serie es: " + problema4.getNumeroMayor() + "\n");
                        break;
                    } else {
                        problema4.encontrarNumeroMayor(mayorMenor);
                    }

                } while (true);
                break;

                default:
                    if(opcionesMenu ==0){
                        break;
                    }
                    else{
                        System.out.println("\nOpcion no valida, por favor intente de nuevo\n");
                    }
                    
            }
            if(opcionesMenu == 0){
                break;
            }
        
        }while(true);
        
        
    }
}
