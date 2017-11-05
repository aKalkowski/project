package pl.akalkowski.demo.repositories;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.akalkowski.demo.models.Category;
import pl.akalkowski.demo.models.Gif;

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

    @Bean
    public GifRepository gifRepository(){
        GifRepository gifRepository = new GifRepository();
        gifRepository.add( new Gif( 1L, "android-explosion", true) );
        gifRepository.add( new Gif( 2L, "ben-and-mike",  false) );
        gifRepository.add( new Gif( 3L, "book-dominos",  false) );
        gifRepository.add( new Gif( 4L, "compiler-bot",  true) );
        gifRepository.add( new Gif( 5L, "cowboy-coder",  false) );
        gifRepository.add( new Gif( 6L, "infinite-andrew",  false) );
        return gifRepository;
    }


}
