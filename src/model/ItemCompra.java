/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vanessalagomachado
 */
public class ItemCompra {
    private String descricaoItem;
    private int quantidade;
    private boolean comprado;

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    @Override
    public String toString() {
        return descricaoItem+ " - Quantidade: "+quantidade;
    }
    
    public String exibirDados() {
        String aux = "Produto cadastrado:\n ";
        aux += "Descrição do item" + descricaoItem+ "\n";
        aux += "Quantidade: " +quantidade+ "\n";
        aux += comprado == true? "Item já comprado" : "Não comprado";
        return aux;
    }
}
