public class ListaEncadeada {
    private No head;
    private No tail;

    ListaEncadeada (){
        this.head = null;
        this.tail = null;

    }

    public void push (int numero) {
        No novoNo = new No();
        novoNo.valor = numero;
        No auxNo = null;

        if (this.tail != null) {
            auxNo = this.tail;
        }

        this.tail = novoNo;

//        if (this.head != null) {
//            No aux = this.head;
//            while (true) {
//                if (aux.proximoNo != null) {
//                    aux = aux.proximoNo;
//                } else {
//                    aux.proximoNo = novoNo;
//                    break;
//                }
//            }
//        }

        if (this.head == null) {
            this.head = novoNo;
        }

        if (this.head == auxNo) {
            this.head.proximoNo = this.tail;
        } else {
            if (auxNo != null) {
                auxNo.proximoNo = this.tail;
            }
        }

    }

    public Integer pop () {
        if (this.tail != null) {
            int valor = this.tail.valor;

            No aux = this.head;
            while (true) {
                if (aux.proximoNo != null) {
                    if (aux.proximoNo == this.tail) {
                        aux.proximoNo = null;
                        break;
                    }
                    aux = aux.proximoNo;
                } else {
                    break;
                }
            }

            if (this.head == this.tail) {
                this.head = null;
                aux = null;
            }

            this.tail = aux;

            return valor;

        }

        return null;
    }

    public Integer size () {
        if (this.head != null) {
            int soma = 0;

            No aux = this.head;
            while (true) {
                soma++;
                if (aux.proximoNo != null) {
                    aux = aux.proximoNo;
                } else {
                    break;
                }
            }

            return soma;
        }
        return null;
    }
}
