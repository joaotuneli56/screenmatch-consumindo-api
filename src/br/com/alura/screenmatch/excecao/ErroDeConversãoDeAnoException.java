package br.com.alura.screenmatch.excecao;

public class ErroDeConversãoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErroDeConversãoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
