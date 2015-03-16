package com.tw.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(urlPatterns = {"/parameters"})
public class ParametersServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/parameters.jsp");
        requestDispatcher.forward(request, response);
    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("UTF-8");
//
//        Enumeration<String> parameterNames = request.getParameterNames();
//        while(parameterNames.hasMoreElements()){
//            String parameterName = parameterNames.nextElement();
//            String[] parameterValues = request.getParameterValues(parameterName);
//            if(parameterValues.length == 0){
//                request.setAttribute(parameterName, "No Value");
//            } else {
//                request.setAttribute(parameterName, parameterValues[0]);
//            }
//        }
//
//        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/parameters.jsp");
//        requestDispatcher.forward(request, response);
//    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String bookName = request.getParameter("bookName");
        String[] bookType = request.getParameterValues("bookType");

        String choosenBookType = "";
        for(int i=0; i<bookType.length; i++){
            choosenBookType += bookType[i]+" ";
        }
        request.setAttribute("bookName", bookName);
        request.setAttribute("bookType", choosenBookType);

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/parameters.jsp");
        requestDispatcher.forward(request, response);
    }
}
