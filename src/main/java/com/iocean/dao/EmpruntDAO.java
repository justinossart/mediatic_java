package com.iocean.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import com.iocean.model.Adherent;
import com.iocean.model.Emprunt;
import com.iocean.utilitaires.PersistenceManagerFactorySingleton;

public class EmpruntDAO {

	/**
	 * creer un emprunt
	 * @param ept
	 * @return ept Emprunt
	 */
	public Emprunt saveEmprunt(Emprunt ept){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(ept);
		em.getTransaction().commit();
		em.close();
		return ept;
	}

	/**
	 * recupere un emprunt par id
	 * @param id
	 * @return ept Emprunt
	 */
	public Emprunt getEmprunt(Long id){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		Emprunt ept = em.find(Emprunt.class, id);
		em.close();
		return ept;
	}
	
	/**
	 * update emprunt
	 * @param ept
	 * @return
	 */
	public Emprunt updateAdherent(Emprunt ept){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(ept);
		em.getTransaction().commit();
		em.close();
		return ept;
	}
	
	
	/**
	 * recuper tous les emprunts
	 */
	public List<Emprunt> getAllEmprunt(){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		TypedQuery<Emprunt> queryGetAll = em.createQuery(
				"select e from emprunt e", Emprunt.class);
		List<Emprunt> allEmprunt = queryGetAll.getResultList();
		em.close();
		return allEmprunt;
	}
	
	/**
	 * supprimer un emprunt
	 */
	public void removeEmprunt(Long id){
		
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		Emprunt ept = em.find(Emprunt.class, id);
		em.remove(ept);
		em.close();
	}
}
