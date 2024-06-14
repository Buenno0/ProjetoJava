package model;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import controller.Cliente;


import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

import model.Conexao;

public class DadosTabelaCliente extends DefaultTableModel {
    public JButton botaoDel;
    private Conexao conexao;

    public DadosTabelaCliente(Conexao conexao) {
        this.conexao = conexao;  
    }

    public ArrayList<Cliente> dadosClientes(){
        ArrayList<Cliente> listacliente = new ArrayList<>();
    
        try {
            String consulta = "SELECT * FROM cliente";
            ResultSet resultado = conexao.listar(consulta);
    
            while (resultado.next()) {
                Cliente cliente = new Cliente(); // ks
                cliente.setId(resultado.getInt("idCliente"));
                cliente.setNome(resultado.getString("Nome"));
                cliente.setEmail(resultado.getString("Email"));
                cliente.setTelefone(resultado.getString("Telefone"));
                cliente.setGenero(resultado.getString("Genero"));
                cliente.setEndereco(resultado.getString("Endereco"));
                cliente.setIdPlano(resultado.getInt("idPlano"));
                listacliente.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listacliente;
    }
}
    


