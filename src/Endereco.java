
public class Endereco {
    protected String bairro;
    protected int numero, cep;
    public Endereco(String bairro, int numero, int cep){
        this.bairro=bairro;
        this.numero=numero;
        this.cep=cep;
    }

    public String getBairro(){
        return bairro;
    }
    public void setBairro(String bairro){
        this.bairro=bairro;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public int getCep(){
        return cep;
    }
    public void setCep(int cep){
        this.cep=cep;
    }
    @Override
    public String toString() {
        String a;
        a = ("Bairro : "+getBairro()+"\n"+"Numero : "+getNumero()+"\n"+"CPF : "+getCep()+"\n");
        return a;
    }
}
