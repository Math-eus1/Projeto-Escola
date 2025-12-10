package Projeto_Escola_Pasta;
import java.util.*;

public class Diario {

    private String codigo;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<>();
    private CalcularMedia calcular;

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos(){
        return alunos;
    }

    public CalcularMedia getCalcular() {
        return calcular;
    }

    public void setCalcular(CalcularMedia calcular) {
        this.calcular = calcular;
    }
}
