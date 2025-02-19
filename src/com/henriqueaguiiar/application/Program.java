package com.henriqueaguiiar.application;

import com.henriqueaguiiar.entities.CoinAPI;
import com.henriqueaguiiar.entities.CoinService;
import com.henriqueaguiiar.entities.CryptoAPI;
import com.henriqueaguiiar.entities.CryptoService;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int consulta = 0;
        String criptomoeda, coin;

        System.out.println("**********  CRYPTO API SERVICE  **********");
        System.out.println("Digite o numero para selecionar a consulta: ");
        System.out.println("0 - Criptomoeda\n1 - Moeda");
        consulta = input.nextInt();
        input.nextLine();

        if (consulta == 0) {
            System.out.print("Digite a criptomoeda para exibir a cotação: ");
            criptomoeda = input.nextLine();
            CryptoAPI api = new CryptoAPI();
            CryptoService service = new CryptoService(api);
            service.exibirCotacao(criptomoeda);
        }else if(consulta == 1){
            System.out.println("Digite uma moeda para exibir a cotação:  ");
            coin = input.nextLine();
            CoinAPI coinAPI = new CoinAPI();
            CoinService coinService = new CoinService(coinAPI);
            coinService.exibirCotacao(coin);
        }else{
            System.out.println("Opção inválida");
        }

        input.close();
    }
}


