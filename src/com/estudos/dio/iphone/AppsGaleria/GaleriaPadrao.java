package com.estudos.dio.iphone.AppsGaleria;

public class GaleriaPadrao extends GaleriaDeFotosVideos{

    public void adicionarFoto() {
        System.out.println("Adicionando foto na galeria padrão.");
    }

    @Override
    public void editarFoto() {
        System.out.println("Editando foto na galeria padrão.");

    }

    @Override
    public void excluirFoto() {
        System.out.println("Excluindo foto na galeria padrão.");

    }
}
