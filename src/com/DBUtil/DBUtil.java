package com.DBUtil;

import java.sql.*;

public class DBUtil {
    private Connection con;
    private Statement stmt;
    public DBUtil(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/genshinwiki", "root","123456");
            stmt = con.createStatement();
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
            throw  new RuntimeException(e);
        }
    }
    public void close(){
        try{
            if(!stmt.isClosed()) {
                stmt.close();
            }
            if(!con.isClosed()){
                con.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void executeUpdate(String sql){
        try{
            stmt.executeUpdate(sql);
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public  ResultSet executeQuery(String sql){
        try{
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public String getMaxIndex(String tableName) {
        String maxIndex = null;
        DBUtil dbUtil = new DBUtil();
        // 使用参数化查询来避免SQL注入
        String sql = "SELECT MAX(`index`) FROM " + tableName;
        ResultSet rs = dbUtil.executeQuery(sql);
        try {
            if (rs.next()) {
                maxIndex = rs.getString(1); // 获取第一列的值，即最大的index
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtil.close(); // 关闭数据库连接
        }
        return maxIndex;
    }

    public  String getIndex(String tableName, String UserId, String TeamId){
        String index = null;
        DBUtil dbUtil = new DBUtil();
        String sql = "SELECT `index` FROM " + tableName + " WHERE UserId = '" + UserId + "'";
        ResultSet rs = dbUtil.executeQuery(sql);
        try{
            if (rs.next()){
                index = rs.getString(1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            dbUtil.close();
        }
        return index;
    }
}

