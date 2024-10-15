package br.com.edmar.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.edmar.domain.Produto;

public class ProdutoDao implements IProdutoDao {

	@Override
	public Produto cadastrar(Produto prod) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(prod);
		entityManager.getTransaction().commit();
		
		entityManager.clear();
		entityManagerFactory.close();
		
		return prod;
	}

}
