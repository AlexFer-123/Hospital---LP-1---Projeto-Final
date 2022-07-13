
public class Exame{
    protected String descricao;
    protected double valor;
    protected int codigo;
    public Exame(String descricao, double valor, int codigo){
        this.descricao=descricao;
        this.valor=valor;
        this.codigo=codigo;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor=valor;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;        
    }
    public String toString() {
        String a;
        a = ("Descrição : "+getDescricao()+"\n"+"Valor : "+getValor()+"\n"+"Codigo : "+getCodigo()+"\n");
        return a;
    }
}
