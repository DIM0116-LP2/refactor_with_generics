import java.util.ArrayList;
import java.util.List;

public class Repository<T>{

    List<T> repo = new ArrayList<>();

    public void adicionar(T input){ repo.add(input); }

    public List<T> listarTodos(){ return List.copyOf(repo); }

}
