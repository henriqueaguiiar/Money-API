package com.henriqueaguiiar.application;

import com.henriqueaguiiar.entities.CotacaoService;
import com.henriqueaguiiar.entities.CryptoAPI;
import com.henriqueaguiiar.entities.CoinAPI;
import com.henriqueaguiiar.interfaces.CotacaoAPI;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int consulta;

        System.out.println("**********  MONEY API SERVICE  **********\n");

        while (true) {
            System.out.println("Digite o número para selecionar a consulta: ");
            System.out.println("0 - Criptomoeda\n1 - Moeda");
            consulta = input.nextInt();
            input.nextLine();

            if (consulta == 0 || consulta == 1) {
                break;
            }
            System.out.println("Opção inválida. Tente novamente.");
        }

        System.out.print("Digite a moeda para exibir a cotação: ");
        String moeda = input.nextLine();

        CotacaoAPI api;
        if (consulta == 0) {
            api = new CryptoAPI();
        } else {
            api = new CoinAPI();
        }

        CotacaoService service = new CotacaoService(api);
        service.exibirCotacao(moeda);

        input.close();
    }
}
