package domain;

import domain.Product;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Beauty
 *
 */
@Entity

public class Beauty extends Product implements Serializable {

	
	private String type;
	private static final long serialVersionUID = 1L;

	public Beauty() {
		super();
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
   
}
