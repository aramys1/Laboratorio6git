package Laboratorio6;

public class problema3 {
    //Bloque declarativo de atributos
    private int numerosPrimos;
    private int sumaNumerosPrimos;
    private int limiteInferior;
    private int limiteSuperior;
    private int limiteInferiorImprimir;
    private boolean primo;


    //Bloque de Instrccionesc
    public void calcularNumerosPrimos(int limiteInferior, int limiteSuperior) {
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
                System.out.println(limiteInferiorImprimir);
                sumaNumerosPrimos += limiteInferiorImprimir;
                numerosPrimos++;
            }
        }
    }

    
    
}
