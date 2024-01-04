package com.ECommerce.javaProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ECommerce.javaProject.dao.productDao;
import com.ECommerce.javaProject.models.Product;

/**
 * @author kushagra
 */
@Service
public class productService {
  @Autowired
  private productDao productDao;

  public List<Product> getProducts() {
    return this.productDao.getProducts();
  }

  public Product addProduct(Product product) {
    return this.productDao.addProduct(product);
  }

  public Product getProduct(int id) {
    return this.productDao.getProduct(id);
  }

  public Product updateProduct(int id, Product product) {
    product.setId(id);
    return this.productDao.updateProduct(product);
  }

  public boolean deleteProduct(int id) {
    return this.productDao.deletProduct(id);
  }


}
