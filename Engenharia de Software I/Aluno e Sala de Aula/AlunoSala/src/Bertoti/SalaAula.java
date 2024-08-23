package Bertoti;
import java.util.List;
import java.util.LinkedList;
public class SalaAula {
    private List<Aluno> alunos = new LinkedList<Aluno>();
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public List<Aluno> buscarAlunoPorNome(String nome){
        List<Aluno> encontrados = new LinkedList<Aluno>();
        for (Aluno aluno: alunos){
            if(aluno.getNome().equals(nome))encontrados.add(aluno);
        }
        return encontrados;

    }


}
