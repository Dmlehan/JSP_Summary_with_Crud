package com.example.jsp_summary_with_crud.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet(name="CustomerSaveServlet", value="/customer-save")
public class CustomerSaveServlet extends HttpServlet {
    String Db_URL="jdbc:mysql://localhost:3306/customerdb1";
    String DB_USER="root";
    String DB_PASSWORD="1234";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        String name=req.getParameter("customer_name");
        String address=req.getParameter("customer_address");
        String email=req.getParameter("customer_email");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    Db_URL,
                    DB_USER,
                    DB_PASSWORD
            );
            String sql="INSERT INTO customer(name,address,email) VALUES (?,?,?)";
            PreparedStatement pstm=connection.prepareStatement(sql);
            pstm.setString(1,name);
            pstm.setString(2,address);
            pstm.setString(3,email);
            int effectedRowCount=pstm.executeUpdate();
            if(effectedRowCount>0) {
                resp.sendRedirect(
                        "customer-save.jsp?message=Customer saved successfully"
                );

            }else{
                    resp.sendRedirect(
                            "customer-save.jsp?error=Fail to save customer"

                    );

                }

        }catch (Exception e){
            e.printStackTrace();
            resp.sendRedirect(
                    "customer-save.jsp?error=Fail to save customer"

            );
        }

    }
}
