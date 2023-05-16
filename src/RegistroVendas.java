public class RegistroVendas {
    private double total;

    public void adicionar(LivroFisico lf){
        System.out.println("Livro adicionado: "+ lf.getNome());
        lf.aplicarDesconto(0.10);
        total = total + lf.getPreco();
    }
    public void adicionar(LivroDigital ld){
        System.out.println("Livro adicionado: "+ ld.getNome());
        ld.aplicarDesconto(0.10);
        total = total + ld.getPreco();
    }
}
