package br.senai.sp.jandira.Model;

public class Conta {

    private String agencia = "1258-X";
    private int numeroConta = 549687;
    private double saldo = 6943.80;


    public void realizarDeposito(double valor){

        this.saldo += valor;
        System.out.println(" O saldo disponivel é : " + this.saldo);

    }
    public void realizarSaque(double valor){

        boolean validaSaque = avaliarSaque(valor);

        if (validaSaque) {
            this.saldo -= valor;
            System.out.println(" O saldo disponivel é : " + this.saldo);

        }else {
            System.out.println(" SAQUE INDISPONIVEL!! Pois o saldo disponivel é: " + this.saldo);
        }

    }
    public void consultarSaldo(){

        System.out.println(" O saldo disponivel é : " + this.saldo);
    }

    public boolean avaliarSaque(double valor){
        if (this.saldo >= valor){
            return true;
        }else {
            return false;
        }

    }

}
