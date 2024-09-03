public class Main {
    public static void main(String[] args) {
        ListaEncadeada listaEncadeada = new ListaEncadeada();

        System.out.println();
        listaEncadeada.printList();

        listaEncadeada.push(1);
        listaEncadeada.push(2);
        listaEncadeada.push(3);

        //System.out.println(listaEncadeada.size());
        System.out.println();
        listaEncadeada.printList();

        listaEncadeada.insert(0,5);

        //System.out.println(listaEncadeada.size());
        System.out.println();
        listaEncadeada.printList();

//        System.out.println();
//        System.out.println(listaEncadeada.elementAt(2));

        listaEncadeada.remove(1);
        listaEncadeada.insert(1,10);
        System.out.println();
        listaEncadeada.printList();
    }
}
