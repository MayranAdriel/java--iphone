package com.estudos.dio.iphone.AppsNavegadores;

public class NavegadorPadrao extends NavegadorInternet{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no navegador padrão.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador padrão.");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador padrão.");

    }
}
