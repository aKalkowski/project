package pl.akalkowski.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.akalkowski.demo.models.Category;

import java.util.List;

/**
 * Created by monik on 17.11.2017.
 */
@Repository
public interface CategoryCRUDRepository extends CrudRepository<Category,Long> {
    public List<Category> findAll();
}
