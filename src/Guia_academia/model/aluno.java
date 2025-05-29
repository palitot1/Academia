package Guia_academia.model;

public class Aluno {
    private String nome;
    private String cpf;
    private Plano plano;
    private FichaTreino ficha;

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public Plano getPlano() { return plano; }
    public FichaTreino getFicha() { return ficha; }

    public void setPlano(Plano plano) { this.plano = plano; }
    public void setFicha(FichaTreino ficha) { this.ficha = ficha; }
}
