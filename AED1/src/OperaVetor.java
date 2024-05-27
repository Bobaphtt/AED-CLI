public class OperaVetor {
    public static int maior(int[] v, int tamanho, int maior){
        if(tamanho>0){
            if (v[tamanho-1] > maior){
                return maior(v,tamanho-1,v[tamanho-1]);
            }else{
                return maior(v,tamanho-1,maior);
            }
        }else{
            return maior;
        }
    }

    public static int menor(int[] v, int tamanho, int menor){
        if(tamanho>0){
            if (v[tamanho-1] < menor){
                return menor(v,tamanho-1,v[tamanho-1]);
            }else{
                return menor(v,tamanho-1,menor);
            }
        }else{
            return menor;
        }
    }
    static long soma(int[] v,int limite){
        if(limite > 0){
            return v[limite] + soma(v,limite-1);
        }else{
            return v[0];
        }
    }
}
