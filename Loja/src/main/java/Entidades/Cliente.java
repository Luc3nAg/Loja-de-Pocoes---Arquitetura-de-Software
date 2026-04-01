package Entidades;

public class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    // Getters
    public String getNome() { return nome; }
}