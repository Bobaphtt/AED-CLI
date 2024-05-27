public class Palindromo {
    public static boolean recursivo(String p, int n){
        if(n<=p.length()/2){
            return p.charAt(n) == p.charAt(p.length()-n-1) && recursivo(p, n+1);
        }else{
            return true;
        }
    }
}
