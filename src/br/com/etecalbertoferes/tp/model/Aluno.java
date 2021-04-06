package br.com.etecalbertoferes.tp.model;

public class Aluno {
    String nome;
    String ra;

    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    @Override
    public String toString() {        
        return "Aluno{ra: "+ra+", nome="+nome+"}";
    }
}
