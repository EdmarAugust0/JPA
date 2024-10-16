package br.com.edmar;

import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import br.com.edmar.dao.CursoDao;
import br.com.edmar.dao.ICursoDao;
import br.com.edmar.dao.IMatriculaDao;
import br.com.edmar.dao.MatriculaDao;
import br.com.edmar.domain.Curso;
import br.com.edmar.domain.Matricula;

public class MatriculaTest {

	private IMatriculaDao matriculaDao;
	
	private ICursoDao cursoDao;
	
	public MatriculaTest() {
		matriculaDao = new MatriculaDao();
		cursoDao = new CursoDao();
	}
	
	@Test
	public void cadastar() {
		Curso curso = criarCurso("A1");
		
		Matricula mat = new Matricula();
		mat.setCodigo("A1");
		mat.setDataMatricula(Instant.now());
		mat.setStatus("ATIVA");
		mat.setValor(2000D);
		mat.setCurso(curso);
		mat = matriculaDao.cadastrar(mat);
		
		assertNotNull(mat);
		assertNotNull(mat.getId());
	}
	
	private Curso criarCurso(String codigo) {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("TA DIFICIL");
		curso.setNome("Java");
		return cursoDao.cadastrar(curso);
	}
}
