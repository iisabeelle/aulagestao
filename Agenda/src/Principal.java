import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Salvar contato");
            System.out.println("2 - Pesquisar contato");
            System.out.println("3 - Apagar contato");
            System.out.println("4 - Exibir contatos");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do contato:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o telefone do contato:");
                    String telefone = scanner.nextLine();
                     System.out.println("Digite o email do contato:");1
                    String email = scanner.nextLine();
                Contato contato = new Contato(nome, telefone, email);
                    agenda.salvarContato(contato);
                    break;
                case 2:
                    System.out.println("Digite o nome do contato:");
                    nome = scanner.nextLine();
                    agenda.pesquisarContato(nome);
                    break;
                case 3:
                    System.out.println("Digite o nome do contato:");
                    nome = scanner.nextLine();
                    agenda.apagarContato(nome);
                    break;
                case 4:
                    agenda.exibirContatos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        scanner.close();
    }

		
	}