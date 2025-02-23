package com.example.jsp_summary_with_crud.Servlets;

import com.example.jsp_summary_with_crud.Entity.Customer;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="CustomerListServlet", value="/customer-list")
public class CustomerListServlet extends HttpServlet {
    String DB_URL = "jdbc:mysql://localhost:3306/customerdb";
    String DB_USER="root";
    String DB_PASSWORD="1234";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer>customerList=new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(
              DB_URL,
              DB_USER,
              DB_PASSWORD
            );
            String sql="SELECT*From customer";
            Statement stm=connection.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            while(rst.next()){
                Customer customer=new Customer(
                  rst.getInt(1),
                  rst.getString(2),
                  rst.getString(3),
                  rst.getString(4)
                );
                customerList.add(customer);

            }
            // Attaches the customers list to the request object, making it accessible in the JSP.
            req.setAttribute("customers", customerList);

            // Used to forward the request to jsp file
            RequestDispatcher rd = req.getRequestDispatcher("customer-list.jsp");

            // Sends the request and response objects to the specified JSP for rendering
            rd.forward(req, resp);

        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect(
                    "customer-list.jsp?error=Failed to retrieve customers"
            );
        }

    }
}
