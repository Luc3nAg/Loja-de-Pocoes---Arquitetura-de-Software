/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serviços;

import Entidades.Pagamento;

/**
 *
 * @author guluc
 */
public class ServicoPagamento {
    private static ServicoPagamento instancia;

    private ServicoPagamento() {
    }
    
    public static ServicoPagamento getInstance(){
        if(instancia == null){
            instancia = new ServicoPagamento();
        }
        return instancia;
    }
    
    public Pagamento Processar(int valor){
        //simulação de pagamento 
        boolean aprovado = true;
        
        if (aprovado) {
            return new Pagamento(valor, "APROVADO");
        }
        else{
            return new Pagamento(valor, "NEGADO");
        }
    }
}
