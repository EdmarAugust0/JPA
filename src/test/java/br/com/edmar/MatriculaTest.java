package br.com.edmar;

import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import br.com.edmar.dao.IMatriculaDao;
import br.com.edmar.dao.MatriculaDao;
import br.com.edmar.domain.Matricula;

public class MatriculaTest {

	private IMatriculaDao matriculaDao;
	
	public MatriculaTest() {
		matriculaDao = new MatriculaDao();
	}
	
	@Test
	public void cadastar() {
		Matricula mat = new Matricula();
		mat.setCodigo("A1");
		mat.setDataMatricula(Instant.now());
		mat.setStatus("ATIVA");
		mat.setValor(2000D);
		mat = matriculaDao.cadastrar(mat);
		
		assertNotNull(mat);
		assertNotNull(mat.getId());
	}
}
