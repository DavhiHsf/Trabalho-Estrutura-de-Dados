
// ESTRUTURA DE DADOS - Projeto Final
// Davi Henrique Soares de Farias / 01625406

// Declaração da classe RegClient (Registro de Cliente)
public class RegClient {

    // Atributos privados que representam as características do cliente
    private String cod;   // Código do cliente
    private String pais;  // País de origem do cliente
    private String nome;  // Nome do cliente

    // Construtor que inicializa os atributos com os valores passados como parâmetros
    public RegClient(String codigo, String nome, String pais) {

        this.cod = codigo;
        this.pais = pais;
        this.nome = nome;

    }

    // Métodos de acesso para obter e modificar o código do cliente
    public String getCodigo() {
        return cod;
    }

    public void setCodigo(String codigo) {
        this.cod = codigo;
    }

    // Métodos de acesso para obter e modificar o nome do cliente
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos de acesso para obter e modificar o pais de origem do cliente
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    // Método toString para representar o objeto em formato de string
    public String toString() {
        // Retorna uma string formatada com as informações do cliente
        return String.format("Nome do cliente: %s - Código do cliente: %s - País de origem do cliente: %s",
                this.getNome(), this.getPais(), this.getCodigo());
    }
}

