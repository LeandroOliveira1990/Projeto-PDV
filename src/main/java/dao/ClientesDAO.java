/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Clientes;

/**
 *
 * @author Leandro
 */
public class ClientesDAO {
    private Connection con;
    
    public ClientesDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    
    //Metodo para cadastrar Cliente
    public void cadastrarCliente(Clientes obj){
        
        try {
            String sql = "insert into tb_clientes(nome,rg,cpf,"
                    + "email,telefone,celular,cep,endereco,numero,"
                    + "complemento,bairro,cidade,estado) values(?,?,?,?,?,?,"
                    + "?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getUf());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
            
            
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Falha ao tentar cadastrar erro: " + e);
        }
    }
    
    //Metodo para alterar Cliente
    public void alterarCliente(){
    
}
    
    //Metodo para excluir Cliente
    public void excluirCliente(){
        
    }
    
}
