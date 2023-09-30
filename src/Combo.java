import java.util.ArrayList;

public class Combo {

    ArrayList<Produto> produtos = new ArrayList<>();

    public void CriarCombo(int tipo){

        if(tipo == 2) {
            produtos.add(new Sobremesa("Torta Holandesa", 15, "Grande"));
        }

        produtos.add(new Burguer("X-EGG", 15, 100));
        produtos.add(new Bebida("Coca-Cola", 8, 500));
    }

    @Override
    public String toString() {
        String combo = "";

        for (Produto produto: produtos) {
            combo += produto.toString() + "\n";
        }

        return combo;
    }
}