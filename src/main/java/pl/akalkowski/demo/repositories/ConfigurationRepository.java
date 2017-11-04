package pl.akalkowski.demo.repositories;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.akalkowski.demo.models.Category;

@Configuration
public class ConfigurationRepository{

    @Bean
    public CategoryRepository categoryRepository() {
        CategoryRepository categoryRepository = new CategoryRepository();

        categoryRepository.add(new Category(1, "mems"));
        categoryRepository.add(new Category(2, "android"));
        categoryRepository.add(new Category(3, "sport"));
        categoryRepository.add(new Category(4, "funny"));

        return categoryRepository;
    }


}
