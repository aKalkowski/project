package pl.akalkowski.demo.repositories;

import pl.akalkowski.demo.models.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {

    ConfigurationRepository configurationRepository;

    public List<Category> categories= new ArrayList<>();

    public Category category;

    public List<Category> showAll() {
        return categories;
    }

    public List<Category> findByName(String categoryName) {
        List<Category> categoryList = new ArrayList<>();
        for (Category c : categories) {
            if (c.getName().contains(categoryName)) {
                categoryList.add(c);
            }
        }
        return categoryList;
    }

    public void add(Category category) {
        categories.add(category);
    }
}
