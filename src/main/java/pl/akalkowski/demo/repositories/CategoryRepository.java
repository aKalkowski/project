package pl.akalkowski.demo.repositories;

import pl.akalkowski.demo.models.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {

    ConfigurationRepository configurationRepository;

    public List<Category> categories= new ArrayList<>();

    public List<Category> showAll() {
        return categories;
    }

    public void add(Category category) {
        categories.add(category);
    }
}
