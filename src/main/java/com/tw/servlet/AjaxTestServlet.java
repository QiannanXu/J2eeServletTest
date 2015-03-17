package com.tw.servlet;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/ajax"})
public class AjaxTestServlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html;charset=utf-8");
        String account = request.getParameter("account");

        JSONObject json = new JSONObject();

        JSONArray array = new JSONArray();
        JSONObject member = null;

            try {
                for (int i = 0; i < 3; i++) {
                    member = new JSONObject();
                    member.put("name", "xiaohua"+i);
                    member.put("age", 20+i);
                    array.put(member);

                    json.put("account", account);
                    json.put("jsonArray", array);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }


//        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/ajax.jsp");
//        requestDispatcher.forward(request, response);

        PrintWriter pw = response.getWriter();
        pw.print(json.toString());

        System.out.println("json array :" + array.toString());
        System.out.println("json object :"+json.toString());

        pw.close();

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        this.doGet(request, response);
    }
}
