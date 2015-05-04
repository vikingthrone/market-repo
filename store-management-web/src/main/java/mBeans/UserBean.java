package mBeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import services.interfaces.MarketServicesLocal;
import domain.User;

@ManagedBean
@SessionScoped
public class UserBean {
	// models
	private User user = new User();
	// injection of the proxy
	@EJB
	private MarketServicesLocal marketServicesLocal;

	// methods
	public String doAddUser() {
		marketServicesLocal.addUser(user);
		return "";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
