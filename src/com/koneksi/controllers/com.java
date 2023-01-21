package com.koneksi.controllers;

import java.sql.DriverManager;
import java.sql.Connection;
//import java.sql.Statement;
//import java.sql.ResultSet;
//import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;

public class com {

	public static void main(String[] args) {
		Connection con =null;
        try {
            String url ="jdbc:mysql://localhost:8889/chat";
            String user="admin";
            String pass="updatedata";
            String name="com.mysql.cj.jdbc.Driver";
            Class.forName(name);
            con =(Connection)DriverManager.getConnection(url,user,pass);
            if(con!=null) {
                System.out.println("koneksi berhasil");
            }
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }


	}

}
