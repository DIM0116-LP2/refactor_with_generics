import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ProdutoService {

    public List<Produto> filter(List<Produto> produtos, Predicate<Produto> PisTrue){
        return produtos.stream()
                .filter(PisTrue)
                .toList();
    }

    public List<String> obterNomes(List<Produto> produtos) {
        return produtos.stream()
                .map(Produto::getNome) 
                .toList();
    }

    public List<Produto> ordenarPorPreco(List<Produto> produtos) {
        return produtos.stream()
                .sorted((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                .toList();
    }
}
