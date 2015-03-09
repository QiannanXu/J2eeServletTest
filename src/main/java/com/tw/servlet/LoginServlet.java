package com.tw.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(
        urlPatterns = { "/login" },
        initParams = {
                @WebInitParam(name = "user", value = "admin"),
                @WebInitParam(name = "password", value = "admin")
        })
public class LoginServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/index.jsp");
        requestDispatcher.include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("user");
        String password = request.getParameter("password");

        String realUserId = getServletConfig().getInitParameter("user");
        String realPassword = getServletConfig().getInitParameter("password");

        if(userId.equals(realUserId) && password.equals(realPassword)){
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("userId", userId);
            response.sendRedirect("/loginSuccess");
        }else{
            doGet(request, response);
        }

    }

}
