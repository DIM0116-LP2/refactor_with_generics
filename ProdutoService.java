import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ProdutoService {

    public List<Produto> filter(List<Produto> produtos,
                                Predicate<Produto> PisTrue){
        List<Produto> ret = new ArrayList<>();

        for (Produto prod : produtos){
            if (PisTrue.test(prod)){
                ret.add(prod);
            }
        }

        return ret;
    }

    public List<String> obterNomes(
            List<Produto> produtos) {

        List<String> nomes = new ArrayList<>();

        for (Produto produto : produtos) {
            nomes.add(produto.getNome());
        }

        return nomes;
    }

    public void ordenarPorPreco(List<Produto> produtos) {

        Collections.sort(
            produtos,
            new Comparator<Produto>() {

                @Override
                public int compare(Produto p1, Produto p2) {

                    return Double.compare(
                        p1.getPreco(),
                        p2.getPreco()
                    );
                }
            }
        );
    }
}
