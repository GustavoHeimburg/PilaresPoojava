package org.example;

import javax.imageio.stream.ImageInputStreamImpl;

public class ContaBancaria {
    private String NumeroConta;
    private double saldo;

    public ContaBancaria(String NumeroConta, double SaldoInicial){
        this.NumeroConta = NumeroConta;
        this.saldo = SaldoInicial;
    }
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Deposito efetuado foi de: "+valor+ "reais");
        }else {
            System.out.println("Valor de depsoito invalido!");
        }
    }
    public void sacar(double valor){
        if (valor > 0){
            saldo -= valor;
            System.out.println("Saque efetuado foi de: "+valor+ "reais");
        }else{
            System.out.println("Valor de saque insuficiente!");
        }
    }
    public double getsaldo(){
    return saldo;

}

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345", 2300);

        conta.depositar(220);
        conta.sacar(50);
        System.out.println("Saldo atual da conta é de: "+conta.getsaldo());
    }
}
