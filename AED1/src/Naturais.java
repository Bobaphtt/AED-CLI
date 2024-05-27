public class Naturais {
    public static String crescente(int n){
        if(n>0){
            return crescente(n-1) + " " + n;
        }else{
            return "0";
        }
    }
    public static String decrescente(int n){
        if(n>0){
            return n + " " + decrescente(n-1);
        }else{
            return "0";
        }
    }
}
