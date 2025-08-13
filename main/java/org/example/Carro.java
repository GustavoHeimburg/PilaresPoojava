package org.example;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void ligar(){
        System.out.println(marca + " " + modelo + " esta ligado");

    }
    public void desligar(){
        System.out.println(marca + " " + modelo + " esta desligado");
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro("BMW", "Ford", 1980);
        meuCarro.ligar();
        meuCarro.desligar();
    }
}
