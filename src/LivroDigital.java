public class LivroDigital extends  Livro {
    private String marcaDagua;

    public LivroDigital(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    void aplicarDesconto(double percentual) {
        if (percentual > 0.15)
            System.out.println("Desconto não permitido");
        else
            preco = preco -(preco * percentual);
    }

    @Override
    void exibirDados() {
        super.exibirDados();
        System.out.println("Marca d'água:" + marcaDagua);
    }

    public String getMarcaDagua() {
        return marcaDagua;
    }

    public void setMarcaDagua(String marcaDagua) {
        this.marcaDagua = marcaDagua;
    }

}
