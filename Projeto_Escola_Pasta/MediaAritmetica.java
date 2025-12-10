package Projeto_Escola_Pasta;

public class MediaAritmetica implements CalcularMedia{

    @Override
    public double calcular(double n1, double n2){
        double soma = n1 + n2;
        double mediaAritmetica = soma / 2;

        return mediaAritmetica;
    }
}
