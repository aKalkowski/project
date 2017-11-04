package pl.akalkowski.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.akalkowski.demo.repositories.CategoryRepository;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("")
    public String showAllCategories(ModelMap modelMap) {
        modelMap.addAttribute("categories", categoryRepository.showAll());
        return "categories";
    }
}
