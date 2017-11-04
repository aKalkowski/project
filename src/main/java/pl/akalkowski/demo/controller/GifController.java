package pl.akalkowski.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akalkowski.demo.repository.GifRepository;

/**
 * Created by monik on 04.11.2017.
 */
@Controller
public class GifController {
    @Autowired
    GifRepository gifRepository;

    @GetMapping("/")
    String home(ModelMap modelMap){
        modelMap.addAttribute( "gifs", gifRepository.findAll() );
        return "home";
    }

}
