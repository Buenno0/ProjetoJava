package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.Plano;
import model.PlanoModelo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewDeletePlano extends JFrame {
    private JTextField idField;
    private JButton deleteButton;
    
    Plano plano = new Plano();

    public ViewDeletePlano(){

        JFrame frame = new JFrame("Deletar Plano");
        
         frame.setLayout(new GridLayout(7, 2)); 
         

         JLabel idLabel = new JLabel("Id do Plano a Ser Deletado");
         idField = new JTextField();

         deleteButton = new JButton("Deletar");

         

         deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plano.setIdPlano(Integer.parseInt(idField.getText()));

                PlanoModelo planoModel = new PlanoModelo();
                planoModel.deletar(plano);     
                     
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
