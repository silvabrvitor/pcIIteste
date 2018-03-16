package br.edu.etec.lojainformatica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadVendas extends TelaDeCadastro{
    

    JLabel lbidCliente = new JLabel("ID Cliente:");
    JTextField txtidCliente = new JTextField();
    
    JLabel lbData = new JLabel("Data:");
    JTextField txtData = new JTextField();
    
    JLabel lbValorTotal = new JLabel("Valor Total:");
    JTextField txtValorTotal = new JTextField();
    
    JLabel lbdesconto = new JLabel("Desconto:");
    JTextField txtDesconto = new JTextField();
    
    JLabel lbValorPago = new JLabel("Valor Pago:");
    JTextField txtValorPago = new JTextField();
    
    public TelaCadVendas(){
        super(5,2);

        this.painelParaCampos.add(lbidCliente);
        this.painelParaCampos.add(txtidCliente);
        
        this.painelParaCampos.add(lbData);
        this.painelParaCampos.add(txtData);
        
        this.painelParaCampos.add(lbValorTotal);
        this.painelParaCampos.add(txtValorTotal);
        
        this.painelParaCampos.add(lbdesconto);
        this.painelParaCampos.add(txtDesconto);
        
        this.painelParaCampos.add(lbValorPago);
        this.painelParaCampos.add(txtValorPago);
        
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
    	txtidCliente.setText("");
    	txtData.setText("");
    	txtValorTotal.setText("");
    	txtDesconto.setText("");
    	txtValorPago.setText("");
        
    }
    
}
