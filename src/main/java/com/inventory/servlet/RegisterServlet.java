package com.inventory.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.UserDAO;
import com.inventory.model.User;
import com.inventory.util.DatabaseUtil;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    
    private UserDAO userDAO;
    
    @Override
    public void init() throws ServletException {
        try {
            userDAO = new UserDAO(DatabaseUtil.getConnection());
        } catch (Exception e) {
            throw new ServletException("Failed to initialize RegisterServlet", e);
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        System.out.println("Registration attempt - Username: " + username + ", Email: " + email);
        
        User user = new User(username, password, email);
        
        try {
            if (userDAO.registerUser(user)) {
                System.out.println("Registration successful for user: " + username);
                response.sendRedirect("login");
            } else {
                System.out.println("Registration failed for user: " + username);
                request.setAttribute("error", "Username already exists or registration failed");
                request.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(request, response);
            }
        } catch (Exception e) {
            System.err.println("Registration error: " + e.getMessage());
            request.setAttribute("error", "System error occurred. Please try again.");
            request.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(request, response);
        }
    }
} 