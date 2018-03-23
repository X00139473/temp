package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Category extends Model {

    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @OneToMany
    private List<Product> products;

    public Category(){

    }

    public Category(Long id, String name, List<Product> products){
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public static Finder<Long, Category> find = new Finder<Long, Category>(Category.class);

    public static List<Category> findAll(){
        return Category.find.query().where().orderBy("name asc").findList();
    }

    public static Map<String, String> options(){
        LinkedHashMap<String, String> options = new LinkedHashMap<>();

        // Gets all categories from the DB and adds them to the options Hash Map
        for(Category c: Category.findAll()) {
            options.put(c.getId().toString(), c.getName());
        }

        return options;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<Product> getProducts(){
        return products;
    }

    public void setProducts(List<Product> products){
        this.products = products;
    }

}