package domain;

import domain.Product;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: HouseHold
 *
 */
@Entity

public class HouseHold extends Product implements Serializable {

	
	private String parfum;
	private static final long serialVersionUID = 1L;

	public HouseHold() {
		super();
	}   
	public String getParfum() {
		return this.parfum;
	}

	public void setParfum(String parfum) {
		this.parfum = parfum;
	}
   
}
