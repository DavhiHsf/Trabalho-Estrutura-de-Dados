
// ESTRUTURA DE DADOS - Projeto 1, 2 e 3
// Davi Henrique Soares de Farias / 01625406
// Gabriel Azevedo de Oliveira Barros / 01644216
// João Pedro Nunes de França / 01626444
// Lucas Vinicius França Aires / 01627405

// Declaração da classe RegProd (Registro de Produto)
public class RegProd {

    // Atributos privados que representam as características do produto
    private int qtd;      // Quantidade em estoque
    private int cod;      // Código cadastral
    private int cat;      // Categoria do produto
    private String desc;  // Descrição do produto
    private double preco; // Preço do produto

    // Construtor que inicializa os atributos com os valores passados como parâmetros
    public RegProd(int codigo, String descricao, double preco, int qtd, int categoria) {

        this.qtd = qtd;
        this.cod = codigo;
        this.preco = preco;
        this.cat = categoria;
        this.desc = descricao;

    }

    // Métodos de acesso para obter e modificar o código do produto
    public int getCodigo() {

        return cod;

    }

    public void setCodigo(int codigo) {

        this.cod = codigo;

    }

    // Métodos de acesso para obter e modificar a descrição do produto
    public String getDescricao() {

        return desc;

    }

    public void setDescricao(String descricao) {

        this.desc = descricao;

    }

    // Métodos de acesso para obter e modificar o preço do produto
    public double getPreco() {

        return preco;

    }

    public void setPreco(double preco) {

        this.preco = preco;

    }

    // Métodos de acesso para obter e modificar a quantidade em estoque do produto
    public int getQtd() {

        return qtd;

    }

    public void setQtd(int qtd) {

        this.qtd = qtd;

    }

    // Métodos de acesso para obter e modificar a categoria do produto
    public int getCategoria() {

        return cat;

    }

    public void setCategoria(int categoria) {

        this.cat = categoria;

    }

    // Método toString para representar o objeto em formato de string
    @Override
    public String toString() {

        // Retorna uma string formatada com as informações do produto
        return String.format("Descrição do produto: %s - Preço do produto: R$%.2f - Categoria: %d - Código cadastral: %d - Quantidade em estoque: %d Produto(s)",

        this.getDescricao(), this.getPreco(), this.getCategoria(), this.getCodigo(), this.getQtd());

    }
}

