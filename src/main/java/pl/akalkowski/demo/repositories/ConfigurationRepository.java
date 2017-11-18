package pl.akalkowski.demo.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.akalkowski.demo.models.Category;
import pl.akalkowski.demo.models.Gif;

@Configuration
public class ConfigurationRepository{

    @Autowired
    CategoryCRUDRepository categoryCRUDRepository;



    @Bean
    public GifRepository gifRepository(CategoryRepository categoryRepository){
        GifRepository gifRepository = new GifRepository();
        gifRepository.add( new Gif( 1L, "android-explosion", true , categoryCRUDRepository.findOne(1L)) );
        gifRepository.add( new Gif( 2L, "ben-and-mike", false,categoryCRUDRepository.findOne( 4L )) );
        gifRepository.add( new Gif( 3L, "book-dominos", false,categoryCRUDRepository.findOne( 4L ) ));
        gifRepository.add( new Gif( 4L, "compiler-bot", true,categoryCRUDRepository.findOne( 2L )) );
        gifRepository.add( new Gif( 5L, "cowboy-coder", false,categoryCRUDRepository.findOne( 3L)) );
        gifRepository.add( new Gif( 6L, "infinite-andrew", false,categoryCRUDRepository.findOne( 2L )) );
        return gifRepository;
    }




}
