package com.tw.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;

@WebServlet(urlPatterns = {"/upload"})
@MultipartConfig
public class FileUploadServlet extends HttpServlet{
    private String path = "src/main/resources";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/fileUpload.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        processFileUpload(request, response);

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/fileUpload.jsp");
        requestDispatcher.forward(request, response);
    }

    private void processFileUpload(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        Part filePart = request.getPart("file");
        String fileName = getFileName(filePart);

        OutputStream out = null;
        InputStream filecontent = null;

        try {
            File file = new File(path + File.separator + fileName);
            out = new FileOutputStream(file);
            filecontent = filePart.getInputStream();
            int read;
            byte[] bytes = new byte[1024];
            while ((read = filecontent.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            request.setAttribute("uploadMessage", "New File "+fileName+" created at"+path);

        } catch (FileNotFoundException fne) {
            request.setAttribute("uploadMessage", "ERROR: You either did not specify a file to upload or are trying to upload a file to a protected or nonexistent location.");

        } finally {
            if (out != null) {
                out.close(); }
            if (filecontent != null) {
                filecontent.close();
            }
        }
    }

    private String getFileName(final Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }

}
