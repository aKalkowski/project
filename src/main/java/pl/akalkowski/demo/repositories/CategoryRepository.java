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
    public Category findById(Long id){
        for (Category category : categories) {
            if (category.getId().equals( id )) {
                return category;
            }
        }
        throw new IllegalArgumentException( "CategoryId not exist"+ id );
    }
    public Category getCategory(int id) {
        for (Category category : categories) {
            if (category.getId().equals(id)) {
                return category;
            }
        }
        return new Category();
    }
    public List<Category> searchCategory(String q){
        List<Category> categoryGift = new ArrayList<>(  );
        for(Category category:categories){
            if(category.getName().contains(q)){

            categoryGift.add( category );

        }
        return categoryGift;
        }
        return null;

    }
}
