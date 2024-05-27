public class Fibonacci {
    public static int normal(int n){
        int nanterior = 1;
        int natual = 0;
        int proximon = 0;
        while(n>0){
            proximon = nanterior+natual;
            nanterior = natual;
            natual = proximon;
            n--;
        }
        return proximon;
    }

    static int recursivo(int num){
        if (num<3){
            return 1;
        }else{
            return recursivo(num-1) + recursivo(num-2);
        }
    }
}
