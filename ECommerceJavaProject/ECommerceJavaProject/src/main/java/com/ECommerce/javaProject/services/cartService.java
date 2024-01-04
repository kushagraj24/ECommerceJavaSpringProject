package com.ECommerce.javaProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ECommerce.javaProject.dao.cartDao;
import com.ECommerce.javaProject.models.Cart;

/**
 * @author kushagra
 */
@Service
public class cartService {
  @Autowired
  private cartDao cartDao;

  public Cart addCart(Cart cart) {
    return cartDao.addCart(cart);
  }

  public List<Cart> getCarts() {
    return this.cartDao.getCarts();
  }

  public void updateCart(Cart cart) {
    cartDao.updateCart(cart);
  }

  public void deleteCart(Cart cart) {
    cartDao.deleteCart(cart);
  }



}
