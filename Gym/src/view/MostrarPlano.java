package view;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import controller.Plano;
import model.Conexao;
import model.DadosTabelaPlano;


public class MostrarPlano extends JFrame {
    private JTable tabela;
    private JScrollPane scrollPane;
    private Conexao conexao;

    public MostrarPlano() {
        setTitle("Mostrar Planos");
        setSize(600, 400);

        conexao = new Conexao();

        DadosTabelaPlano modeloTabela = new DadosTabelaPlano(conexao);
        modeloTabela.dadosPlano(); 

        tabela = new JTable(modeloTabela);
        scrollPane = new JScrollPane(tabela);

        add(scrollPane);
        Tabela();
        exibirDados(); 
    }

    private void exibirDados() {
        DadosTabelaPlano modeloTabela = new DadosTabelaPlano(conexao);
        ArrayList<Plano> planos = modeloTabela.dadosPlano();
        
        
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
       
        for (Plano plano : planos) {
            model.addRow(new Object[]{
               plano.getIdPlano(),
               plano.getNome(),
               plano.getPreco(),
               plano.getDescricao()
               
               
            });
        }
    }
    
    private void Tabela() {
        DefaultTableModel coluna = new DefaultTableModel();
        tabela.setModel(coluna);
        
        coluna.addColumn("ID");
        coluna.addColumn("Nome");
        coluna.addColumn("Preço");
        coluna.addColumn("Descrição");
       
    }
}
