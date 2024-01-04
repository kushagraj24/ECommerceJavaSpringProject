package com.ECommerce.javaProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ECommerce.javaProject.dao.categoryDao;
import com.ECommerce.javaProject.models.Category;

/**
 * @author kushagra
 */
@Service
public class categoryService {
  @Autowired
  private categoryDao categoryDao;

  public Category addCategory(String name) {
    return this.categoryDao.addCategory(name);
  }

  public List<Category> getCategories() {
    return this.categoryDao.getCategories();
  }

  public Boolean deleteCategory(int id) {
    return this.categoryDao.deletCategory(id);
  }

  public Category updateCategory(int id, String name) {
    return this.categoryDao.updateCategory(id, name);
  }

  public Category getCategory(int id) {
    return this.categoryDao.getCategory(id);
  }
}
