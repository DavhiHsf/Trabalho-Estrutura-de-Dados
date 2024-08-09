
// ESTRUTURA DE DADOS - Projeto 3
// Davi Henrique Soares de Farias / 01625406
// Gabriel Azevedo de Oliveira Barros / 01644216
// João Pedro Nunes de França / 01626444
// Lucas Vinicius França Aires / 01627405

// Importa a classe Scanner para a leitura de entrada do usuário
import java.util.Scanner;

// Declaração da classe Menu
public class Menu {

    // Método principal (main) que pode lançar exceções (throws Exception)
    public static void main(String[] args) throws Exception {
        
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner ler = new Scanner(System.in);

    // Declaração da variável para armazenar a opção do usuário
    int opcao;

    // Loop principal do programa, que continua enquanto o usuário não escolher encerrar (opção 0)
    do {

        // Exibe o menu de seleção
        System.out.println("\nMenu de Seleção: ");

        System.out.println("\n1 - Chamar Classe lerArraylist");
        System.out.println("2 - Chamar Classe Fila");
        System.out.println("3 - Chamar Classe Pilha");
        System.out.println("0 - Encerrar o programa");

        System.out.print("\nEscolha uma das opções acima: "); 
        
        // Lê a opção do usuário
        opcao = ler.nextInt();

        ler.nextLine(); // Consome a quebra de linha pendente

        // Estrutura switch para lidar com a escolha do usuário
        switch (opcao) {

            case 1:

            // Caso o usuário escolha a opção 1, chama a Classe lerArrayList
            System.out.println("\nChamando Classe lerArrayList, aguarde..."); lerArrayList.main(args);

            System.out.println("\nVocê chamou a Classe lerArrayList!");

            // Variável para armazenar a opção do submenu
            int opcaoSubmenu;

        // Loop do submenu, permite voltar ao menu principal ou encerrar o programa
        do {

            System.out.println("\n1 - Voltar ao Menu de Seleção");
            System.out.println("0 - Encerrar o programa");

            System.out.print("\nEscolha uma das opções acima: ");
            opcaoSubmenu = ler.nextInt();

            // Estrutura switch para lidar com as opções do submenu
            switch (opcaoSubmenu) {

                case 1:
                    // Voltar ao Menu de Seleção
                    break;

                case 0:

                    // Encerrar o programa
                    System.out.println("\nEncerrando o programa...");
                    System.out.println("Programa encerrado!");

                    break;

                default:
                
                    System.out.println("Essa opção não existe em nosso menu! Leia com atenção e escolha novamente!");
            }

    } while (opcaoSubmenu != 1);

            break;

            case 2:

            // Caso o usuário escolha a opção 2, chama a Classe Fila
            System.out.println("Chamando Classe Fila, aguarde..."); Fila.main(args);

            System.out.println("Você chamou a Classe Fila!");

        // Loop do submenu, permite voltar ao menu principal ou encerrar o programa
        do {

            System.out.println("\n1 - Voltar ao Menu de Seleção");
            System.out.println("0 - Encerrar o programa");

            // Estrutura switch para lidar com as opções do submenu
            System.out.print("\nEscolha uma das opções acima: ");
            opcaoSubmenu = ler.nextInt();

            switch (opcaoSubmenu) {

                case 1:
                    // Voltar ao Menu de Seleção
                    break;

                case 0:

                    // Encerrar o programa
                    System.out.println("\nEncerrando o programa...");
                    System.out.println("Programa encerrado!");

                    break;

                default:
                
                    System.out.println("Essa opção não existe em nosso menu! Leia com atenção e escolha novamente!");
            }

    } while (opcaoSubmenu != 1);

            break;

            case 3:

            // Caso o usuário escolha a opção 3, chama a Classe Pilha
            System.out.println("Chamando Classe Pilha, aguarde..."); Pilha.main(args);

            System.out.println("Você chamou a Classe Pilha!");

        // Loop do submenu, permite voltar ao menu principal ou encerrar o programa
        do {

            System.out.println("\n1 - Voltar ao Menu de Seleção");
            System.out.println("0 - Encerrar o programa");

            System.out.print("\nEscolha uma das opções acima: ");
            opcaoSubmenu = ler.nextInt();

            // Estrutura switch para lidar com as opções do submenu
            switch (opcaoSubmenu) {

                case 1:
                    // Voltar ao Menu de Seleção
                    break;

                case 0:

                    // Encerrar o programa
                    System.out.println("\nEncerrando o programa...");
                    System.out.println("Programa encerrado!");

                    break;

                default:
                
                    System.out.println("Essa opção não existe em nosso menu! Leia com atenção e escolha novamente!");
            }
        
    } while (opcaoSubmenu != 1);

            break;

            case 0:

            // Caso o usuário escolha a opção 0, encerra o programa
            System.out.println("\nEncerrando o programa...");
            System.out.println("Programa encerrado!");

            break;

        default:

            // Caso o usuário escolha uma opção inválida
            System.out.println("\nEssa opção não existe em nosso menu! Leia com atenção e escolha novamente!");

            break;
        
        }
    
    } while (opcao != 0); // Continua o loop principal enquanto o usuário não escolher encerrar

    // Fecha o Scanner para evitar vazamento de recursos
    ler.close();
    
    }
}

