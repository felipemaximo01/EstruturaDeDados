package EstruturaDeDados.PilhasFilas;

public class Filas{
    int dados[];
    int tamanho = 0;

    public Filas(int c){
        dados = new int[c];
    }
    public boolean cheia(){
        if(dados.length==tamanho){
            return true;
        }
        return false;
    }
    public boolean vazia(){
        if(if tamanho == 0){
            System.out.println("ERRO! Fila Vazia");
            return true;
        }
        return false;
    }
    public void adiciona(int e){
        if(cheia()){
            System.out.println("ERRO! Fila Cheia");
        }
        else{
            dados[tamanho] = e;
            tamanho++;
            }
        }
    }
    public int remova() throw Exception{
        if(vazia()){
            throw new Exception("ERRO! Fila Vazia");
        }
        else{
            int r;
            r = dados[0];
                for(int i = 0; i<tamanho; i++){
                    dados[i] = dados[i+1];
                }
                return r;
        }
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
}