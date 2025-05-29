package Guia_academia.model;


public class Plano {
    private String nome;
    private String tipo;
    private boolean ativo;

    public Plano(String nome, String tipo, boolean ativo) {
        this.nome = nome;
        this.tipo = tipo;
        this.ativo = ativo;
    }

    public String getNome() { return nome; }
    public String getTipo() { return tipo; }
    public boolean isAtivo() { return ativo; }
}

