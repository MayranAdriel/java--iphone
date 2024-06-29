package com.estudos.dio.iphone.AppsGaleria;

public class GaleriaPadrao extends GaleriaDeFotosVideos{
    @Override
    void adicionarFoto() {
        System.out.println("Adicionando foto na galeria padrão.");
    }

    @Override
    void editarFoto() {
        System.out.println("Editando foto na galeria padrão.");

    }

    @Override
    void excluirFoto() {
        System.out.println("Excluindo foto na galeria padrão.");

    }
}
