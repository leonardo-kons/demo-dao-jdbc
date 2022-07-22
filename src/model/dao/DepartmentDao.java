package src.model.dao;

import src.model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert (Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    void findById(Integer id);
    List<Department> findAll();
}
