package Laboratorio6;

public class problema3 {
    //Bloque declarativo de atributos
    private int numerosPrimos;
    private int sumaNumerosPrimos;
    private int limiteInferior;
    private int limiteSuperior;
    private int limiteInferiorImprimir;
    private int limiteInferiorOriginal;
    private boolean primo;

    //Constructor
    public problema3(int limiteInferior, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }

    //Bloque de Instrccionesc
    public void calcularNumerosPrimos() {
        limiteInferiorOriginal = this.limiteInferior;
        while (limiteInferior < limiteSuperior -1) {
            limiteInferior++;
            limiteInferiorImprimir = limiteInferior;
            primo = true;
            for(int i = 2; i <= Math.sqrt(limiteInferior); i++) {
                if (limiteInferior % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println("\n"+limiteInferiorImprimir);
                sumaNumerosPrimos += limiteInferiorImprimir;
                numerosPrimos++;
            }
        }
        if(numerosPrimos == 0) {
            System.out.println("\nNo hay numeros primos entre " + limiteInferiorOriginal + " y " + limiteSuperior + "\n");
        } else {
            System.out.println("\nEsa es la lista de numeros primos entre " + limiteInferiorOriginal + " y " + limiteSuperior);
            System.out.println("La cantidad de numeros primos es: " + numerosPrimos);
            System.out.println("La suma de los numeros primos es: " + sumaNumerosPrimos + "\n");
            
        }
    }

    
    
}
