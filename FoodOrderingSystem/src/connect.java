
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD FASEEH
 */
public class connect {
    public Connection c;
    public Statement s;
    public connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///foodorderingsystem","root","");
            s=c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
}}
