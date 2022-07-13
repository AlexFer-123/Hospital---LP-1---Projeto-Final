import java.util.ArrayList;

public class Repositorio {
    ArrayList<Pessoa> Meajuda;
    int indice;
    public Repositorio(){
        Meajuda = new ArrayList<>();
    }
    public void inserir(Pessoa velho){
            Meajuda.add(velho);
            App.indice++;
    }
    public void remover(String numero){
        for(int i=0; i < App.indice; i++){
            if(Meajuda.get(i).getCpf().equals(numero)){
                Meajuda.remove(i);
                App.indice--;
            }
        }
    }
    public String procurar(String numero){
        for(int i = 0; i < App.indice; i++){
            if(Meajuda.get(i).getCpf().equals(numero)){
                App.a =(" ");
                App.a = (App.a + Meajuda.get(i).Relatorio());
            }
        }
        return App.a;
    }
    public boolean alterarM(String numero){
        for(int i = 0; i < App.indice; i++){
            if(Meajuda.get(i).getCpf().equals(numero)){
                App.b = i;
                return true;
            }
        }
        return false;
    }
    public boolean alterarP(String numero){
        for(int i = 0; i < App.indice; i++){
            if(Meajuda.get(i).getCpf().equals(numero)){
                App.b = i;
                return true;
            }
        }
        return false;
    }
    public String imprimir(int indice){ 
        App.a =(" ");
        App.a = ((App.a+"\n") + Meajuda.get(indice).Relatorio());
        return App.a;
    }
    public String imprimirD(){ 
        App.a =(" ");
        App.i++;
        App.a = ((App.a+"\n") + Meajuda.get(App.i).Relatorio());

        return App.a;
    }
    public String imprimirE(){ 
        App.a =(" ");
        App.i--;
        App.a = ((App.a+"\n") + Meajuda.get(App.i).Relatorio());
        return App.a;
    }
    public void inserirA(Pessoa velho){
        Meajuda.set(App.b,velho);
    }
}
