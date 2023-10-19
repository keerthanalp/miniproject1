package com.lulu.Miniproject_MS1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	 @Id
	    int id;
	    String name;
	    float cost;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getCost() {
			return cost;
		}
		public void setCost(float cost) {
			this.cost = cost;
		}
		@Override
		public String toString() {
			return "SportProduct [id=" + id + ", name=" + name + ", cost=" + cost + "]";
		}
		public Product(int id, String name, float cost) {
			super();
			this.id = id;
			this.name = name;
			this.cost = cost;
		}
		public Product() {
			super();
		}
	  
}
