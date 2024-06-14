package view;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import controller.Funcionario;
import model.Conexao;
import model.carregarDadosTabela;

public class MostrarFunc extends JFrame {
    private JTable tabela;
    private JScrollPane scrollPane;
    private Conexao conexao;

    public MostrarFunc() {
        setTitle("Mostrar Funcionários");
        setSize(600, 400);
        

        conexao = new Conexao();

        carregarDadosTabela modeloTabela = new carregarDadosTabela(conexao);
        modeloTabela.carregarDados(); 

        tabela = new JTable(modeloTabela);
        scrollPane = new JScrollPane(tabela);

        add(scrollPane);
        Tabela();
        exibirDados(); 
    }
    private void exibirDados() {
        carregarDadosTabela modeloTabela = new carregarDadosTabela(conexao);
        ArrayList<Funcionario> funcionarios = modeloTabela.carregarDados();
        
        
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
       
        for (Funcionario funcionario : funcionarios) {
            model.addRow(new Object[]{
                funcionario.getId(),
                funcionario.getNome(),
                funcionario.getCargo(),
                funcionario.getEmail(),
                funcionario.getSalario(),
                funcionario.getTelefone(),
                funcionario.getDataContrato()
            });
        }
    }
    private void Tabela() {
        DefaultTableModel coluna = new DefaultTableModel();
        tabela.setModel(coluna);

        coluna.addColumn("ID");
        coluna.addColumn("Nome");
        coluna.addColumn("Cargo");
        coluna.addColumn("Email");
        coluna.addColumn("Salario");
        coluna.addColumn("Telefone");
        coluna.addColumn("Data de Contrato");
    }
}
