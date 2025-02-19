package com.henriqueaguiiar.entities;

public class CoinService {
    private final CoinAPI coinAPI;

    public CoinService(CoinAPI coinAPI) {
        this.coinAPI = coinAPI;
    }

    public void exibirCotacao(String coin) throws Exception {
        String cotacao = coinAPI.getCotacao(coin);
        System.out.println("Cotação: " + cotacao);
    }
}
