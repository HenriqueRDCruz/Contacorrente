import java.util.HashMap;
import java.util.Map;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    private String titular;
    private double saldo;
    private Map<String, String> chavesPixFavoritas;
    private List<String> historicoTransacoes;

    // Constructor
    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.chavesPixFavoritas = new HashMap<>();
        this.historicoTransacoes = new ArrayList<>();
    }

    // Métodos Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para sacar
    public void sacar(double valor) {
        try {
            if (valor <= 0) {
                throw new IllegalArgumentException("Valor de saque inválido.");
            }
            if (valor > saldo) {
                throw new IllegalArgumentException("Saldo insuficiente.");
            }
            saldo -= valor;
            historicoTransacoes.add("Saque: R$" + valor);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        } finally {
            System.out.println("Operação de saque finalizada.");
        }
    }

    // Método para depositar
    public void depositar(double valor) {
        try {
            if (valor <= 0) {
                throw new IllegalArgumentException("Valor de depósito inválido.");
            }
            saldo += valor;
            historicoTransacoes.add("Depósito: R$" + valor);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao depositar: " + e.getMessage());
        } finally {
            System.out.println("Operação de depósito finalizada.");
        }
    }

    // Método para enviar Pix
    public void enviarPix(String chavePix, double valor) {
        try {
            if (!chavesPixFavoritas.containsKey(chavePix)) {
                throw new IllegalArgumentException("Chave Pix não encontrada.");
            }
            if (valor <= 0 || valor > saldo) {
                throw new IllegalArgumentException("Valor de envio Pix inválido.");
            }
            saldo -= valor;
            historicoTransacoes.add("Envio de Pix: R$" + valor + " para " + chavePix);
            System.out.println("Pix enviado com sucesso para " + chavePix);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao enviar Pix: " + e.getMessage());
        } finally {
            System.out.println("Operação de envio de Pix finalizada.");
        }
    }

    // Método para adicionar chave Pix favorita
    public void adicionarChavePixFavorita(String chavePix, String descricao) {
        try {
            chavesPixFavoritas.put(chavePix, descricao);
        } catch (Exception e) {
            System.out.println("Erro ao adicionar chave Pix favorita: " + e.getMessage());
        } finally {
            System.out.println("Operação de adição de chave Pix finalizada.");
        }
    }

    // Método para visualizar histórico de transações
    public void mostrarHistorico() {
        try {
            if (historicoTransacoes.isEmpty()) {
                System.out.println("Nenhuma transação registrada.");
            } else {
                System.out.println("Histórico de Transações:");
                for (String transacao : historicoTransacoes) {
                    System.out.println(transacao);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao mostrar histórico de transações: " + e.getMessage());
        } finally {
            System.out.println("Operação de visualização do histórico finalizada.");
        }
    }
}