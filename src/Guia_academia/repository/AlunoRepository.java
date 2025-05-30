package Guia_academia.repository;


import Guia_academia.model.Aluno;

import java.util.ArrayList;
import java.util.List;

/*Aqui criamos uma lista de alunos para simular um banco de dados.*/

public class AlunoRepository {
    private List<Aluno> alunos = new ArrayList<>();

    public void salvar(Aluno aluno) {
        alunos.add(aluno);
    }

    /*Adiciona um novo aluno na lista.*/

    public void remover(String cpf) {
        alunos.removeIf(a -> a.getCpf().equals(cpf));
    }

    public Aluno buscarPorCpf(String cpf) {
        for (Aluno a : alunos) {
            if (a.getCpf().equals(cpf)) {
                return a;
            }
        }
        return null;
    }

    public List<Aluno> listarTodos() {
        return alunos;
    }
}

