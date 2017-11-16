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

        categoryRepository.add(new Category(1L, "mems"));
        categoryRepository.add(new Category(2L, "android"));
        categoryRepository.add(new Category(3L, "sport"));
        categoryRepository.add(new Category(4L, "funny"));

        return categoryRepository;
    }

    @Bean
    public GifRepository gifRepository(CategoryRepository categoryRepository){
        GifRepository gifRepository = new GifRepository();
        gifRepository.add( new Gif( 1L, "android-explosion", true , categoryRepository.findById( 1L )) );
        gifRepository.add( new Gif( 2L, "ben-and-mike", false,categoryRepository.findById( 4L )) );
        gifRepository.add( new Gif( 3L, "book-dominos", false,categoryRepository.findById( 4L ) ));
        gifRepository.add( new Gif( 4L, "compiler-bot", true,categoryRepository.findById( 2L )) );
        gifRepository.add( new Gif( 5L, "cowboy-coder", false,categoryRepository.findById( 3L )) );
        gifRepository.add( new Gif( 6L, "infinite-andrew", false,categoryRepository.findById( 2L )) );
        return gifRepository;
    }


}
