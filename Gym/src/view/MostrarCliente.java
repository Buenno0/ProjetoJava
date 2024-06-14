package view;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.Cliente;
import model.Conexao;
import model.DadosTabelaCliente;

public class MostrarCliente extends JFrame {
    private JTable tabela;
    private JScrollPane scrollPane;
    private Conexao conexao;
    private DefaultTableModel coluna;
  
    public MostrarCliente() {
        setTitle("Mostrar Clientes");
        setSize(900, 500);
        conexao = new Conexao();

        DadosTabelaCliente modeloTabela = new DadosTabelaCliente(conexao);
        modeloTabela.dadosClientes(); 

        tabela = new JTable(modeloTabela);
        scrollPane = new JScrollPane(tabela);

        add(scrollPane);
        Tabela();
        exibirDados();
           
    }
    private void exibirDados() {
        DadosTabelaCliente modeloTabela = new DadosTabelaCliente(conexao);   
        ArrayList<Cliente> clientes = modeloTabela.dadosClientes();
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
       
        for (Cliente cliente : clientes) {
            model.addRow(new Object[]{
                cliente.getId(),
                cliente.getNome(),
                cliente.getEmail(),
                cliente.getTelefone(),
                cliente.getGenero(),
                cliente.getEndereco(),
                cliente.getIdPlano(),
            });
        }
    }
    private void Tabela() {
        DefaultTableModel coluna = new DefaultTableModel();
        tabela.setModel(coluna);

        coluna.addColumn("ID");
        coluna.addColumn("Nome");
        coluna.addColumn("Email");
        coluna.addColumn("Telefone");
        coluna.addColumn("Genero");
        coluna.addColumn("Endereço");
        coluna.addColumn("Id do Plano");
    }
    
}