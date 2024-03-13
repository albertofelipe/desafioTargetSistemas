package soma;

public class Soma {

    public static int getSoma(){
        int indice = 13, soma = 0, K = 0;

        while (K < indice){
            K++;
            soma += K;
        }
        return soma;
    }

    public static void main(String[] args) {
        System.out.println(getSoma());
    }
}
