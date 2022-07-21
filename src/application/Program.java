package src.application;

import src.db.DB;
import src.model.entities.Department;

import java.sql.Connection;

public class Program {
    public static void main(String[] args)
    {
        Connection conn = DB.getConnection();
        DB.closeConnection();

        Department dep = new Department(1, "leo");

        System.out.println(dep);

    }
}
