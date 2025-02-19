package com.henriqueaguiiar.entities;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CryptoAPI {
    public String getCotacao(String criptomoeda) throws Exception {
        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptomoeda + "&vs_currencies=usd";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}