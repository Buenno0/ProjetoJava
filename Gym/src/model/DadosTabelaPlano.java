package model;
import javax.swing.table.DefaultTableModel;


import controller.Plano;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Conexao;

public class DadosTabelaPlano extends DefaultTableModel {
    
    private Conexao conexao;

    public DadosTabelaPlano(Conexao conexao) {
        this.conexao = conexao;
    }

    

    /**
     * @return
     */
    public ArrayList<Plano> dadosPlano(){
        ArrayList<Plano> listaPlano= new ArrayList<>();
    
        try {
            String consulta = "SELECT * FROM planosAssociacao";
            ResultSet resultado = conexao.listar(consulta);
    
            while (resultado.next()) {
                Plano plano= new Plano();
                plano.setIdPlano(resultado.getInt("ID"));
                plano.setNome(resultado.getString("NomePlano"));
                plano.setDescricao(resultado.getString("Descrição"));
                plano.setPreco(resultado.getDouble("Preço")); 
                listaPlano.add(plano);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaPlano;
    }
}
    


