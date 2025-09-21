package model.DAO;
import model.Cliente;
import Config.ConectaBanco;

import java.sql.*;

public class ClienteDAO {
    // + cadastrar( Produto ): boolean
    public boolean cadastrar(Cliente client) throws ClassNotFoundException{    
        Connection conn = null;
        try{
            conn = ConectaBanco.conectar();
            Statement stmt = conn.createStatement();
            //INSERT INTO produtos(nome, email, tipo_moradia, cpf, num_tel, cep) VALUES('Nicolas', ...)
            String sql = "INSERT INTO dadosCliente(nome, email, tipo_moradia, cpf, num_tel, cep) VALUES('"
        + client.getNome() + "','"
        + client.getEmail() + "','"
        + client.getTipo_moradia() + "','"
        + client.getCpf() + "','"
        + client.getNum_tel() + "','"
        + client.getCep() + "')";

            stmt.executeUpdate(sql); // GO - RUN -> INSERT, UPDATE, DELETE
            conn.close();
        }catch(SQLException ex){
            System.out.println("Erro SQL: " + ex);
            return false;
        }
        return true;
    }
}
