/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import model.ItemCompra;

/**
 *
 * @author vanessalagomachado
 */
public class CadastroProdutoJFrame {
    
    public static void main(String[] args) {
        JFrame janelaPrincipal = new JFrame();
        janelaPrincipal.setVisible(true);
        janelaPrincipal.setSize(300, 300);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setTitle("Cadastro de Produtos");
        
        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout());
        
        
        JLabel lblProduto = new JLabel("Produto");
        JTextField txtProduto = new JTextField(20);
        JLabel lblQuantidade = new JLabel("Quantidade");
        JTextField txtQuantidade = new JTextField(20);
        JButton btnCadastrar = new JButton("Cadastrar Produto");
        
        
        painel.add(lblProduto);
        painel.add(txtProduto);
        painel.add(lblQuantidade);
        painel.add(txtQuantidade);
        painel.add(btnCadastrar);
        
        janelaPrincipal.add(painel);
        
        
        
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtProduto.getText();
                int quantidade = Integer.parseInt(txtQuantidade.getText());
                
                ItemCompra item = new ItemCompra();
                item.setDescricaoItem(nome);
                item.setQuantidade(quantidade);
                
                JOptionPane.showMessageDialog(null, "Produto Cadastrado com sucesso!\n"+item);
                
            }
        });
    }
}
