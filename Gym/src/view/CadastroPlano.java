package view;
import javax.swing.*;

//import controller.Funcionario;
//import controller.Pessoa;
import controller.Plano;
//import model.FuncionarioModelo;
import model.PlanoModelo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroPlano {
    private JTextField nomeField, descricaoField, precoField;
    private JButton cadastrarButton;
    Plano plano = new Plano();

    public CadastroPlano() {
        // Crie um JFrame (janela)
        JFrame frame = new JFrame("Cadastro de Plano");
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(7, 2)); 

       
        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField(20);

        JLabel descricaoLabel = new JLabel("descricao:");
        descricaoField = new JTextField(20);

        JLabel precoLabel = new JLabel("Preço: ");
        precoField = new JTextField(20);

      
        // Crie o botão "Cadastrar"
        cadastrarButton = new JButton("Cadastrar");

        
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plano.setNome(nomeField.getText());
                plano.setDescricao(descricaoField.getText());
                plano.setPreco(Double.parseDouble(precoField.getText()));
                
                PlanoModelo planoModelo = new PlanoModelo();
                planoModelo.inserir(plano);     
                MostrarPlano p = new MostrarPlano(); 
                p.setVisible(true);
                     
            }
        });
        
        frame.add(nomeLabel);
        frame.add(nomeField);
        frame.add(descricaoLabel);
        frame.add(descricaoField);
        frame.add(precoLabel);
        frame.add(precoField);
        
        frame.add(cadastrarButton);

        
        frame.setSize(400, 300);

        
        frame.setVisible(true);
    }

   
}
