package com.henriqueaguiiar.entities;

import com.henriqueaguiiar.interfaces.CotacaoAPI;

public class CotacaoService {
    private final CotacaoAPI api;

    public CotacaoService(CotacaoAPI api) {
        this.api = api;
    }

    public void exibirCotacao(String moeda) throws Exception {
        String cotacao = api.getCotacao(moeda);
        System.out.println("Cotação: " + cotacao);
    }
}
