/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loja;

import java.util.Scanner;

import Entidades.Cliente;
import Entidades.Pagamento;
import Entidades.Pedido;
import Entidades.Produto;
import Serviços.ServicoPagamento;

/**
 *
 * @author guluc
 */
public class Loja {

    public static void main(String[] args) {

        // Identificação de cliente (criado estaticamente conforme exigência da atividade)
        Cliente clienteAtual = new Cliente("Guilherme", "gui@email.com");
        
        Scanner sc = new Scanner(System.in);
        Produto vida = new Produto("Pocao de vida", 10);
        Produto mana = new Produto("Pocao de mana", 10);
        Produto veneno = new Produto("Pocao de veneno", 15);
        Produto gelo = new Produto("Pocao de gelo", 20);
        Produto sorte = new Produto("Pocao de sorte", 50);
        
        Pedido pedido = new Pedido();
        
        // Associa o cliente ao pedido criado (refletindo o relacionamento no DER)
        pedido.setCliente(clienteAtual);
        
        boolean loja = true;
        while (loja) {            
            System.out.println("""
                               LOJA DE POCOES
                               """);
            System.out.println("""
                               ITENS: 
                               1 - Pocao de vida (10 moedas)
                               2 - Pocao de mana (10 moedas) 
                               3 - Pocao de veneno (15 moedas)
                               4 - Pocao de gelo (20 moedas)
                               5 - Pocao de sorte (50 moedas)
                               6 - Finalizar compra
                               7 - Sair
                               """);
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("POCAO DE VIDA");
                    pedido.addItem(vida);
                    System.out.println("adicionada ao carrinho");
                    break;
                case 2:
                    System.out.println("POCAO DE MANA");
                    pedido.addItem(mana);
                    System.out.println("adicionada ao carrinho");
                    break;
                case 3:
                    System.out.println("POCAO DE VENENO");
                    pedido.addItem(veneno);
                    System.out.println("adicionada ao carrinho");
                    break;
                case 4:
                    System.out.println("POCAO DE GELO");
                    pedido.addItem(gelo);
                    System.out.println("adicionada ao carrinho");
                    break;
                case 5:
                    System.out.println("POCAO DE SORTE");
                    pedido.addItem(sorte);
                    System.out.println("adicionada ao carrinho");
                    break;
                case 6:
                    if(pedido.vazio()){
                        System.out.println("Carrinho vazio");
                        break;
                    }
                    System.out.println("Indo para o pagamento...");
                    
                    // Exibindo de quem é o pedido com base na vinculação feita
                    System.out.println("Pedido do cliente: " + pedido.getCliente().getNome());
                    System.out.println("Produtos:");
                    pedido.mostraritens();
                    
                    // Lógica de pagamento
                    System.out.println("Total a pagar: " + pedido.valorTotal());
                    
                    ServicoPagamento servico = ServicoPagamento.getInstance();
                    
                    Pagamento pag = servico.Processar(pedido.valorTotal());
                    
                    System.out.println("Status: " + pag.getStatus());
                    loja = false;
                    break;
                case 7:
                    System.out.println("Saindo");
                    loja = false;
                    break;
                default:
                    System.out.println("Escolha invalida");
                    break;
            } 
        }
        
        sc.close(); // Fechando o Scanner (boa prática de programação)
    }
}