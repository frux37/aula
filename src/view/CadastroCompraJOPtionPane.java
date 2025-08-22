/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import model.ItemCompra;

/**
 *
 * @author vanessalagomachado
 */
public class CadastroCompraJOPtionPane {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!");
        
        String nome = JOptionPane.showInputDialog("Item desejado: ");
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade desejada de "+nome));
        
        ItemCompra item = new ItemCompra();
        item.setDescricaoItem(nome);
        item.setQuantidade(quantidade);
        
        
        //JOptionPane.showMessageDialog(null, item.getDescricaoItem()+
             //   " - Quantidade: "+item.getQuantidade());
        
        JOptionPane.showMessageDialog(null, item);
                
    }
}
