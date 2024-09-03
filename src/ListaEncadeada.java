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

    public void insert (Integer index, Integer elementoNo) {
        Integer size = this.size();

        if (size != null) {
            if (index < size && index >= 0) {
                if (index != 0) {
                    No aux = this.head;
                    for (int i = 0; i < size; i++) {
                        if (index == i) {
                            No novoNo = new No();

                            novoNo.valor = elementoNo;
                            novoNo.proximoNo = aux.proximoNo;

                            aux.proximoNo = novoNo;

                            break;
                        }
                        if (i > 0) {
                            aux = aux.proximoNo;
                        }
                    }
                } else {
                    No novoNo = new No();

                    novoNo.valor = elementoNo;
                    novoNo.proximoNo = this.head;

                    this.head = novoNo;
                }
            } else {
                throw new Excecoes("Indice esta alem do tamanho da Lista ou apresenta numero negativo!");
            }
        } else if (index == 0) {
            this.push(elementoNo);
        } else {
            throw new Excecoes("Elemento não pode ser inserido!");
        }
    }

    public void printList () {
        Integer size = this.size();

        if (size != null) {
            No aux = this.head;

            while (true) {
                if (aux == this.tail) {
                    System.out.println(aux.valor);
                    break;
                }
                System.out.println(aux.valor);
                aux = aux.proximoNo;
            }
        } else {
            System.out.println("Lista sem elementos!");
        }
    }

    public Integer elementAt (Integer index) {
        Integer size = this.size();

        if (size != null) {
            if (index < size && index >= 0) {
                No aux = this.head;
                for (int i = 0; i < size; i++) {
                    if (i == index) {
                        return aux.valor;
                    }
                    aux = aux.proximoNo;
                }
            } else {
                throw new Excecoes("Indice esta alem do tamanho da Lista ou apresenta numero negativo!");
            }
        } else {
            throw new Excecoes("Lista de tamannho nulo, impossivel printar elementos!");
        }
        return null;
    }

    public void remove (Integer index) {
        Integer size = this.size();

        if (size != null) {
            if (index < size && index > 0) {
                No aux = this.head;
                for (int i = 0; i < size; i++) {
                   if (i == index && index == size - 1) {
                       this.tail = aux;
                       break;
                   } else if (i == index) {
                       aux.proximoNo = aux.proximoNo.proximoNo;
                       break;
                   }

                    if (i != 0) {
                        aux = aux.proximoNo;
                    }
                }
            } else if (index == 0) {
                this.head = this.head.proximoNo;
            } else {
                throw new Excecoes("Indice esta alem do tamanho da Lista ou apresenta numero negativo!");
            }
        } else {
            throw new Excecoes("Lista de tamannho nulo, impossivel remover elementos!");
        }
    }
}
