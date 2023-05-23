public class RegistroVendas {
    private double total;

    public void adicionar(Livro livro){
        System.out.println("Livro adicionado: "+ livro.getNome());
        livro.aplicarDesconto(0.10);
        total = total + livro.getPreco();
    }
}
