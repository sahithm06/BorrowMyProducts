package com.techhunters.borrowmyproducts.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Product_Location")
public class ProductLocation {
   
	@OneToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;
	
	@Column(name="longitude")
	private double longitude;
	
	@Column(name="latitude")
	private double latitude;
	
}
