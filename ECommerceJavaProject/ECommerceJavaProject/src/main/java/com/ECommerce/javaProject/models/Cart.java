package com.ECommerce.javaProject.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


/**
 * @author kushagra
 */
@Entity(name = "CART")
public class Cart {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @ManyToOne
  @JoinColumn(name = "customer_id")
  private User customer;

  @ManyToMany
  @JoinTable(joinColumns = @JoinColumn(name = "cart_id"),
      inverseJoinColumns = @JoinColumn(name = "product_id"))
  private List<Product> products;


  public Cart() {
    products = new ArrayList<>();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public User getCustomer() {
    return customer;
  }

  public void setCustomer(User customer) {
    this.customer = customer;
  }

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  public void addProduct(Product product) {
    products.add(product);
  }

  public void removeProduct(Product product) {
    products.remove(product);
  }
}
