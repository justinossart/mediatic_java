package com.iocean.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.iocean.model.Adherent;
import com.iocean.utilitaires.PersistenceManagerFactorySingleton;

public class AdherentDAO {

	public Adherent saveAdherent(Adherent adh){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(adh);
		em.getTransaction().commit();
		em.close();
		return adh;
	}
	
	public Adherent getAdherent(Long id){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		Adherent adh = em.find(Adherent.class, id);
		em.close();
		return adh;
	}
	
	public Adherent updateAdherent(Adherent adh){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(adh);
		em.getTransaction().commit();
		em.close();
		return adh;
	}
}
