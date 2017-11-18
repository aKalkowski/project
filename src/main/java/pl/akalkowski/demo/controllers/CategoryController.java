package pl.akalkowski.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akalkowski.demo.form.CategoryForm;
import pl.akalkowski.demo.models.Category;
import pl.akalkowski.demo.repositories.CategoryCRUDRepository;
import pl.akalkowski.demo.repositories.GifRepository;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryCRUDRepository categoryCRUDRepository;
    @Autowired
    GifRepository gifRepository;

    @GetMapping("")
    public String showAllCategories(ModelMap modelMap) {
        modelMap.addAttribute("categories", categoryCRUDRepository.findAll());
        return "categories";
    }
//    @GetMapping("/category/{id}")
//    String c(@PathVariable Long id, ModelMap modelMap){
//        modelMap.addAttribute( "category", categoryRepository.findById( id ) );
//
//        return "category";
//    }
//    @GetMapping("searchCategory")
//    String searchCaregory(@RequestParam String q, ModelMap modelMap){
//        if((categoryRepository.searchCategory( q )==null)) {
//            modelMap.addAttribute( "comment", "This category don't exists" );
//        }else {
//            List<Category> categories = new ArrayList<>(  );
//            categories.add( (Category) categoryRepository.searchCategory( q ) );
//            modelMap.addAttribute( "categories", categories );
//
//        }
//    return "categories";
    @GetMapping("addcategory")
    public String addCategory(Model model){
        model.addAttribute( "name", new CategoryForm(  ) );
        return "add-category";
    }
    @PostMapping("/addcategory")
    public String addCategory(@RequestParam("name") String name, Model model)
    {
        categoryCRUDRepository.save(new Category(name));
        System.out.println();
        System.out.println("Dodano nową kategorie");
        return "add-category";
    }
    }

