package model;

import java.sql.SQLException;
import controller.Cliente;


public class ClienteModelo {
    private Conexao conexao;

    public ClienteModelo () {
        conexao = new Conexao();
    }


    public void inserir(Cliente cli) {
        String comando;
        comando = "insert into cliente (Nome, Email, Telefone, Genero, Endereco, idPlano ) values ('" + cli.getNome() + "','"  + cli.getEmail() + "','" + cli.getTelefone() + "','"+ cli.getGenero()+ "','" + cli.getEndereco()+ "','"+ cli.getIdPlano() + "')";

        System.out.println(comando);
        try {
            conexao.inserir(comando);
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    }
    public void deletar(Cliente cli){
        String deletar;
        deletar = "delete from cliente where idCliente = '"+cli.getId()+"'";

        System.out.println(deletar);
        try {
            conexao.apagar(deletar);
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    }
}
