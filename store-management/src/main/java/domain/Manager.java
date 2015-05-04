package domain;

import domain.User;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Manager
 *
 */
@Entity

public class Manager extends User implements Serializable {

	
	private String accessLevel;
	private static final long serialVersionUID = 1L;

	public Manager() {
		super();
	}   
	public String getAccessLevel() {
		return this.accessLevel;
	}

	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}
   
}
