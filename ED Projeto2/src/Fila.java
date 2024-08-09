
// ESTRUTURA DE DADOS - Projeto 2
// Davi Henrique Soares de Farias / 01625406
// Gabriel Azevedo de Oliveira Barros / 01644216
// João Pedro Nunes de França / 01626444
// Lucas Vinicius França Aires / 01627405

import java.io.File;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
import java.text.DecimalFormat;
import java.io.FileNotFoundException;

public class Fila  {

    public static void main(String[] args) throws Exception {

// Especificando o caminho do arquivo
String caminhoArq = "C:\\Users\\henri\\OneDrive\\Meus Documentos\\Arquivos Uninassau\\Atividades - Códigos\\ED Projeto2 - Arquivos Modificados\\src\\Produto.txt";

// Fila para armazenar os objetos Regpro
Queue <RegProd> filaProdutos = new LinkedList<>();

try {

    // Objeto File representando o arquivo
    File arquivo = new File(caminhoArq);

    // Objeto Scanner para ler o conteúdo do arquivo
    Scanner leitor = new Scanner(arquivo);

    // Loop para ler e adicionar cada linha à fila
    while (leitor.hasNextLine()) {

        String linha = leitor.nextLine();

        int codigo = Integer.parseInt(linha.substring(0, 2));

        String nome = linha.substring(3, 34);

        String valors = linha.substring(36, 41);

        double valor = Double.parseDouble(valors) / 100;

        int qtd = Integer.parseInt(linha.substring(43, 45));
        
        int categoria = Integer.parseInt(linha.substring(46, 47));

        // Criando e adicionando o objeto Regpro à fila
        filaProdutos.add(new RegProd(codigo, nome, valor, qtd, categoria));

    }

        // Adicionando itens manualmente à fila
        filaProdutos.add(new RegProd(78, "Meen Moilee", 10.99, 101, 3));

        filaProdutos.add(new RegProd(79, "Pani Puri", 5.99, 17, 4));

        filaProdutos.add(new RegProd(80, "Palak Paneer", 7.49, 75, 9));

    // Fechamento do Scanner
    leitor.close();

    // Formatação do preço
    DecimalFormat df = new DecimalFormat("#,##0.00");

    // Imprimindo os produtos da lista na fila
    System.out.println("Elementos da fila: ");

    for (RegProd produto : filaProdutos) {

        System.out.println("Descrição do produto: " + produto.getDescricao());
        
        System.out.println("Preço do produto: R$" + df.format(produto.getPreco()));
        
        System.out.println("Categoria: " + produto.getCategoria() + "º");
        
        System.out.println("Código cadastral: " + produto.getCodigo());
        
        System.out.println("Quantidade em estoque: " + produto.getQtd() + " Produto(s)");
        
        System.out.println("___________________________");
        
        System.out.println();

    }

        // Manipulação direta aos itens da fila
        
        System.out.println("Quantidade de elementos na fila: " + filaProdutos.size() + " elementos");

        System.out.println("\nPrimeiro elemento da fila: " + filaProdutos.peek());

        System.out.println("\nRemovendo um elemento da fila, que como não foi especificado, removerá o primeiro inserido na mesma: " + filaProdutos.remove());

        // Retirando 5 elementos da fila
        for (int i = 0; i < 5; i++) {

        if (!filaProdutos.isEmpty()) {

            RegProd removerProduto = filaProdutos.remove();

            System.out.println("\nElemento removido: " + removerProduto.getDescricao());

        } 
        
        else {

            System.out.println("\nFila vazia! Não há nada a remover!");
            break;

            }
        }

        System.out.println("\nFila após a remoção do elemento: ");
        for (RegProd produto : filaProdutos) {

        System.out.println("Descrição do produto: " + produto.getDescricao());
        
        System.out.println("Preço do produto: R$" + df.format(produto.getPreco()));
        
        System.out.println("Categoria: " + produto.getCategoria() + "º");
        
        System.out.println("Código cadastral: " + produto.getCodigo());
        
        System.out.println("Quantidade em estoque: " + produto.getQtd() + " Produto(s)");
        
        System.out.println("___________________________");

        System.out.println();

        }

        System.out.println("Quantidade de elementos na fila depois da remoção: " + filaProdutos.size() + "\n");


    } 
    
        // Tratamento de exceção caso o arquivo não seja localizado
        catch (FileNotFoundException e) {

        System.out.println("Erro! Caminho não localizado: " + caminhoArq +
        "\nVerifique o caminho informado e tente novamente!");

        }
    }
}