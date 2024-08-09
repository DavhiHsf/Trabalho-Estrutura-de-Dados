
// ESTRUTURA DE DADOS - Projeto 1
// Davi Henrique Soares de Farias / 01625406
// Gabriel Azevedo de Oliveira Barros / 01644216
// João Pedro Nunes de França / 01626444
// Lucas Vinicius França Aires / 01627405

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.FileNotFoundException;

public class LeituraArq {

    public static void main(String[] args) {

    // Especificando o caminho do arquivo
    String caminhoArq = "C:\\Users\\henri\\OneDrive\\Meus Documentos\\Arquivos Uninassau\\Atividades - Códigos\\ED Projeto1 - Arquivos Modificados\\src\\Produto.txt";

        
	// ArrayList para armazenar os objetos Regpro
    ArrayList <RegProd> listaProdutos = new ArrayList<>();

    try {
        
        // Objeto File representando o arquivo
        File arquivo = new File(caminhoArq);

        // Objeto Scanner para ler o conteúdo do arquivo
        Scanner leitor = new Scanner(arquivo);

        // Loop para ler e adicionar cada linha ao ArrayList
        while (leitor.hasNextLine()) {

            String linha = leitor.nextLine();

            int codigo = Integer.parseInt(linha.substring(0, 2));

            String nome = linha.substring(3, 34);

            String valors = linha.substring(36, 41);

            double valor = Double.parseDouble(valors) / 100;

            int qtd = Integer.parseInt(linha.substring(43, 45));

            int categoria = Integer.parseInt(linha.substring(46, 47));

            // Criando e adicionando o objeto Regpro à lista
            listaProdutos.add(new RegProd(codigo, nome, valor, qtd, categoria));
            
        }

        // Adicionando itens manualmente ao ArrayList
        listaProdutos.add(new RegProd(78, "Meen Moilee", 10.99, 101, 3));

        listaProdutos.add(new RegProd(79, "Pani Puri", 5.99, 17, 4));

        listaProdutos.add(new RegProd(80, "Palak Paneer", 7.49, 75, 9));


        // Fechamento do Scanner
        leitor.close();
        
        // Formatação do preço
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        // Imprimindo os produtos da lista
        for (RegProd produto : listaProdutos) {
            
            System.out.println("\nDescrição do produto: " + produto.getDescricao());
            
            System.out.println("Preço do produto: R$" + df.format(produto.getPreco()));
            
            System.out.println("Categoria: " + produto.getCategoria() + "º");
            
            System.out.println("Código cadastral: " + produto.getCodigo());
            
            System.out.println("Quantidade em estoque: " + produto.getQtd() + " Produto(s)");
            
            System.out.println("___________________________");
            
            System.out.println();

    }
        
        // Manipulação direta aos itens do arquivo
        
        // Removendo um item
        listaProdutos.remove("");

        // Checando quantos elementos existem no arquivo
        System.out.println("Total de produtos em arquivo: " + listaProdutos.size()); // 

        // Checando se um elemento específico existe no arquivo
        //System.out.printf("%nO item \"xxx\" se encontra na lista%n%n", listaProdutos.contains("xxx") ? "": "não ");

    }

    // Tratamento de exceção caso o arquivo não seja localizado
    catch (FileNotFoundException e) {

            System.out.println("Erro! Caminho não localizado: " + caminhoArq + 
            "\nVerifique o caminho informado e tente novamente!");

        }
    }
}
