package model;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.sql.SQLException;


import controller.Funcionario;


public class FuncionarioModelo {
    private Conexao conexao;

    public FuncionarioModelo () {
        conexao = new Conexao();
    }
    Date dataAtual = new Date();


    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String dataContrato = dateFormat.format(dataAtual);

    public void inserir(Funcionario func) {
        String comando;
        comando = "insert into funcionarios (Nome, Cargo, Email, Salario, Telefone, dataContrato ) values ('" + func.getNome() + "','" + func.getCargo() + "','" + func.getEmail() + "','" + func.getSalario() + "','" + func.getTelefone() + "','"+ dataContrato+ "')";

        System.out.println(comando);
        try {
            conexao.inserir(comando);
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    }

     public void deletar(Funcionario func){
        String deletar;
        deletar = "delete from funcionarios where ID = '"+func.getId()+"'";

        System.out.println(deletar);
        try {
            conexao.apagar(deletar);
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    }
}
