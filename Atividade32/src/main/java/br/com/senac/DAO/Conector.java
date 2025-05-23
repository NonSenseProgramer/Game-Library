package DAO;


import java.sql.*;
import javax.swing.JOptionPane;

public class Conector {
    
  public  Connection conn;
    
  public boolean conectar(){
        /*
      Conecta ao banco de dados
      */
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atividade1","root","Jooj+2019Fla");
         
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha na conexão com o banco " + ex.getMessage());
            return false;
        }
    }
 
}