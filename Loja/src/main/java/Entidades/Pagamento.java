/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author guluc
 */
public class Pagamento {
    private int ValorTotal;
    private String Status;

    public Pagamento(int ValorTotal, String Status) {
        this.ValorTotal = ValorTotal;
        this.Status = Status;
    }

    public int getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(int ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    
    
    
}
