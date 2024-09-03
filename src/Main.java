public class Main {
    public static void main(String[] args) {

        // Complexidade de Espaço: O(n)
        Pilha pilha = new Pilha();

        // Complexidade de tempo do metodo push: O(1)
        pilha.push(5);

        // Complexidade de tempo do metodo pop: O(1)
        pilha.pop();

        // Complexidade de Espaço: O(n)
        Fila fila = new Fila();

        // Complexidade de tempo do metodo enqueue: O(1)
        fila.enqueue(5);

        // Complexidade de tempo do metodo dequeue: O(1)
        fila.dequeue();

        // Complexidade de tempo do metodo rear: O(1)
        fila.rear();

        // Complexidade de tempo do metodo front: O(1)
        fila.front();

        // Complexidade de Espaço: O(n)
        ListaEncadeada listaEncadeada = new ListaEncadeada();

        // Complexidade de tempo do metodo push: O(1)
        listaEncadeada.push(1);
        listaEncadeada.push(2);
        listaEncadeada.push(3);

        // Complexidade de tempo do metodo pop: O(1)
        listaEncadeada.pop();

        // Complexidade de tempo do metodo insert: melhor dos casos O(1), demais casos (que não seja ou o tail ou head) O(n)
        listaEncadeada.insert(0,5);

        // Complexidade de tempo do metodo remove: melhor dos casos O(1), demais casos (que não seja ou o tail ou head) O(n)
        listaEncadeada.remove(1);

        // Complexidade de tempo do metodo remove: O(n)
        listaEncadeada.elementAt(2);
    }
}
