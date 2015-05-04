package services.interfaces;

import javax.ejb.Local;

import domain.Category;
import domain.Product;
import domain.User;

@Local
public interface MarketServicesLocal {
	Boolean addProduct(Product product);

	Boolean addCategory(Category category);

	Boolean addUser(User user);

}
