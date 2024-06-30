import java.util.ArrayList;
import java.util.List;

public class Pilha {
    private List<Integer> estrutura;

    Pilha() {
        this.estrutura = new ArrayList<Integer>();
    }

    public void push (Integer numero) {
        this.estrutura.addFirst(numero);
    }

    public Integer pop () {
        if (!this.estrutura.isEmpty()) {
             return this.estrutura.removeFirst();
        }

        return null;
    }

    public Integer top () {
        if (!this.estrutura.isEmpty()) {
            return this.estrutura.getFirst();
        }

        return null;
    }

    public Boolean isEmpty () {
        if (this.estrutura.isEmpty()) {
            return true;
        }

        return false;
    }

    public Integer size () {
        if (!this.estrutura.isEmpty()) {
            return this.estrutura.size();
        }

        return null;
    }
}
