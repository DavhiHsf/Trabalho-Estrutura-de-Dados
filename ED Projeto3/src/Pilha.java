
// ESTRUTURA DE DADOS - Projeto 2
// Davi Henrique Soares de Farias / 01625406
// Gabriel Azevedo de Oliveira Barros / 01644216
// João Pedro Nunes de França / 01626444
// Lucas Vinicius França Aires / 01627405

import java.io.File;
import java.util.Stack;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.FileNotFoundException;

public class Pilha {

    public static void main(String[] args) throws Exception {

// Especificando o caminho do arquivo
String caminhoArq = "C:\\Users\\henri\\OneDrive\\Meus Documentos\\Arquivos Uninassau\\Atividades - Códigos\\ED Projeto2 - Arquivos Modificados\\src\\Produto.txt";

// Pilha para armazenar os objetos Regpro
Stack <RegProd> pilhaProdutos = new Stack<>();

try {

    // Objeto File representando o arquivo
    File arquivo = new File(caminhoArq);

    // Objeto Scanner para ler o conteúdo do arquivo
    Scanner leitor = new Scanner(arquivo);

    // Loop para ler e adicionar cada linha à pilha
    while (leitor.hasNextLine()) {

        String linha = leitor.nextLine();

        int codigo = Integer.parseInt(linha.substring(0, 2));

        String nome = linha.substring(3, 34);

        String valors = linha.substring(36, 41);

        double valor = Double.parseDouble(valors) / 100;

        int qtd = Integer.parseInt(linha.substring(43, 45));

        int categoria = Integer.parseInt(linha.substring(46, 47));

        // Criando e adicionando o objeto Regpro à pilha
        pilhaProdutos.push(new RegProd(codigo, nome, valor, qtd, categoria));
    }

        // Adicionando itens manualmente à pilha
        pilhaProdutos.push(new RegProd(78, "Meen Moilee", 10.99, 101, 3));

        pilhaProdutos.push(new RegProd(79, "Pani Puri", 5.99, 17, 4));

        pilhaProdutos.push(new RegProd(80, "Palak Paneer", 7.49, 75, 9));

    // Fechamento do Scanner
    leitor.close();

    // Formatação do preço
    DecimalFormat df = new DecimalFormat("#,##0.00");

    // Imprimindo os produtos da lista na pilha
    System.out.println("Elementos da pilha: ");

    for (RegProd produto : pilhaProdutos) {

        System.out.println("Descrição do produto: " + produto.getDescricao());

        System.out.println("Preço do produto: R$" + df.format(produto.getPreco()));

        System.out.println("Categoria: " + produto.getCategoria() + "º");

        System.out.println("Código cadastral: " + produto.getCodigo());

        System.out.println("Quantidade em estoque: " + produto.getQtd() + " Produto(s)");

        System.out.println("___________________________\n");

    }

        // Manipulação direta aos itens da fila
        
        System.out.println("\nQuantidade de elementos na pilha: " + pilhaProdutos.size() + " elementos");

        System.out.println("\n Elemento no topo da pilha: " + pilhaProdutos.peek());

        System.out.println("\nRemovendo um elemento da pilha, que como não foi especificado, removerá o que se encontra no topo da mesma: " + pilhaProdutos.pop());

        // Retirando 5 elementos da pilha
        for (int i = 0; i < 5; i++) {

            if (!pilhaProdutos.isEmpty()) {
    
                RegProd removerProduto = pilhaProdutos.pop();
    
                System.out.println("\nElemento removido: " + removerProduto.getDescricao());
    
            } 
            
            else {
    
                System.out.println("\nPilha vazia! Não há nada a remover!");
                break;
    
                }
            }

        System.out.println("\nPilha após a remoção do elemento: ");
        for (RegProd produto : pilhaProdutos) {

        System.out.println("Descrição do produto: " + produto.getDescricao());
        
        System.out.println("Preço do produto: R$" + df.format(produto.getPreco()));
        
        System.out.println("Categoria: " + produto.getCategoria() + "º");
        
        System.out.println("Código cadastral: " + produto.getCodigo());
        
        System.out.println("Quantidade em estoque: " + produto.getQtd() + " Produto(s)");
        
        System.out.println("___________________________");

        System.out.println();

        }

        System.out.println("Quantidade de elementos na pilha depois da remoção: " + pilhaProdutos.size() + "\n");

    }

        catch (FileNotFoundException e) {

        System.out.println("Erro! Caminho não localizado: " + caminhoArq +
        "\nVerifique o caminho informado e tente novamente!");

        }
    }
}