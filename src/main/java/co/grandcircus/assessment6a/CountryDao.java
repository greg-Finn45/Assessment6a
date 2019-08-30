package co.grandcircus.assessment6a;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CountryDao {

@PersistenceContext
EntityManager em;
			
		public List<Country> findAll(){
			List<Country> countries = em.createQuery("FROM Country", Country.class)
			.getResultList();
			return countries;
		}
		
//		public List<Restaurant> findAll(){
//			return em.createQuery("FROM Restaurant", Restaurant.class).getResultList();
//		}
		
		//find specific Product with its unique ID
		
		public void create(Country country) {
			em.persist(country);
		}
		
		public void update(Country country) {
			em.merge(country);
		}
		
		public void delete(Long id) {
			Country country = em.getReference(Country.class, id);
			em.remove(country);
		}
		
		
		
	}
	

