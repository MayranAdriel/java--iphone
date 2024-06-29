package com.estudos.dio.iphone.AppsTelefones;

public class TelefonePadrao extends AparelhoTelefonico{
    @Override
    public void ligar() {
        System.out.println("Ligando através do aparelho telefonico padrão.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo através do aparelho telefonico padrão.");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz através do aparelho telefonico padrão.");

    }
}
