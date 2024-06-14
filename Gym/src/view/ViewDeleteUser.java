package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.Cliente;
import model.ClienteModelo;
import model.PlanoModelo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewDeleteUser extends JFrame {
    private JTextField idField;
    private JButton deleteButton;
   // Pessoa pessoa = new Pessoa();
    Cliente cliente = new Cliente();

    public ViewDeleteUser(){

        JFrame frame = new JFrame("Deletar Cliente");
        
         frame.setLayout(new GridLayout(7, 2)); 
         

         JLabel idLabel = new JLabel("id do Cliente a Ser Deletado");
         idField = new JTextField();

         deleteButton = new JButton("Deletar");

         

         deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cliente.setId(Integer.parseInt(idField.getText()));

                ClienteModelo clienteModel = new ClienteModelo();
                clienteModel.deletar(cliente);     
            
                     
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
