import java.util.*;

public class Vouchers {
    Set<String> itens = new HashSet<>();

    public Vouchers(){
        itens.add("ETEC-teste");
        Random gerador = new Random();
        for (int i = 0; i<20; i++){
            String chave = "etec" + gerador.nextInt(30);
            itens.add(chave);
        }
    }
    void validar(String item){
        // stream é uma estrutura que permite manipular listas
        // converter objetos
        var result =  itens.stream().filter(e -> item.equalsIgnoreCase(e)).findAny();
        if (result.isPresent()){
            System.out.println("Cpom válido");
        }
        else {
            System.out.println("Cupom inválido");
        }
    }

    void exibir(){
        itens.forEach((e -> System.out.println(e)));
    }
}
