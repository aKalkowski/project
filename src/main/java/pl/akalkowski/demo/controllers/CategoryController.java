package pl.akalkowski.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.akalkowski.demo.repositories.CategoryRepository;
import pl.akalkowski.demo.repositories.GifRepository;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    GifRepository gifRepository;

    @GetMapping("")
    public String showAllCategories(ModelMap modelMap) {
        modelMap.addAttribute("categories", categoryRepository.showAll());
        return "categories";
    }

    @GetMapping("/")
    String searchByCategoryName(@RequestParam(value = "q", required = false) String q, ModelMap modelMap) {
        if (q != null) {
            modelMap.addAttribute("categories", categoryRepository.findByName(q));
        } else {
            modelMap.addAttribute("categories", categoryRepository.showAll());
        }
        return "categories";
    }
}
