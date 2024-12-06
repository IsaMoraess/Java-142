//ENTIDADE
public class Produto {
    //CRIAR ATRIBUTOS
    public String nome;
    public double preco;
    public int quantiEstoque;

    //CRIAR METODOS
    public double totalValorEstoque(){
        return preco * quantiEstoque;
    }

    public void addProduto(int quantiEstoque){
        this.quantiEstoque += quantiEstoque; // + pq add um produto
    }

    public void removeProduto(int quantiEstoque){
        this.quantiEstoque -= quantiEstoque; // - pq remove um produto
    }

    //USANDO O (toString)
    public String toString(){
        return nome
        + ", R$ "
        + String.format("%.2f", preco)
        + ", "
        + quantiEstoque
        + " unidades, Total: R$ "
        + String.format("%.2f", totalValorEstoque());
    }
}
