package com.estudos.dio.iphone.AppsMusica;

public class Spotify extends ReprodutorMusical{
    @Override
    void tocarMusica() {
        System.out.println("Tocando musica no spotify.");
    }

    @Override
    void pausarMusica() {
        System.out.println("Pausando musica no spotify.");

    }

    @Override
    void selecionarMusica() {
        System.out.println("Selecionando musica no spotify.");

    }
}
