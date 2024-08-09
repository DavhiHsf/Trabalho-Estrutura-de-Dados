
// ESTRUTURA DE DADOS - Projeto 2
// Davi Henrique Soares de Farias / 01625406
// Gabriel Azevedo de Oliveira Barros / 01644216
// João Pedro Nunes de França / 01626444
// Lucas Vinicius França Aires / 01627405

public class RegProd {

    private int qtd;
    private int cod;
    private int cat;

    private String desc;

    private double preco;

    public RegProd(int codigo, String descricao, double preco, int qtd, int categoria) {

        this.qtd = qtd;
        this.cod = codigo;
        this.preco = preco;
        this.cat = categoria;
        this.desc = descricao;

    }

    public int getCodigo() {
        return cod;

    }

    public void setCodigo(int codigo) {
        this.cod = codigo;

    }

    public String getDescricao() {
        return desc;

    }

    public void setDescricao(String descricao) {
        this.desc = descricao;

    }

    public double getPreco() {
        return preco;

    }

    public void setPreco(double preco) {
        this.preco = preco;

    }

    public int getQtd() {
        return qtd;

    }
    
    public void setQtd(int qtd) {
        this.qtd = qtd;

    }

    public int getCategoria() {
        return cat;

    }

    public void setCategoria(int categoria) {
    this.cat = categoria;
    
    }

    public static void remove(String string) {
        
    }

    public String toString() {

    return String.format("Descrição do produto: %s - Preço do produto: R$%.2f - Categoria: %d - Código cadastral: %d - Quantidade em estoque: %d Produto(s)",

    this.getDescricao(), this.getPreco(), this.getCategoria(), this.getCodigo(), this.getQtd());

    }

}

