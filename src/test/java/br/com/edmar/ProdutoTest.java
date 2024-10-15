package br.com.edmar;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.edmar.dao.IProdutoDao;
import br.com.edmar.dao.ProdutoDao;
import br.com.edmar.domain.Produto;

public class ProdutoTest {
	
	private IProdutoDao produtoDao;
	
	public ProdutoTest() {
		produtoDao = new ProdutoDao();
	}

	@Test
	public void cadastrar() {
		Produto prod = new Produto();
		prod.setCodigo("A123");
		prod.setNome("Presunto");
		prod.setDescricao("Bem gorduroso");
		prod = produtoDao.cadastrar(prod);
		
		assertNotNull(prod);
		assertNotNull(prod.getId());
	}
}
