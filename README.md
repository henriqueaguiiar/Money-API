# Money API Integration (Projeto em Construção)

Uma integração simples para consultar cotações em tempo real de criptomoedas e moedas internacionais.

## Descrição

O projeto "Money API Integration" oferece uma maneira fácil de consultar cotações financeiras ao vivo, incluindo tanto criptomoedas quanto moedas internacionais. Ele foi desenvolvido em Java e é ideal para ser utilizado em sistemas que precisam de dados atualizados sobre taxas de câmbio.

Este repositório utiliza APIs de diversas fontes para fornecer informações precisas e em tempo real sobre os valores das moedas e criptomoedas.

## Funcionalidades

- Consultar cotações de criptomoedas populares.
- Consultar cotações de moedas internacionais.
- API simples e fácil de integrar em outros projetos.
- Respostas rápidas com dados financeiros atualizados.

## Como Usar

### Requisitos

- Java 8 ou superior.
- Maven (para gerenciamento de dependências).

### Passos para Configuração

1. Clone este repositório:

   ```bash
   git clone https://github.com/henriqueaguiiar/Money-API-Integration.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd Money-API-Integration
   ```

3. Compile o projeto com Maven:

   ```bash
   mvn clean install
   ```

4. Importe o projeto em sua IDE favorita (como IntelliJ ou Eclipse).

### Usando a API

Para utilizar a API, você pode criar instâncias de classes específicas para consultar as cotações. Veja um exemplo básico de uso:

```java
public class Main {
    public static void main(String[] args) {
        CurrencyAPI currencyAPI = new CurrencyAPI();

        // Consultar a cotação do dólar em relação ao real
        double quote = currencyAPI.getCurrencyQuote("USD", "BRL");
        System.out.println("Cotação USD/BRL: " + quote);

        // Consultar a cotação do Bitcoin em relação ao dólar
        double btcQuote = currencyAPI.getCryptoQuote("BTC", "USD");
        System.out.println("Cotação BTC/USD: " + btcQuote);
    }
}
```

### APIs Suportadas

O projeto utiliza APIs públicas para buscar as cotações. Algumas das moedas e criptomoedas que podem ser consultadas incluem:

- Moedas internacionais como USD, EUR, GBP, BRL, etc.
- Criptomoedas como Bitcoin (BTC), Ethereum (ETH), Litecoin (LTC), etc.

## Contribuindo

Se você quiser contribuir para este projeto, fique à vontade para enviar um pull request. Sinta-se livre para relatar problemas ou sugerir melhorias!

### Como Contribuir:

1. Fork este repositório.
2. Crie uma nova branch (`git checkout -b feature-nova`).
3. Faça suas alterações e commit (`git commit -am 'Adicionando nova funcionalidade'`).
4. Envie para o seu repositório (`git push origin feature-nova`).
5. Envie um pull request para este repositório.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Contato

Para mais informações, entre em contato com o autor:

- Nome: Henrique Aguiar
- GitHub: [@henriqueaguiiar](https://github.com/henriqueaguiiar)

