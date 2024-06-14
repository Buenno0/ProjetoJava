package model;


import java.sql.SQLException;
import controller.Plano;

public class PlanoModelo {
    private Conexao conexao;

    public PlanoModelo () {
        conexao = new Conexao();
    }
    
    public void inserir(Plano plano) {
        String comando;
        comando = "insert into planosAssociacao (NomePlano, Descrição, Preço) values ('" + plano.getNome() + "','" + plano.getDescricao() + "','" + plano.getPreco() + "')";
        System.out.println(comando);
        try {
            conexao.inserir(comando);
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    }

    public void deletar(Plano plano){
        String deletar;
        deletar = "delete from planosAssociacao where ID = '"+plano.getIdPlano()+"'";

        System.out.println(deletar);
        try {
            conexao.apagar(deletar);
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    }
}
