public class MDC {
    static int recursivo(int a, int b){
        if (a != b){
            if (a>b){
                return recursivo(a - b, b);
            }else {
                return recursivo(b-a,a);
            }
        }else{
            return a;
        }
    }
}
