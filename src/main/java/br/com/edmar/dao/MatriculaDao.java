package br.com.edmar.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.edmar.domain.Matricula;

public class MatriculaDao implements IMatriculaDao {

	@Override
	public Matricula cadastrar(Matricula mat) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(mat);
		entityManager.getTransaction().commit();
		
		entityManager.clear();
		entityManagerFactory.close();
		
		return mat;
	}

}
