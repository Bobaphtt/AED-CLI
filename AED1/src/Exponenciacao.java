public class Exponenciacao {
    public static long exponenciacao(int x, int y){
        if(y>1){
            return exponenciacao(x,y-1)*x;
        }else{
            return x;
        }
    }
}
