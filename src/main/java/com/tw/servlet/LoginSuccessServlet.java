package com.tw.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/loginSuccess")
public class LoginSuccessServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/loginSuccess.jsp");
        HttpSession httpSession = request.getSession();
        String userId = (String) httpSession.getAttribute("userId");
        PrintWriter out= response.getWriter();
        out.println("<p>"+userId+"</p>");
        requestDispatcher.include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
