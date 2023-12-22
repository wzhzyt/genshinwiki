package com.action;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@WebServlet(name = "add_pictureServlet", value = "/add_pictureServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10,      // 10MB
        maxRequestSize = 1024 * 1024 * 50)   // 50MB
public class add_pictureServlet extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Part filePart = request.getPart("image");
            String fileName = getSubmittedFileName(filePart);

            //String uploadPath = "D:\\86159\\Desktop\\GenshinWIKI_web (1)\\web\\观测·Wiki\\img\\avatar";
            //String uploadPath = getServletContext().getRealPath("GenshinWiki_web/web/观测·Wiki/img/avatar");
            //String uploadPath = "GenshinWiki_web/web/观测·Wiki/img/avatar/";
            // 获取Web应用程序的根路径
            //String appPath = getServletContext().getRealPath("/");

            // 构建相对路径
            //String relativePath = "web/观测·Wiki/img/avatar/";
            String uploadPath_out = getServletContext().getRealPath("/观测·Wiki/img/avatar");
            String uploadPath_local = "D:\\Desktop\\class_study\\数据库\\GenshinWIKI_web_pro_plus\\web\\观测·Wiki\\img\\avatar";
            // 构建绝对路径
            //String uploadPath = appPath + relativePath;
            System.out.println(uploadPath_out);
            System.out.println(uploadPath_local);
            //if (!uploadDir.exists()) {
            //    uploadDir.mkdirs();
            //}
            Path filePath1 = Paths.get(uploadPath_out, fileName);
            try (InputStream input = filePart.getInputStream()) {
                Files.copy(input, filePath1, StandardCopyOption.REPLACE_EXISTING);
            }
            Path filePath2 = Paths.get(uploadPath_local, fileName);
            try (InputStream input = filePart.getInputStream()) {
                Files.copy(input, filePath2, StandardCopyOption.REPLACE_EXISTING);
            }

            response.getWriter().println("File uploaded successfully!");
            response.setCharacterEncoding ("UTF-8");
            String encodedParam = java.net.URLEncoder.encode("管理员界面", "UTF-8");
            // 重定向到另一个网址
            response.sendRedirect("/GenshinWIKI_web_war_exploded/" + encodedParam+ "/add_picture.html");
        }

    // 从 Part 获取上传的文件名
    private String getSubmittedFileName(Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }
}

