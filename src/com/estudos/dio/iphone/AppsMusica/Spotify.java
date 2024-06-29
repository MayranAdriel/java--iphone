package com.estudos.dio.iphone.AppsMusica;

public class Spotify extends ReprodutorMusical{
    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica no spotify.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica no spotify.");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica no spotify.");

    }
}
