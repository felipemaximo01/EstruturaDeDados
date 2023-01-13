package EstruturaDeDados.ListaLigada;

public class ListaLigada(){
    private No inicio;

    public ListaLigada(){
        inicio = null;
    }
    public void adicionaInicio(int e){
        No novo = new No(e);
        novo.prox = inicio;
        inicio = novo;
    }
    public int removeInicio(){
        int r=-1;
        if (inicio == null){
            System.out.println("erro lista vazia");
        }else{
            r= inicio.dado;
            inicio= inicio.prox;
        }
        return r;
    }
    public void adicionaFinal(int e){
        if(inicio == null){
            inicio = new No(e);
        }
        else{
            No aux = inicio;
            while(aux.prox!=null){
                aux = aux.prox;
            }
            aux.prox = new No(e);
        }
    }
    public int removeFinal(){
        No aux = inicio;
        int r = -1;
        if(inicio!=null){
            if(inicio.prox == null){
                r = inicio.dado;
                inicio = null;
                return r;
            }
            while(aux.prox.prox!=null){
                aux = aux.prox;
            }
        r = aux.prox.dado;
        aux.prox = null;
        }
        else{
            System.out.println("ERRO! Lista Vazia");
        }
        return r;
    }
    public boolean busca(int e){
        No aux= inicio;
        while(aux!=null && aux.dado!=e){
            aux=aux.prox;
        }
        if(aux==null){
          return false;
        }
        
        return true;
    }
    public String percorreLista(No aux){
        if(aux!=null){
          return percorreLista(aux.prox) +" "+ aux.dado;
        }
        return "";
    }
}