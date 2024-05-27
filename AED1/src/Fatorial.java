public class Fatorial {
    static long recursivo(int n){
        if (n<0) throw new IllegalArgumentException(">0");
        if(n>0){
            return n * recursivo(n-1);
        } else {
            return 1;
        }
    }
    static long normal(int n){
        int fatorial = 1;
        for (int i = n; i > 0; i--){
            fatorial *= i;
        }
        return fatorial;
    }
}
