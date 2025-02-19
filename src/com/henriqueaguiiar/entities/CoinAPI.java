package com.henriqueaguiiar.entities;

import com.henriqueaguiiar.interfaces.CotacaoAPI;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoinAPI implements CotacaoAPI {
    @Override
    public String getCotacao(String moeda) throws Exception {
        String endereco = "https://economia.awesomeapi.com.br/json/last/" + moeda;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
