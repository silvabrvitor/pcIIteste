package br.edu.etec.lojainformatica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadHard extends TelaDeCadastro{
    

    JLabel lbDescricao = new JLabel("Descrição do Produto:");
    JTextField txtDescricao = new JTextField();
    
    JLabel lbPrecoUnitario = new JLabel("Preço Unitário:");
    JTextField txtPrecoUnitario = new JTextField();
    
    JLabel lbQtdAtual = new JLabel("Quantidade Atual:");
    JTextField txtQtdAtual = new JTextField();
    
    JLabel lbQtdMinima = new JLabel("Quantidade Minima:");
    JTextField txtQtdMinima = new JTextField();
    
    //JLabel lbImagemProd = new JLabel("Imagem do Produto:");
    //JTextField txtImagemProd = new JTextField();
    
    public TelaCadHard(){
        super(5,2);

        this.painelParaCampos.add(lbDescricao);
        this.painelParaCampos.add(txtDescricao);
        
        this.painelParaCampos.add(lbPrecoUnitario);
        this.painelParaCampos.add(txtPrecoUnitario);
        
        this.painelParaCampos.add(lbQtdAtual);
        this.painelParaCampos.add(txtQtdAtual);
        
        this.painelParaCampos.add(lbQtdMinima);
        this.painelParaCampos.add(txtQtdMinima);
        
        //this.painelParaCampos.add(lbImagemProd);
        //this.painelParaCampos.add(txtImagemProd);
        
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
    	txtDescricao.setText("");
    	txtPrecoUnitario.setText("");
    	txtQtdAtual.setText("");
    	txtQtdMinima.setText("");
    	
    	
    }
    
}
