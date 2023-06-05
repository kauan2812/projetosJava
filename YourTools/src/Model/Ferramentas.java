package Model;

import java.util.*;
import DAO.YourToolsDAO;
import java.sql.SQLException;

public class Ferramentas {

    // Atributos
    private int id;
    private String nome;
    private String marca;
    private double custoAquisicao;
    private final YourToolsDAO dao; 

    // M�todo Construtor de Objeto Vazio
    public Ferramentas() {
        this.dao = new YourToolsDAO(); // inicializado n�o importa em qual construtor
    }

    // M�todo Construtor usando tamb�m o construtor da SUPERCLASSE
    public Ferramentas(int id, String nome, String marca, double custoAquisicao) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.custoAquisicao = custoAquisicao;
        this.dao = new YourToolsDAO(); // inicializado n�o importa em qual construtor
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCustoAquisicao() {
        return custoAquisicao;
    }

    public void setCustoAquisicao(double custoAquisicao) {
        this.custoAquisicao = custoAquisicao;
    }
    
    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Marca: " + this.getMarca()
                + "\n Custo de Aquisição: " + this.getCustoAquisicao()
                + "\n -----------";
    }

    // Retorna a Lista de Ferramentas(objetos)
    public ArrayList getMinhaListaFerramentas() {
        return dao.getMinhaListaFerramentas();
    }

    // Cadastra nova Ferramenta
    public boolean InsertFerramentasBD(String nome, String marca, double custoAquisicao) throws SQLException {
        int id = this.maiorIDFerramentas() + 1;
        Ferramentas objeto = new Ferramentas(id, nome, marca, custoAquisicao);
        dao.InsertFerramentasBD(objeto);
        return true;

    }

    // Deleta uma Ferramenta espec�fico pelo seu campo ID
    public boolean DeleteFerramentasBD(int id) {
        dao.DeleteFerramentasBD(id);
        return true;
    }

    // Edita uma Ferramenta espec�fico pelo seu campo ID
    public boolean UpdateFerramentasBD(int id, String nome, String marca, double custoAquisicao) {
        Ferramentas objeto = new Ferramentas(id, nome, marca, custoAquisicao);
        dao.UpdateFerramentasBD(objeto);
        return true;
    }

    // carrega dados de uma ferramenta espec�fica pelo seu ID
    public Ferramentas carregaFerramentas(int id) {
        dao.carregaFerramentas(id);
        return null;
    }
    
    // retorna o maior ID da nossa base de dados
        public int maiorIDFerramentas() throws SQLException{
        return dao.maiorIDFerramentas();
    }   
}

