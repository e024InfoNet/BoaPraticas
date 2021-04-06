package br.com.etecalbertoferes.tp.services;

import br.com.etecalbertoferes.tp.model.Aluno;
import br.com.etecalbertoferes.tp.model.Curso;

import java.util.List;

public interface AlunoService {
    Aluno criar(Aluno aluno);
    Aluno buscarAluno(Integer rm);
    void matricular(Aluno aluno, Curso curso);
}
