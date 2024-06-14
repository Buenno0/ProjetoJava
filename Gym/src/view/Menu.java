package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JButton cadastrarFuncionarioButton;
    private JButton cadastrarMembroButton;
    private JButton cadastrarPlanoButton;
    private JButton showFuncButton;
    private JButton showClienteButton;
    private JButton showPlanoButton;
    private JButton delClienteButton;
    private JButton delFuncionarioButton;
    private JButton delPlanoButton;


    public Menu() {

        setTitle("Dashboard da Academia");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        JLabel infoLabel = new JLabel("Escolha uma Opção:");
        
        cadastrarFuncionarioButton = new JButton("Cadastrar Funcionario");
        cadastrarMembroButton = new JButton("Cadastrar Cliente");
        cadastrarPlanoButton = new JButton("Cadastrar Plano");
        showFuncButton = new JButton("Mostrar Funcionários");
        showClienteButton = new JButton("Mostrar Clientes");
        showPlanoButton = new JButton("Mostrar Planos");
        delClienteButton = new JButton("Deletar Usuário");
        delFuncionarioButton = new JButton("Deletar Funcionário");
        delPlanoButton = new JButton("Deletar Plano");

        cadastrarFuncionarioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               CadastroFunc cadastro = new CadastroFunc();
            }
        });

        cadastrarMembroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CadastroCliente cadCliente = new CadastroCliente();
                cadCliente.setVisible(true);
            }
        });

        cadastrarPlanoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CadastroPlano cadPlano = new CadastroPlano();
  
            }
        });

        showFuncButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                MostrarFunc mf = new MostrarFunc();
                mf.setVisible(true);
            }
        });

        showClienteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                MostrarCliente mostrarCli = new MostrarCliente(); 
                mostrarCli.setVisible(true);
            }
        });

        showPlanoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                
                MostrarPlano mostrarP = new MostrarPlano(); 
                mostrarP.setVisible(true);
            }
        });

        delClienteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

               MostrarCliente mostrarCli = new MostrarCliente(); 
               mostrarCli.setVisible(true);
               ViewDeleteUser delUser = new ViewDeleteUser();

            }
        });

        delFuncionarioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                MostrarFunc mf = new MostrarFunc();
                mf.setVisible(true);
               ViewDeleteFunc delFunc = new ViewDeleteFunc();
               
             
            }
        });

        delPlanoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                MostrarPlano mostrarP = new MostrarPlano(); 
                mostrarP.setVisible(true);
               ViewDeletePlano delPlano = new ViewDeletePlano();
               
             
            }
        });

        add(infoLabel);
        add(cadastrarFuncionarioButton);
        add(cadastrarMembroButton);
        add(cadastrarPlanoButton);
        add(showFuncButton);
        add(showClienteButton);
        add(showPlanoButton);
        add(delClienteButton);
        add(delFuncionarioButton);
        add(delPlanoButton);
        
        setSize(650, 450);
        setLocationRelativeTo(null);
        setVisible(true);
    }}