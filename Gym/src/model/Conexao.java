package model;
import java.sql.*;

public class Conexao {
    private String DB_URL = "jdbc:mysql://localhost:3306/java";
    private String USER = "root";
    private String PASS = "";
    private Connection conn;

    public Conexao() {
      // Open a connection
      try {
         this.conn = DriverManager.getConnection(this.DB_URL, this.USER, this.PASS);
         
      } catch (SQLException e) {
         e.printStackTrace();
      } 
    }
    // MySQL Insert instructions by SQL language
    public int inserir(String comando) throws SQLException {
        Statement stmt = this.conn.createStatement();
        int rs = stmt.executeUpdate(comando);  
        return rs;  
    }
    // MySQL Update Query instructions by SQL language
    public int atualizar(String comando) throws SQLException {
        Statement stmt = this.conn.createStatement();
        int rs = stmt.executeUpdate(comando);  
        return rs;  
    }
    // MySQL Delete instructions by SQL language
    public int apagar(String comando) throws SQLException {
        Statement stmt = this.conn.createStatement();
        int rs = stmt.executeUpdate(comando);  
        return rs;  
    }

    // MySQL Select Query instructions by SQL language
    public ResultSet listar(String comando) throws SQLException {
        Statement stmt = this.conn.createStatement();
        ResultSet rs = stmt.executeQuery(comando);  
        return rs;  
    }

}
