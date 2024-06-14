package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.Funcionario;
import model.FuncionarioModelo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewDeleteFunc extends JFrame {
    private JTextField idField;
    private JButton deleteButton;
   // Pessoa pessoa = new Pessoa();
    Funcionario funcionario = new Funcionario();

    public ViewDeleteFunc(){

        JFrame frame = new JFrame("Deletar Funcionário");
        
         frame.setLayout(new GridLayout(7, 2)); 
         

         JLabel idLabel = new JLabel("id do Funcionário a Ser Deletado");
         idField = new JTextField();

         deleteButton = new JButton("Deletar");

         

         deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funcionario.setId(Integer.parseInt(idField.getText()));

                FuncionarioModelo funcionarioModel = new FuncionarioModelo();
                funcionarioModel.deletar(funcionario);     
            
                     
            }

           
        });
            frame.add(idLabel);
            frame.add(idField);
            frame.add(deleteButton); 
            frame.setSize(200, 200);
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            
    }

    
    

    
}
