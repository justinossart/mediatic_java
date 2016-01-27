package com.iocean.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import com.iocean.model.Media;
import com.iocean.utilitaires.PersistenceManagerFactorySingleton;

public class MediaDAO {

	/**
	 * creer un media
	 * @param adh
	 * @return
	 */
	public Media createMedia(Media media){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(media);
		em.getTransaction().commit();
		em.close();
		return media;
	}
	
	/**
	 * recupere un media par id
	 * @param id
	 * @return
	 */
	public Media getAdherent(Long id){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		Media media = em.find(Media.class, id);
		em.close();
		return media;
	}
	
	
	
	/**
	 * update un media
	 * @param adh
	 * @return
	 */
	public Media updateAdherent(Media media){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(media);
		em.getTransaction().commit();
		em.close();
		return media;
	}
	
	
	/**
	 * recuper tous les medias
	 */
	public List<Media> getAllAdherent(){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		TypedQuery<Media> queryGetAll = em.createQuery(
				"select m from media m", Media.class);
		List<Media> listMedia = queryGetAll.getResultList();
		em.close();
		return listMedia;
	}
	
	
	
	/**
	 * supprimer un media
	 */
	public void removeAdherent(Long id){
		
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		Media media = em.find(Media.class, id);
		em.remove(media);
		em.close();
	}
	
		
}
