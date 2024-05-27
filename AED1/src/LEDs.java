public class LEDs {
    private Celula head;
    private int tail;
    private int size;
    class Celula{
        int item;
        Celula next;
        public Celula(int item, Celula c){
            this.item = item;
            this.next = c;
        }

    }
    public void insere(int item){
        if(head == null){
            head = new Celula(item,null);
        }else{
            Celula c = this.head;
            Celula atual = head;
            while(atual.next != null){
                atual = atual.next;
            }
            atual.next = new Celula(item, null);
        }
    }
    public int remove(int item){
        return 0;
    }

    @Override
    public String toString(){
        String s = "[ ";
        Celula atual = head;
        while(atual != null){
            s = s + atual.item + ", ";
            atual = atual.next;
        }
        s = s + " ]";
        return s;
    }

    public static void main(String[] args) {
        LEDs lista = new LEDs();
        System.out.println(lista);
        lista.insere(1);
        lista.insere(2);
        System.out.println(lista);
        lista.insere(4);
        lista.insere(5);
        lista.insere(6);
        System.out.println(lista);
    }
}
