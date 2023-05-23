public class LivroFisico extends Livro{

    public LivroFisico(String nome, double preco) {
        super(nome, preco);
    }

    public double getTaxaImpressão(){
        return preco * 0.05;
    }

    void aplicarDesconto(double percentual) {
        if (percentual > 0.3)
            System.out.println("Desconto não permitido");
        else
            preco = preco - (preco * percentual);
    }
}
