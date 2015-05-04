package domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: OrderLine
 *
 */
@Entity
public class OrderLine implements Serializable {

	private OrderLineId orderLineId;
	private Float quantity;
	private static final long serialVersionUID = 1L;

	private Product product;
	private Order order;

	public OrderLine() {
		super();
	}

	public Float getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}

	@EmbeddedId
	public OrderLineId getOrderLineId() {
		return orderLineId;
	}

	public void setOrderLineId(OrderLineId orderLineId) {
		this.orderLineId = orderLineId;
	}

	@ManyToOne
	@JoinColumn(name = "idProduct", referencedColumnName = "id", insertable = false, updatable = false)
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@ManyToOne
	@JoinColumn(name = "idOrder", referencedColumnName = "reference", insertable = false, updatable = false)
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderLine(Float quantity, Product product, Order order) {
		super();
		this.quantity = quantity;
		this.product = product;
		this.order = order;
		this.orderLineId=new OrderLineId(product.getId(), order.getReference());
	}
	

}
