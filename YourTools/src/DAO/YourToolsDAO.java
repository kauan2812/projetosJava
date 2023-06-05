package DAO;

import Model.Amigos;
import Model.Ferramentas;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class YourToolsDAO {

    public static ArrayList<Amigos> MinhaLista = new ArrayList<Amigos>();

    public YourToolsDAO() {
    }

    public int maiorIDAmigos() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_amigos");
            res.next();
            maiorID = res.getInt("id");

            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorID;
    }

    public Connection getConexao() {

        Connection connection = null;  //inst�ncia da conex�o

        try {

            // Carregamento do JDBC Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            // Configurar a conex�o
            String server = "localhost"; //caminho do MySQL
            String database = "db_yourtools";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "palmeiras";

            connection = DriverManager.getConnection(url, user, password);

            // Testando..
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: N�O CONECTADO!");
            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver n�o encontrado
            System.out.println("O driver nao foi encontrado. " + e.getMessage() );
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }
// -----------------------------------------------------------------------
//  -- retorna a Lista de Amigos -- 
// -----------------------------------------------------------------------
    
    public ArrayList getMinhaListaAmigos() {
        
        MinhaLista.clear(); // Limpa nosso ArrayList

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos");
            while (res.next()) {              
              
                int id = res.getInt("id");
                String nome = res.getString("nome");
                int telefone = res.getInt("telefone");

                Amigos objeto = new Amigos(id, nome, telefone);

                MinhaLista.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaLista;
    }
// -----------------------------------------------------------------------
//  -- Cadastrar um novo Amigo -- 
// -----------------------------------------------------------------------
    
    public boolean InsertAmigosBD(Amigos objeto) {
        String sql = "INSERT INTO tb_amigos(id,nome,telefone) VALUES(?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setInt(3, objeto.getTelefone());
            
            

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }
    
// -----------------------------------------------------------------------
//  -- Deletar um Amigo especifico pelo seu campo ID -- 
// -----------------------------------------------------------------------    
    
    public boolean DeleteAmigosBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_amigos WHERE id = " + id);
            stmt.close();            
            
        } catch (SQLException erro) {
        }
        
        return true;
    }
// -----------------------------------------------------------------------
//  -- Edita um Amigo pelo campo ID -- 
// -----------------------------------------------------------------------
   
    public boolean UpdateAmigosBD(Amigos objeto) {

        String sql = "UPDATE tb_amigos set nome = ?, telefone = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            
            stmt.setString(1, objeto.getNome());          
            stmt.setInt(2, objeto.getTelefone());
            stmt.setInt(3, objeto.getId());
            

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Amigos carregaAmigos(int id) {
        
        Amigos objeto = new Amigos();
        objeto.setId(id);
        
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setTelefone(res.getInt("telefone"));
           
            

            stmt.close();            
            
        } catch (SQLException erro) {
        }
        return objeto;
    }
    
    
    
    
    
    
    
    // -----------------------------------------------------------------------
    //  -- ArrayList das Ferramentas -- 
    // -----------------------------------------------------------------------
    
    
    
    
    public static ArrayList<Ferramentas> MinhaListaFerramentas = new ArrayList<Ferramentas>();
    
    public int maiorIDFerramentas() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_ferramentas");
            res.next();
            maiorID = res.getInt("id");

            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorID;
    }
    
// -----------------------------------------------------------------------
//  -- retorna a Lista de Ferramentas -- 
// -----------------------------------------------------------------------
    
    public ArrayList getMinhaListaFerramentas() {
        
        MinhaListaFerramentas.clear(); // Limpa nosso ArrayList

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas");
            while (res.next()) {              
              
                int id = res.getInt("id");
                String nome = res.getString("nome");
                String marca = res.getString("marca");
                double custoAquisicao = res.getDouble("custoAquisicao");

                Ferramentas objeto = new Ferramentas(id, nome, marca, custoAquisicao);

                MinhaListaFerramentas.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaListaFerramentas;
    }
    
// -----------------------------------------------------------------------
//  -- Cadastrar uma nova Ferramenta -- 
// -----------------------------------------------------------------------
    
    public boolean InsertFerramentasBD(Ferramentas objeto) {
        String sql = "INSERT INTO tb_ferramentas(id,nome,marca,custoAquisicao) VALUES(?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getMarca());
            stmt.setDouble(4, objeto.getCustoAquisicao());
            
            

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }
    
// -----------------------------------------------------------------------
//  -- Deletar uma ferramenta especifica pelo seu campo ID -- 
// -----------------------------------------------------------------------    
    
    public boolean DeleteFerramentasBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_ferramentas WHERE id = " + id);
            stmt.close();            
            
        } catch (SQLException erro) {
        }
        
        return true;
    }
    
// -----------------------------------------------------------------------
//  -- Edita uma Ferramenta pelo campo ID -- 
// -----------------------------------------------------------------------
   
    public boolean UpdateFerramentasBD(Ferramentas objeto) {

        String sql = "UPDATE tb_ferramentas set nome = ?, marca = ?, custoAquisicao = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            
            stmt.setString(1, objeto.getNome());          
            stmt.setString(2, objeto.getMarca());
            stmt.setDouble(3,objeto.getCustoAquisicao());
            stmt.setInt(4, objeto.getId());
            

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    } 

    public Ferramentas carregaFerramentas(int id) {
        
        Ferramentas objeto = new Ferramentas();
        objeto.setId(id);
        
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setMarca(res.getString("marca"));
            objeto.setCustoAquisicao(res.getInt("custo de aquisicao"));
            

            stmt.close();            
            
        } catch (SQLException erro) {
        }
        return objeto;
    }
    
    
}