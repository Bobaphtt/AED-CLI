public class SomaCubos {
    public static long somacubos(long n){
        if(n>1){
            return (long)Math.pow(n,3) + somacubos(n-1);
        }else{
            return 1;
        }
    }
}
