package br.com.edmar;

import org.junit.Test;

import br.com.edmar.dao.CursoDao;
import br.com.edmar.dao.ICursoDao;
import br.com.edmar.domain.Curso;

public class CursoTest {

	private ICursoDao cursoDao;
	
	public CursoTest() {
		cursoDao = new CursoDao();
	}

	@Test
	public void cadastrar() {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("TA DIFICIL");
		curso.setNome("Java");
		cursoDao.cadastrar(curso);
	}
}
