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