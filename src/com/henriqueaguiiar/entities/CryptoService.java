package com.henriqueaguiiar.entities;

public class CryptoService {
    private final CryptoAPI api;

    public CryptoService(CryptoAPI api) {
        this.api = api;
    }

    public void exibirCotacao(String criptomoeda) throws Exception {
        String cotacao = api.getCotacao(criptomoeda);
        System.out.println("Cotação: " + cotacao);
    }
}