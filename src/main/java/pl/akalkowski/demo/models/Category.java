package pl.akalkowski.demo.models;

import org.hibernate.annotations.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import pl.akalkowski.demo.form.CategoryForm;
import pl.akalkowski.demo.repositories.CategoryRepository;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id



    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;

    public Category() {
    }
    public Category(String name){
        this.name=name;
    }
    public Category(CategoryForm form){
        name=form.getName();
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
