package ua.lviv.lgs.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bucket")
public class Bucket {
	
	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "userId", referencedColumnName = "id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "productId", referencedColumnName = "id")
	private Product product;
	
	@Column
	private Date nowDate;

	public Bucket() {
	}

	public Bucket(User user, Product product, Date nowDate) {
		this.user = user;
		this.product = product;
		this.nowDate = nowDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Date getNowDate() {
		return nowDate;
	}

	public void setNowDate(Date nowDate) {
		this.nowDate = nowDate;
	}

	@Override
	public String toString() {
		return "Bucket [id=" + id + ", user=" + user + ", product=" + product + ", nowDate=" + nowDate + "]";
	}



	
}
