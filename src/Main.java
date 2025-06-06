public class Main {
    public static void main(String[] args) {
        ValidadorCartao validador = new ValidadorCartao();
        // Teste de validação de bandeira de cartão
        String[] cartoes = {
            "4111111111111111", // Visa
            "5105105105105100", // MasterCard
            "4011788888881881", // Elo
            "371449635398431",  // American Express     
            "6011111111111117", // Discover
            "6062828888888888", // Hipercard
            "1234567890123456"  // Bandeira desconhecida
        };

        for (String cartao : cartoes) {
            System.out.println("Cartão: " + cartao + " - Bandeira: " + validador.validarBandeira(cartao));
        }
    }
}