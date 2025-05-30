package Guia_academia.service;



import Guia_academia.model.Aluno;
import Guia_academia.model.FichaTreino;
import Guia_academia.model.Plano;
import Guia_academia.repository.AlunoRepository;

/*Aqui usamos o repositório para acessar os dados dos alunos.*/

public class AcademiaService {
    private AlunoRepository repo = new AlunoRepository();

    public void cadastrarAluno(String nome, String cpf) {
        Aluno aluno = new Aluno(nome, cpf);
        repo.salvar(aluno);
    }

    public void atribuirPlano(String cpf, Plano plano) {
        Aluno aluno = repo.buscarPorCpf(cpf);
        if (aluno != null) {
            aluno.setPlano(plano);
        }
    }

    public void adicionarFicha(String cpf, FichaTreino ficha) {
        Aluno aluno = repo.buscarPorCpf(cpf);
        if (aluno != null) {
            aluno.setFicha(ficha);
        }
    }

    public Aluno consultarAluno(String cpf) {
        return repo.buscarPorCpf(cpf);
    }
}
