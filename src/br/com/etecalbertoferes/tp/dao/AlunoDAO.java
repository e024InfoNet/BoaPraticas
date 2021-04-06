package br.com.etecalbertoferes.tp.dao;

import br.com.etecalbertoferes.tp.model.Aluno;
import br.com.etecalbertoferes.tp.model.Curso;

import java.util.List;

public interface AlunoDAO {
    Aluno salvar(Aluno aluno);
    Aluno buscarPorRM(Integer rm);
    List<Aluno> buscarTodos();
    Aluno altualizar(Aluno aluno);
    void removerPoRM(Integer rm);
    void matricular(Aluno aluno, Curso curso);
}
