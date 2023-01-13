package EstruturaDeDados.Arvores;

public class Arvore {
    private No raiz;

    public Arvore() {
        raiz = null;
    }

    public void adicionaElemento(int e) {
        No novo = new No(e);
        if (raiz == null) {
            raiz = novo;
        } else {
            No aux1 = raiz, aux2 = raiz;
            while (aux1 != null) {
                aux2 = aux1;
                if (e < aux1.elemento)
                    aux1 = aux1.esquerda;
                else if (e > aux1.elemento)
                    aux1 = aux1.direita;
            }
            if (e == aux2.elemento)
                System.out.println("elemento já existe");
            else {
                if (e < aux2.elemento)
                    aux2.esquerda = novo;
                if (e > aux2.elemento)
                    aux2.direita = novo;
                System.out.println("Elemento Incluido");
            }
        }
    }

    public void verifica(int e) {
        No aux = raiz;
        while (aux != null) {
            if (e < aux.elemento)
                aux = aux.esquerda;
            else if (e > aux.elemento)
                aux = aux.direita;
            else
                System.out.println("Elemento repetido");
        }
    }

    public void preOrdem(No n) {
        if (n != null) {
            System.out.println(n.elemento);
            preOrdem(n.esquerda);
            preOrdem(n.direita);
        }
    }

    public void emOrdem(No n) {
        if (n != null) {
            emOrdem(n.esquerda);
            System.out.println(n.elemento);
            emOrdem(n.direita);
        }
    }

    public void posOrdem(No n) {
        if (n != null) {
            posOrdem(n.esquerda);
            posOrdem(n.direita);
            System.out.println(n.elemento);
        }
    }

    public int soma(No n) {
        if (n != null) {
            return n.elemento + soma(n.esquerda) + soma(n.direita);
        }
        return 0;
    }

    public No getRaiz(){
        No raiz = this.raiz;
        return raiz;
    }
}
