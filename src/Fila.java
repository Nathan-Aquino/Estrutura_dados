import java.util.ArrayList;
import java.util.List;

public class Fila {
    private List<Integer> estrutura;

    Fila() {
        this.estrutura = new ArrayList<Integer>();
    }

    public void enqueue (Integer numero) {
        this.estrutura.add(numero);
    }

    public void dequeue () {
        if (!this.estrutura.isEmpty()) {
            this.estrutura.removeFirst();
        }
    }

    public Integer rear () {
        if (!this.estrutura.isEmpty()) {
            return this.estrutura.getLast();
        }

        return null;
    }

    public Integer front () {
        if (!this.estrutura.isEmpty()) {
            return this.estrutura.getFirst();
        }

        return null;
    }

    public Integer size () {
        if (!this.estrutura.isEmpty()) {
            return this.estrutura.size();
        }

        return null;
    }

    public Boolean isEmpty () {
        if (this.estrutura.isEmpty()) {
            return true;
        }

        return false;
    }
}
