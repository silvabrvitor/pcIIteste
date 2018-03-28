package br.edu.etec.lojainformatica;

import java.awt.Container;
import java.awt.Container.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JTextField;



public abstract class TelaDeCadastro extends JPanel{
    
    JPanel painelDeBotoes = new JPanel();
    JPanel painelParaCampos = new JPanel();
    JPanel painelListagem = new JPanel();
    JButton btnSalvar = new JButton("Salvar");
    JButton btnLimpar = new JButton("Limpar");
    JButton btnCancelar = new JButton("Cancelar");
    JButton btnListar = new JButton("Listar");
    JButton btnAlterar = new JButton("Alterar");
    JTextField txtId = new JTextField("Digite Id Para Alterar");
    
    public TelaDeCadastro(int nLinhas, int nColunas){
        BorderLayout borderLayout = new BorderLayout();
        this.setLayout(borderLayout);
        
        GridLayout layoutParaCampos = new GridLayout(nLinhas, nColunas);
        painelParaCampos.setLayout(layoutParaCampos);
        this.add(painelParaCampos, BorderLayout.CENTER);
        
        this.painelDeBotoes.add(btnSalvar);
        this.painelDeBotoes.add(btnLimpar);
        this.painelDeBotoes.add(btnCancelar);
        this.painelDeBotoes.add(btnListar);
        this.painelDeBotoes.add(btnAlterar);
        this.painelDeBotoes.add(txtId);
        
        this.add(painelDeBotoes, BorderLayout.SOUTH);
        
    }
    
    abstract void limparFormulario() throws SQLException;
    abstract void salvar() throws SQLException;
    abstract void cancelar() throws SQLException;
    abstract void alterar() throws SQLException;
    abstract void excluir() throws SQLException;
}
