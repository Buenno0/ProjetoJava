package model;
import javax.swing.table.DefaultTableModel;

import controller.Funcionario;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import model.Conexao;

public class carregarDadosTabela extends DefaultTableModel {
   
    private Conexao conexao;

    public carregarDadosTabela(Conexao conexao) {
        this.conexao = conexao;
    }

    public ArrayList<Funcionario> carregarDados() {
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
    
        try {
            String consulta = "SELECT * FROM Funcionarios";
            ResultSet resultado = conexao.listar(consulta);
    
            while (resultado.next()) {
                Funcionario funcionario = new Funcionario(); // ks
                funcionario.setId(resultado.getInt("ID"));
                funcionario.setNome(resultado.getString("Nome"));
                funcionario.setCargo(resultado.getString("Cargo"));
                funcionario.setEmail(resultado.getString("Email"));
                funcionario.setSalario(resultado.getDouble("Salario"));
                funcionario.setTelefone(resultado.getString("Telefone"));
                funcionario.setDataContrato(resultado.getString("Datacontrato"));
                listaFuncionario.add(funcionario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaFuncionario;
    }
}
    

