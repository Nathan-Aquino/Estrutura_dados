public class Main {
    public static void main(String[] args) {
        ListaEncadeada listaEncadeada = new ListaEncadeada();

        listaEncadeada.push(1);
        listaEncadeada.push(2);
        listaEncadeada.push(3);

        //System.out.println(listaEncadeada.size());

        System.out.println(listaEncadeada.pop());
        System.out.println(listaEncadeada.pop());
        listaEncadeada.push(8);
        System.out.println(listaEncadeada.pop());
        System.out.println(listaEncadeada.size());
//
//        listaEncadeada.push(1);


    }
}
