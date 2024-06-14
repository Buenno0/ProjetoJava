package view;
import javax.swing.*;

import controller.Cliente;
import model.ClienteModelo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroCliente extends JFrame {
    private JTextField nomeField, generoField, emailField, enderecoField, telefoneField,idPlanoField;
    private JButton cadastrarButton;
    Cliente cliente = new Cliente();
   

    public CadastroCliente() {
     
        JFrame janela = new JFrame("Cadastro de Cliente");
        janela.setLayout(new GridLayout(7, 2)); 

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);

        JLabel generoLabel = new JLabel("genero:");
        generoField = new JTextField(20);

        JLabel enderecoLabel = new JLabel("Endereco:");
        enderecoField = new JTextField(20);

        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneField = new JTextField(20);

        JLabel idPlanoLabel = new JLabel("id Plano:");
        idPlanoField = new JTextField(20);

        cadastrarButton = new JButton("Cadastrar");

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cliente.setNome(nomeField.getText());
                cliente.setTelefone(telefoneField.getText());
                cliente.setGenero(generoField.getText());
                cliente.setEmail(emailField.getText());
                cliente.setEndereco(enderecoField.getText());
                cliente.setIdPlano(Integer.parseInt(idPlanoField.getText()));
                
                ClienteModelo clienteModelo = new ClienteModelo();
                clienteModelo.inserir(cliente);               
            }
        });

        janela.add(nomeLabel);
        janela.add(nomeField);
        janela.add(generoLabel);
        janela.add(generoField);
        janela.add(emailLabel);
        janela.add(emailField);
        janela.add(enderecoLabel);
        janela.add(enderecoField);
        janela.add(telefoneLabel);
        janela.add(telefoneField);
        janela.add(idPlanoLabel);
        janela.add(idPlanoField);
        janela.add(cadastrarButton);
        
        janela.setSize(600, 400);
        janela.setVisible(true);
    }  
}

