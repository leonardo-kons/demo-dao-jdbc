package src.model.dao;

import src.model.entities.Department;
import src.model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert (Seller obj);
    void update(Seller obj);
    void deleteById(Seller id);
    void findById(Seller id);
    List<Seller> findAll();
}
