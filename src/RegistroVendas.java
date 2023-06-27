import java.util.ArrayList;
import java.util.List;

public class RegistroVendas {
    private double total;
    private List <Livro> lista = new ArrayList<>();

    public void adicionar(Livro livro){
        System.out.println("Livro adicionado: "+ livro.getNome());
        livro.aplicarDesconto(0.10);
        total = total + livro.getPreco();
        lista.add(livro);
    }
    void exibir(){
        System.out.println("---- LIVROS ADICIONADOS ----");
        lista.forEach(e -> e.exibirDados());
    }
}
