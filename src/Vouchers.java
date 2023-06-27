import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vouchers {
    List<String> itens = new ArrayList<>();

    public Vouchers(){
        itens.add("ETEC-teste");
        Random gerador = new Random();
        for (int i = 0; i<20; i++){
            String chave = "ETEC" + gerador.nextInt(30);
            itens.add(chave);
        }
    }
    void validar(String item){
        if (itens.contains(item)){
            System.out.println("Cupom válido");
        }
        else{
            System.out.println("Cupom inválido");
        }
    }
}
