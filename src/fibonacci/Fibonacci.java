package fibonacci;

public class Fibonacci {
    public static boolean pertenceSequencia(int num) {
        int anterior = 0, atual = 1;

        while (atual <= num) {
            if (atual == num) return true;

            atual = anterior + (anterior = atual);
        }

        return false;
    }

    public static void main(String[] args) {
        int num = 34;
        if (pertenceSequencia(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
            return;
        }
            System.out.println(num + " não pertence à sequência de Fibonacci.");
    }
}