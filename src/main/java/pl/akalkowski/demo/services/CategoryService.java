package pl.akalkowski.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.akalkowski.demo.models.Category;
import pl.akalkowski.demo.repositories.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;



    public List<Category> showAll() {
        return categoryRepository.showAll();
    }
}
