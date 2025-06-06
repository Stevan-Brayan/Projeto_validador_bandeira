# Projeto: Validador de Bandeira de Cartão de Crédito

Este projeto consiste em uma aplicação Java para validar bandeiras de cartões de crédito baseado no número deste. O código se baseia em expressões regulares para identificar as diferentes bandeiras.

## Estrutura básica do Projeto

- **`src/Main.java`**: Contém o ponto de entrada do programa e realiza os testes de validação de bandeiras de cartões.
- **`src/ValidadorCartao.java`**: Implementa a lógica de validação de bandeiras utilizando expressões regulares.
- **`assets/`**: Contém arquivos auxiliares, como imagens e configurações.

## Procedimento para executar o código:

1º - Ter o java instalado em sua máquina.[Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
2º - Compilar os arquivos Java: **`javac src/*.java`**
3º - Executar o programa: **`java -cp src Main`**

## Exemplos de cartões de crédito para teste:

Os exemplos de números de cartões de crédito utilizados no projeto foram retirados do site [4Devs](https://www.4devs.com.br/gerador_de_numero_cartao_credito), com exceção da bandeira Elo, que fornece geradores de números de cartões válidos para testes.

### Exemplos Utilizados:  
Visa: 4111111111111111  
MasterCard: 5105105105105100  
Elo: 4011788888881881  
American Express: 371449635398431  
Discover: 6011111111111117  
Hipercard: 6062828888888888  
Bandeira desconhecida: 1234567890123456

## Funcionamento

O programa utiliza a classe ValidadorCartao para verificar a bandeira de um número de cartão. A validação é feita com base em expressões regulares associadas a cada bandeira.

### Exemplo de Saída

Ao executar o programa, a saída será semelhante a esta:

Cartão: 4111111111111111 - Bandeira: Visa  
Cartão: 5105105105105100 - Bandeira: MasterCard  
Cartão: 4011788888881881 - Bandeira: Elo  
Cartão: 371449635398431 - Bandeira: American Express  
Cartão: 6011111111111117 - Bandeira: Discover  
Cartão: 6062828888888888 - Bandeira: Hipercard  
Cartão: 1234567890123456 - Bandeira: Bandeira desconhecida

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Licença

Este projeto é licenciado sob a MIT License. 
