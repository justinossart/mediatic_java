package com.iocean.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import com.iocean.model.Utilisateur;
import com.iocean.utilitaires.PersistenceManagerFactorySingleton;

public class UtilisateurDAO {
	
	public Utilisateur saveUtilisateur(Utilisateur utilisateur){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(utilisateur);
		em.getTransaction().commit();
		em.close();
		return utilisateur;
	}
	
	public Utilisateur getUtilisateur(Long id){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		Utilisateur utilisateur = em.find(Utilisateur.class, id);
		em.close();
		return utilisateur;
	}
	
	public List<Utilisateur> getAllUtilisateur(){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		TypedQuery<Utilisateur> queryGetAll = em.createQuery(
				"select u from utilisateur u", Utilisateur.class);
		List<Utilisateur> allUtilisateurs = queryGetAll.getResultList();
		em.close();
		return allUtilisateurs;
	}
	
	public Utilisateur updateUtilisateur(Utilisateur utilisateur){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(utilisateur);
		em.getTransaction().commit();
		em.close();
		return utilisateur;
	}

}
