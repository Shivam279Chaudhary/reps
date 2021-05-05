package com.project.interfaces;

import java.util.List;

import com.project.entity.Category;
import com.project.exception.InvalidID;

public interface ICategoryDAO {
	public boolean insertCategory(Category category);

	public List<Category> getAllCategory();

	public Category getCategoryById(int categoryId);

	public boolean removeCategory(int categoryID) ;

	public boolean updateCategory(Category category);
}
