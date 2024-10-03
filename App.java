import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();

        ContaCorrente conta = new ContaCorrente(titular);

        int opcao;


        
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Enviar Pix");
            System.out.println("4. Adicionar Chave Pix Favorita");
            System.out.println("5. Mostrar Histórico de Transações");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: R$ ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.print("Digite a chave Pix para enviar: ");
                    String chavePix = scanner.next();
                    System.out.print("Digite o valor a ser enviado: R$ ");
                    double valorPix = scanner.nextDouble();
                    conta.enviarPix(chavePix, valorPix);
                    break;
                case 4:
                    System.out.print("Digite a chave Pix a ser adicionada: ");
                    String novaChavePix = scanner.next();
                    System.out.print("Digite a descrição da chave Pix: ");
                    String descricaoChave = scanner.next();
                    conta.adicionarChavePixFavorita(novaChavePix, descricaoChave);
                    break;
                case 5:
                    conta.mostrarHistorico();
                    break;
                case 6:
                    System.out.println("Saindo do aplicativo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}