package Model;

import java.util.*;
import DAO.YourToolsDAO;
import java.sql.SQLException;

public class Amigos extends Pessoa {

    // Atributos
    private final YourToolsDAO dao; 

    // M�todo Construtor de Objeto Vazio
    public Amigos() {
        this.dao = new YourToolsDAO(); // inicializado n�o importa em qual construtor
    }

    // M�todo Construtor usando tamb�m o construtor da SUPERCLASSE
    public Amigos(int id, String nome, int telefone) {
        super(id, nome, telefone);
        this.dao = new YourToolsDAO(); // inicializado n�o importa em qual construtor
    }

    // Override necess�rio para poder retornar os dados de Pessoa no toString para amigos.
    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Telefone: " + this.getTelefone()
                + "\n -----------";
    }

    // Retorna a Lista de Amigos(objetos)
    public ArrayList getMinhaListaAmigos() {
        //return AlunoDAO.MinhaLista;
        return dao.getMinhaListaAmigos();
    }

    // Cadastra novo amigo
    public boolean InsertAmigosBD(String nome, int telefone) throws SQLException {
        int id = this.maiorIDAmigos() + 1;
        Amigos objeto = new Amigos(id, nome, telefone);
        dao.InsertAmigosBD(objeto);
        return true;

    }

    // Deleta um amigo espec�fico pelo seu campo ID
    public boolean DeleteAmigosBD(int id) {
        dao.DeleteAmigosBD(id);
        return true;
    }

    // Edita um amigo espec�fico pelo seu campo ID
    public boolean UpdateAmigosBD(int id, String nome, int telefone) {
        Amigos objeto = new Amigos(id, nome, telefone);
        dao.UpdateAmigosBD(objeto);
        return true;
    }

    // carrega dados de um amigo espec�fico pelo seu ID
    public Amigos carregaAmigos(int id) {
        dao.carregaAmigos(id);
        return null;
    }
    
    // retorna o maior ID da nossa base de dados
        public int maiorIDAmigos() throws SQLException{
        return dao.maiorIDAmigos();
    }   
}
