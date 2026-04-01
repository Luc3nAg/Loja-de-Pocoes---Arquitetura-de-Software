/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author guluc
 */
public class Pedido {
    private Cliente cliente;
    ArrayList<ItemPedido> lista = new ArrayList<>();

    public void setCliente(Cliente cliente) { 
        this.cliente = cliente; 
    }
    public Cliente getCliente() { 
        return cliente; 
    }
    
    public void addItem(Produto produto){
        lista.add(new ItemPedido(produto, 1));
    }
    
    public boolean vazio(){
        return lista.isEmpty();
    }
    
    public int valorTotal(){
        int total = 0;
        for (ItemPedido itemPedido : lista) {
            total += itemPedido.total();
        }
        return total;
    }
    
    public void mostraritens(){
        for (ItemPedido itemPedido : lista) {
            System.out.println("Item: " + itemPedido.getProduto().getNome());
        }
    }
}
