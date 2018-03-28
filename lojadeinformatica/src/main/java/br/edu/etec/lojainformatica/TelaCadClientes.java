package br.edu.etec.lojainformatica;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;


public class TelaCadClientes extends TelaDeCadastro{
    //TelaCadClientes tlaCadCli = new TelaCadClientes();
    
    JLabel lbNome = new JLabel();
    JTextField txtNome = new JTextField();
    
    JLabel lbEndereco = new JLabel();
    JTextField txtEndereco = new JTextField();
    
    JLabel lbFone = new JLabel();
    JTextField txtFone = new JTextField();
    
    JLabel lbEmail = new JLabel();
    JTextField txtEmail = new JTextField();
    
    //JList list = new JList();
    
    public TelaCadClientes(){
        super(4,2);
        
        this.lbNome = new JLabel("Nome:");  
        this.lbEndereco = new JLabel("Endereo:");    
        this.lbFone = new JLabel("Telefone:");    
        this.lbEmail = new JLabel("E-mail:");       
        
        this.painelParaCampos.add(lbNome);
        this.painelParaCampos.add(txtNome);
        
        this.painelParaCampos.add(lbEndereco);
        this.painelParaCampos.add(txtEndereco);
        
        this.painelParaCampos.add(lbFone);
        this.painelParaCampos.add(txtFone);
        
        this.painelParaCampos.add(lbEmail);
        this.painelParaCampos.add(txtEmail);
        
        //JScrollPane listScroller = new JScrollPane(list);
        //listScroller.setPreferredSize(new Dimension(250, 80));
        //this.painelListagem.add(list);
        
        
        btnLimpar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	limparFormulario();
            }
        
        });
    
    }
    
    @Override
    void excluir(){
    
    }
    
    @Override
    void alterar(){
    
    }
    
    @Override
    void cancelar(){
    
    }
    
    @Override
    void salvar(){
    
    }
    
    @Override
    void limparFormulario(){
    	txtNome.setText("");
    	txtEndereco.setText("");
    	txtFone.setText("");
    	txtEmail.setText("");
    }
}
