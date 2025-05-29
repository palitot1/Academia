package Guia_academia.model;


import java.util.ArrayList;
import java.util.List;

public class FichaTreino {
    private List<String> exercicios = new ArrayList<>();

    public void adicionarExercicio(String exercicio) {
        exercicios.add(exercicio);
    }

    public List<String> getExercicios() {
        return exercicios;
    }
}

