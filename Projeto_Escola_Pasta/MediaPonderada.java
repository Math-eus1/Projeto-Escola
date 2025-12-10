package Projeto_Escola_Pasta;

public class MediaPonderada implements CalcularMedia{

    @Override
    public double calcular(double n1, double n2){
        double mediaPonderada = (n1 * 0.4) + (n2 * 0.6);
        return mediaPonderada;
    }
}
