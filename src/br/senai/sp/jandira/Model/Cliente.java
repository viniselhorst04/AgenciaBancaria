package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Cliente {

    private String nome;
    private long cpf, rg, telefone;

    Scanner teclado = new Scanner(System.in);

    public void cadastrarCliente(){

        System.out.println(" ----------------- CADASTRAR CLIENTE ---------------- ");
        System.out.println("\n Informe seu nome: ");
        nome = teclado.nextLine();
        System.out.println(" Informe seu CPF: ");
        cpf = teclado.nextLong();
        System.out.println(" Informe seu RG: ");
        rg = teclado.nextLong();
        System.out.println(" Informe seu Telefone: ");
        telefone = teclado.nextLong();
        teclado.nextLine();
        System.out.println(" ---------------------------------------------------- ");

    }







    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf(){
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
}
