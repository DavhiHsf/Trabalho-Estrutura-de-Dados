
// ESTRUTURA DE DADOS - Projeto Final
// Davi Henrique Soares de Farias / 01625406

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class listaCliente {

    public static void main(String[] args) throws Exception {

        System.out.println("Início do programa");

        // Especificando o caminho do arquivo
        String caminhoArq = "C:\\Users\\henri\\Downloads\\Clientes.txt";

        // ArrayList para armazenar os objetos RegClient
        ArrayList <RegClient> listaClientes = new ArrayList<>();

        try {
            // Objeto File representando o arquivo
            File arquivo = new File(caminhoArq);

            // Objeto Scanner para ler o conteúdo do arquivo
            Scanner leitor = new Scanner(arquivo);

            // Loop para ler e adicionar cada linha ao ArrayList
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println("Linha lida: " + linha);

                // Quebra a linha usando ";" como delimitador
                String[] valores = linha.split(";");

                    String codigo = valores[0];
                    String nome = valores[1];
                    String pais = valores[2];

                    System.out.println("Código: " + codigo + ", Nome: " + nome + ", País: " + pais);

                    // Criando e adicionando o objeto RegClient à lista
                    listaClientes.add(new RegClient(codigo, nome, pais));
                }
            

            // Fechamento do Scanner
            leitor.close();

            // Imprimindo os clientes da lista
            for (RegClient cliente : listaClientes) {
                System.out.println(cliente);
            }

            // Checando quantos elementos existem na lista
            System.out.println("Quantidade de clientes após a leitura do arquivo: " + listaClientes.size());

        } catch (FileNotFoundException e) {
            System.out.println("Erro! Caminho não localizado: " + caminhoArq +
                    "\nVerifique o caminho informado e tente novamente!");
        }

        System.out.println("Fim do programa");
    }
}
