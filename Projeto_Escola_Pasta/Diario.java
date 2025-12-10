package Projeto_Escola_Pasta;

public class Diario {

    private String codigo;
    
    Professor professor = new Professor();
    Aluno aluno = new Aluno();
    Disciplina disciplina = new Disciplina();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    
}
