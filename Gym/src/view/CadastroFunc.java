package view;
import javax.swing.*;

import controller.Funcionario;
import controller.Pessoa;
import model.FuncionarioModelo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroFunc extends Pessoa {
    private JTextField nomeField, cargoField, emailField, salarioField, telefoneField;
    private JButton cadastrarButton;
    Funcionario funcionario = new Funcionario();

    public CadastroFunc() {
        // Crie um JFrame (janela)
        JFrame frame = new JFrame("Cadastro de Funcionário");
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(7, 2)); 

       
        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField(20);

        JLabel cargoLabel = new JLabel("Cargo:");
        cargoField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);

        JLabel salarioLabel = new JLabel("Salário:");
        salarioField = new JTextField(20);

        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneField = new JTextField(20);

        

        // Crie o botão "Cadastrar"
        cadastrarButton = new JButton("Cadastrar");

        
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funcionario.setNome(nomeField.getText());
                funcionario.setTelefone(telefoneField.getText());
                funcionario.setCargo(cargoField.getText());
                funcionario.setEmail(emailField.getText());
                funcionario.setSalario(Double.parseDouble(salarioField.getText()));
                
                FuncionarioModelo funcionarModelo = new FuncionarioModelo();
                funcionarModelo.inserir(funcionario);     
                MostrarFunc mf = new MostrarFunc(); 
                mf.setVisible(true);         
            }
        });
        
        frame.add(nomeLabel);
        frame.add(nomeField);
        frame.add(cargoLabel);
        frame.add(cargoField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(salarioLabel);
        frame.add(salarioField);
        frame.add(telefoneLabel);
        frame.add(telefoneField);
        frame.add(cadastrarButton);

        
        frame.setSize(400, 300);

        
        frame.setVisible(true);
    }

   
}
