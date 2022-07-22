package src.application;

import src.db.DB;
import src.model.entities.Department;
import src.model.entities.Seller;

import java.sql.Connection;
import java.util.Date;
import java.util.GregorianCalendar;

public class Program {
    public static void main(String[] args)
    {
        Connection conn = DB.getConnection();
        DB.closeConnection();

        Department dep = new Department(1, "leo");
        Seller sell = new Seller(1, "Leo","leozin.com", new Date(), 300.00, dep);

        System.out.println("O obj Seller é: " + sell);

        DB.closeConnection();

    }
}
