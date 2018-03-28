package br.edu.etec.lojainformatica;

import java.awt.*;
import java.awt.Event;
import java.awt.event.*;
import java.awt.BorderLayout;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import javax.swing.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


import java.sql.Connection;
import java.sql.SQLException;
import br.edu.etec.lojainformatica.persistence.*;

/**
 *
 * @author convidado2
 */
public class App extends JFrame{

      private JMenuBar menuBar;
    private JMenu menuArquivo;
    private JMenuItem menuCadCli;
    private JMenuItem menuCadHW;
    private JMenuItem menuCadVendas;
    private JMenuItem menuSair;
    
    TelaDeCadastro tlaCadCli = new TelaCadClientes();
    TelaDeCadastro tlaCadHw = new TelaCadHard();
    TelaDeCadastro tlaCadVenda = new TelaCadVendas();
    
    public App(){
        this.setVisible(true);
        this.setSize(800,600);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        configuraMenu();
        this.pack();
        this.setLocationRelativeTo(null);
        
        
    }
    
    private void configuraMenu(){
        this.menuBar = new JMenuBar();
        this.menuArquivo = new JMenu("Arquivo");
        this.menuBar.add(menuArquivo);
        this.menuCadCli = new JMenuItem("Cadastro de Clientes");
        
        menuCadCli.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                App.this.tlaCadCli.setVisible(true);
                App.this.tlaCadHw.setVisible(false);
                App.this.tlaCadVenda.setVisible(false);
                App.this.getContentPane().add(App.this.tlaCadCli, BorderLayout.CENTER);
                App.this.pack();
            }
        
        });
        
        
        
        this.menuCadHW = new JMenuItem("Cadastro de Hardware");
        
        menuCadHW.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                App.this.tlaCadCli.setVisible(false);
                App.this.tlaCadHw.setVisible(true);
                App.this.tlaCadVenda.setVisible(false);
                App.this.getContentPane().add(App.this.tlaCadHw, BorderLayout.CENTER);
                App.this.pack();
            }
        
        });
        
        this.menuCadVendas = new JMenuItem("Cadastro de Vendas");
        menuCadVendas.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                App.this.tlaCadCli.setVisible(false);
                App.this.tlaCadHw.setVisible(false);
                App.this.tlaCadVenda.setVisible(true);
                App.this.getContentPane().add(App.this.tlaCadVenda, BorderLayout.CENTER);
                App.this.pack();
            }
        
        });
        
        
        this.menuSair = new JMenuItem("Sair");
        
        menuSair.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
                App.this.pack();
            }
        
        });
        
        this.getContentPane().add(menuBar, BorderLayout.NORTH);
        
        this.menuArquivo.add(menuCadCli);
        this.menuArquivo.add(menuCadHW);
        this.menuArquivo.add(menuCadVendas);
        this.menuArquivo.add(menuSair);
        
    }
    
    public static void main(String[] args) {
        App app = new App();
        
        try {
			Connection conn = JdbcUtil.getConnection();
			System.out.println(conn);
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		} catch (SQLException e) {		
			e.printStackTrace();
		}
    }
    
}
