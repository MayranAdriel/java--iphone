package com.estudos.dio.iphone;

import com.estudos.dio.iphone.AppsGaleria.GaleriaPadrao;
import com.estudos.dio.iphone.AppsMusica.Spotify;
import com.estudos.dio.iphone.AppsNavegadores.NavegadorPadrao;
import com.estudos.dio.iphone.AppsTelefones.TelefonePadrao;

public class Iphone {
    public static void main(String[] args) {
        GaleriaPadrao galeriaPadrao = new GaleriaPadrao();
        Spotify spotify = new Spotify();
        NavegadorPadrao navegadorPadrao = new NavegadorPadrao();
        TelefonePadrao telefonePadrao = new TelefonePadrao();

        galeriaPadrao.adicionarFoto();
        galeriaPadrao.editarFoto();
        galeriaPadrao.excluirFoto();

        spotify.selecionarMusica();
        spotify.tocarMusica();
        spotify.pausarMusica();

        navegadorPadrao.adicionarNovaAba();
        navegadorPadrao.atualizarPagina();
        navegadorPadrao.exibirPagina();

        telefonePadrao.atender();
        telefonePadrao.iniciarCorreioVoz();
        telefonePadrao.ligar();


    }


}
