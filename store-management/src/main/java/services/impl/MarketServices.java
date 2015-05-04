package services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.interfaces.MarketServicesLocal;
import services.interfaces.MarketServicesRemote;
import domain.Category;
import domain.Product;
import domain.User;

/**
 * Session Bean implementation class MarketServices
 */
@Stateless
public class MarketServices implements MarketServicesRemote,
		MarketServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public MarketServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addProduct(Product product) {
		Boolean b = false;
		try {
			entityManager.persist(product);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean addCategory(Category category) {
		Boolean b = false;
		try {
			entityManager.persist(category);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean addUser(User user) {
		Boolean b = false;
		try {
			entityManager.persist(user);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
