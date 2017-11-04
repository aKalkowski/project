package pl.akalkowski.demo.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.akalkowski.demo.model.Gif;

/**
 * Created by monik on 04.11.2017.
 */
@Configuration
public class ConfigurationRepository {

    @Bean
    public GifRepository gifRepository(){
        GifRepository gifRepository = new GifRepository();
        gifRepository.add( new Gif( 1L, "android-explosion", true) );
        gifRepository.add( new Gif( 1L, "ben-and-mike", false) );
        gifRepository.add( new Gif( 1L, "book-dominos", false) );
        gifRepository.add( new Gif( 1L, "compiler-bot", true) );
        gifRepository.add( new Gif( 1L, "cowboy-coder", false) );
        gifRepository.add( new Gif( 1L, "infinite-andrew", false) );
        return gifRepository;
    }

}
