package Projeto_Escola_Pasta;
import java.util.*;

public class Aluno extends Pessoa {

    private String matricula;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void addDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    
}
