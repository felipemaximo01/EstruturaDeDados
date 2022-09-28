package EstruturaDeDados.PilhasFilas;

public class Pilha {
    private int dados[];
    private int topo = -1;

    public Pilha(int c){
        dados = new int[c];
    }
    public boolean cheia(){
        if(topo == dados.length){
            return true;
        }
        return false;
    }
    public boolean vazia(){
        if(topo == -1){
            return true;
        }
        return false;
    }
    public void empilha(int e){
        if(cheia()){
            System.out.println("ERRO! Pilha cheia");
        }
        else{
            dados[++topo] = e;
        }
    }
    public int desempilha(){
        if(vazia()){
            System.out.println("ERRO! Pilha Vazia");
        }
        else{
            topo--;
        }
        return dados[topo + 1];
    }
    public String toString(){
        String r = "";
        for (int i = 0; i<=topo;i++){
            r = r + dados[i] + "\t";
        }
        r = r + " Quantidade De elementos: " + topo+1;
        return r;
    }
}
