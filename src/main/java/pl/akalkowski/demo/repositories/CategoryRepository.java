package pl.akalkowski.demo.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.akalkowski.demo.models.Category;
import pl.akalkowski.demo.models.Gif;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CategoryRepository {

    private CategoryCRUDRepository categoryCRUDRepository;

    @Autowired
    public CategoryRepository(CategoryCRUDRepository categoryCRUDRepository) {
        this.categoryCRUDRepository = categoryCRUDRepository;
    }

    public List<Category> categories = new ArrayList<>();



    public List<Category> showAll() {

        return categories;
    }

    public void add(Category category) {

        categories.add(category);
    }
    public Category findById(Integer id){
        for (Category category : categories) {
            if (category.getId().equals( id )) {
                return category;
            }
        }
        return null;
    }

    public List<Category> findByName(String name) {
        List<Category> categoryList = new ArrayList<>();
        for (Category category : categories) {
            if (category.getName().contains( name )) {
                categoryList.add(category);
            }
        }
        return categoryList;
    }

    public Category getCategory(int id) {
        for (Category category : categories) {
            if (category.getId().equals(id)) {
                return category;
            }
        }
        return new Category();
    }
    public Long getLastId(){
        return categories.get(categories.size()+1).getId();
    }




}
