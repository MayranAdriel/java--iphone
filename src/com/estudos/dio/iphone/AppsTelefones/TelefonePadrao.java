package com.estudos.dio.iphone.AppsTelefones;

public class TelefonePadrao extends AparelhoTelefonico{
    @Override
    void ligar() {
        System.out.println("Ligando através do aparelho telefonico padrão.");
    }

    @Override
    void atender() {
        System.out.println("Atendendo através do aparelho telefonico padrão.");

    }

    @Override
    void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz através do aparelho telefonico padrão.");

    }
}
