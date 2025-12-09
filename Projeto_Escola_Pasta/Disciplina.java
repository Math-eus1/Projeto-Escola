package Projeto_Escola_Pasta;

public class Disciplina {
    
    private String nome_disciplina;
    private double n1;
    private double n2;
    private double media;
    private String aprovacao;

    public String getNome_disciplina() {
        return nome_disciplina;
    }
    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }
    public double getN1() {
        return n1;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public String getAprovacao() {
        if (media >= 7.0){
            aprovacao = "aprovado";
        }else{
            aprovacao = "reprovado";
        }
        return aprovacao;
    }

}
