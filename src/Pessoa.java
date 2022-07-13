public abstract class Pessoa {
    protected String nome, cpf;
    protected int idade;
    protected Endereco end;
    public Pessoa(String nome,String cpf,int idade, Endereco end){
        this.nome=nome;
        this.cpf=cpf;
        this.idade=idade;
        this.end=end;
    }
    public abstract String Relatorio();

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }

}
