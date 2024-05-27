public class Inteiros {
    public static int inverte(int x, int q){
        if(x>=1){
            return x%10*(int)Math.pow(10,q-1) + inverte(x/10, q-1);
        }else{
            return 0;
        }
    }

    public static String parabinario(int num){
        if(num==0){
            return "";
        }else{
            return parabinario(num/2)+ num%2;
        }
    }

    public static int somadigitos(int x, int q){
        if(x>=1){
            return x%10 + somadigitos(x/10, q-1);
        }else{
            return 0;
        }
    }
}
