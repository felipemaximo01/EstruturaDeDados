package EstruturaDeDados.Recursividade;

public class Recursiva{
    public int soma(int N){
        if(N>1){
            return soma(N-1) + N;
        }
        return 1;
    }
    public int fatorial(int N){
        if(N>1){
            return fatorial(N-1) * N;
        }
        return 1;
    }
    public double somaF(int N){
        if(N>=2){
            return somaF(N/2) + 1.0/N;
        }
        return 0;
    }
    public int fibo(int N){
        if(N == 0){
            return 0;
        }
        if(N == 1){
            return 1;
        }
        return fibo(N-1) + fibo(N-2);
    }

}
