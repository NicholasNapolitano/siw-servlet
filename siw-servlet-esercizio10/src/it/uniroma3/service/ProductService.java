package it.uniroma3.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import it.uniroma3.model.Prodotto;
import it.uniroma3.repository.ProductRepository;

public class ProductService {
	
	private EntityManager em;

	public ProductService() {
		
	}
	
	public Prodotto inserisciProdotto(Prodotto prodotto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("esercitazione-unit");
		this.em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(prodotto);
		tx.commit();
		em.close();
		emf.close();
		return prodotto;
	}

	public List<Prodotto> getProdotti() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("esercitazione-unit");
		this.em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		TypedQuery<Prodotto> query = em.createNamedQuery("findAll", Prodotto.class);
		List<Prodotto> prodotti = query.getResultList();
		tx.commit();
		return prodotti;
	}
	
	public Prodotto getOneProduct(Long id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("esercitazione-unit");
		this.em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Prodotto prodotto = em.find(Prodotto.class, id);
		tx.commit();
		return prodotto;
	}
	
	public void delete(Long id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("esercitazione-unit");
		this.em = emf.createEntityManager();
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		ProductRepository pr = new ProductRepository(this.em);
		Prodotto prodotto = pr.findOne(id);
		pr.delete(prodotto);
		tx.commit();
		em.close();
		emf.close();
	}

}
