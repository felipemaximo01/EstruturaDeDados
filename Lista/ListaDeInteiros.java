package EstruturaDeDados.Lista;

public class ListaDeInteiros {
    int dados[];
    int tamanho = 0;
    
    public ListaDeInteiros(int capMax){
        dados = new int[capMax];
    }
    public boolean vazia(){
        if(tamanho == 0){
            return true;
        }
        return false;

    }
    public boolean cheia(){
        if(dados.length == tamanho){
            return true;
        }
        return false;
    }
    public void adicionaInicio(int e) throws Exception{
        if(dados.length !=tamanho){
            for(int i = tamanho; i>=1; i--){
                dados[i] = dados [i-1];
            }
            dados[0] = e;
            tamanho = tamanho +1;
        }
        else{
            throw new Exception("ERRO! lista cheia");
        }

    }
    public void adicionaFinal(int e) throws Exception{
        if(dados.length != tamanho){
            dados[tamanho] = e;
            tamanho++;
        }
        else{
            throw new Exception("ERRO! Lista Cheia");
        }
    }
    public void adiciona(int e, int posicao){
        if(posicao>=0 && posicao<tamanho){
            System.out.println("ERRO! posição inválida");
        }
        else{
            dados[posicao] = e;
        }
    }
    public int removeInicio() throws Exception{
        int r;
        r = dados[0];
        if(tamanho !=0){
            for(int i = 0; i<tamanho; i++){
                dados[i] = dados[i+1];
            }
            return r;
        }
        else{
            throw new Exception("ERRO! Lista Vazia");
        }
    }
    public int removeFinal() throws Exception{
        if (tamanho !=0){
            tamanho--;
            return dados[tamanho];
        }
        else{
            throw new Exception("ERRO! lista vazia");
        }
    }
    public int remove(int posicao){
        int r = 0;
        return r;
    }
    public int obtemPrimeiro(){
        return dados[0];

    }
    public int obtemUltimo(){
        return dados[tamanho-1];
    }
    public int obtemTamanho(){
        return tamanho;
    }
    public String toString(){
        String r = "";
        for (int i = 0; i < tamanho; i++){
            r = r + dados[i] + "\t";
        }
        r = r + "Quantidade de Elementos: "+tamanho;
        return r;
     }
}
