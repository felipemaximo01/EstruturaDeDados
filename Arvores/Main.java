package EstruturaDeDados.Arvores;

public class Main {
    public static void main(String args[]){
        Arvore a = new Arvore();
        a.adicionaElemento(25);
        a.adicionaElemento(16);
        a.adicionaElemento(13);
        a.adicionaElemento(18);
        a.adicionaElemento(64);
        a.adicionaElemento(21);
        a.adicionaElemento(39);
        a.adicionaElemento(5);
        a.adicionaElemento(30);
        a.adicionaElemento(92);
        System.out.println("Pré Ordem");
        a.preOrdem(a.getRaiz());
        System.out.println("Pos Ordem");
        a.posOrdem(a.getRaiz());
        System.out.println("Em Ordem");
        a.emOrdem(a.getRaiz());
    }
}
