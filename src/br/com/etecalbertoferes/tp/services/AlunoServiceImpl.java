package br.com.etecalbertoferes.tp.services;

import br.com.etecalbertoferes.tp.dao.AlunoDAO;
import br.com.etecalbertoferes.tp.model.Aluno;
import br.com.etecalbertoferes.tp.model.Curso;

import java.util.List;

public class AlunoServiceImpl implements AlunoService{

    private AlunoDAO dao;

    @Override
    public Aluno criar(Aluno aluno) {
        return dao.salvar(aluno);
    }

    @Override
    public Aluno buscarAluno(Integer rm) {
        return dao.buscarPorRM(rm);
    }

    @Override
    public void matricular(Aluno aluno, Curso curso) {
        // Mais código e validações
        dao.matricular(aluno, curso);
    }

    public void listarAlunos() {
        List<Aluno> alunos = dao.buscarTodos();
        System.out.println(alunos);
    }
}
